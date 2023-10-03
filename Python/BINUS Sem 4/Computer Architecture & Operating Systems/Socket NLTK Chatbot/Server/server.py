import socket 
import threading

import requests
import json
import torch
import random
from model import NeuralNet
from nltk_utils import bag_of_words, tokenize

HEADER_LEN = 64
PORT = 1234
# SERVER = "192.168.0.5"
SERVER = socket.gethostbyname("localhost")
ADDR = (SERVER, PORT)
FORMAT = 'utf-8'
DISCONNECT_MESSAGE = "!DISCONNECT"

countries = []

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(ADDR)

def covidData(x):
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):
        data = response.json()
        text = ('Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
        return text

def covidGlobal():
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):
        data = response.json()
        text = ('\nCountry: Global'+
        'Total Confirmed: '+str(data['Global']['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Global"]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Global"]["TotalRecovered"])+
        "\nDate: "+data["Global"]["Date"])
        return text

def analyseUserResponse(userResponse):

    punctuations = ['.', '?', '!']
    
    for char in userResponse:
        for punctuation in punctuations:
            if char==punctuation:
                userResponse = userResponse.replace(char, '')

    userResponse = userResponse.split(" ")

    checkCountry = False
    checkGlobal = False
    tempCountry = []

    for word in userResponse:
        for country in countries:
            for words in country:
                if word==words:
                    tempCountry.append(word)
            tempCountry = list(dict.fromkeys(tempCountry))
            for country in countries:
                if tempCountry==country:
                    checkCountry=True
        if word=='global':
            checkGlobal = True

    if checkCountry==True:
        return covidData(countries.index(tempCountry))
    elif checkGlobal==True:
        return covidGlobal()
    else:
        # use nltk to chat
        spacing = " "
        userResponse = spacing.join(userResponse)

        device = torch.device('cuda' if torch.cuda.is_available() else 'cpu')

        with open('files/intentsTerminal.json', 'r') as json_data:
            intents = json.load(json_data)

        FILE = "files/dataTerminal.pth"
        data = torch.load(FILE)

        input_size = data["input_size"]
        hidden_size = data["hidden_size"]
        output_size = data["output_size"]
        all_words = data['all_words']
        tags = data['tags']
        model_state = data["model_state"]

        model = NeuralNet(input_size, hidden_size, output_size).to(device)
        model.load_state_dict(model_state)
        model.eval()

        while True:
            userResponse = tokenize(userResponse)
            # print(userResponse)
            X = bag_of_words(userResponse, all_words)
            X = X.reshape(1, X.shape[0])
            X = torch.from_numpy(X).to(device)

            output = model(X)
            _, predicted = torch.max(output, dim=1)

            tag = tags[predicted.item()]

            probs = torch.softmax(output, dim=1)
            prob = probs[0][predicted.item()]
            if prob.item() > 0.75:
                for intent in intents['intents']:
                    if tag == intent["tag"]:
                        return f"{random.choice(intent['responses'])}"
            else:
                return "I do not understand..."

def filterCountryWords(countries):
    for country in countries:
        for word in country:
            if word=='the':
                country.remove(word)
    for country in countries:
        for word in country:
            if word=='and':
                country.remove(word)
    return countries

def handle_client(conn, addr):
    # New connection
    print("\n"+"A user has connected")
    connected = True
    # If connected
    while connected:
        # Validation message size
        msg_length = conn.recv(HEADER_LEN).decode(FORMAT)

        # If ok
        if msg_length:
            msg_length = int(msg_length)
            msg = conn.recv(msg_length).decode(FORMAT)

            # If msg is disconnect cmd
            if msg == DISCONNECT_MESSAGE:
                connected = False
                print("\n"+"A User has disconnected")
                conn.send(str("!DISCONNECT").encode(FORMAT))
                break

            print("\n"+f"[{addr}] {msg}")

            # get output
            output = analyseUserResponse(msg)
            # Print output on server
            print("\n"+f"To: [{addr}] {output}")
            # Send output to client
            conn.send(str(output).encode(FORMAT))
            # conn.send("Msg received".encode(FORMAT))
    conn.close()
        
def start():
    server.listen()
    print("\n"+f"Server is listening on {SERVER}")
    while True:
        conn, addr = server.accept()
        thread = threading.Thread(target=handle_client, args=(conn, addr))
        thread.start()
        print("\n"+f"[ACTIVE CONNECTIONS] {threading.activeCount() - 1}")


# driver code
response = requests.get('https://api.covid19api.com/summary')
data = response.json()

for i in range(192): 
    country = data['Countries'][i]['Country'].lower()
    country = country.split(" ")

    if(country == ['brunei', 'darussalam']):
        country = ['brunei']
    elif(country == ['congo', '(brazzaville)']):
        country = ['congo', 'brazzaville']
    elif(country == ['congo', '(kinshasa)']):
        country = ['congo', 'kinshasa']
    elif(country == ['côte', "d'ivoire"]):
        country = ['cote', 'd', 'ivoire']
    elif(country == ['guinea-bissau']):
        country = ['guinea', 'bissau']
    elif(country == ['holy', 'see', '(vatican', 'city', 'state)']):
        country = ['vatican', 'city']
    elif(country == ['iran,', 'islamic', 'republic', 'of']):
        country = ['iran']
    elif(country == ['korea', '(south)']):
        country = ['south', 'korea']
    elif(country == ['lao', 'pdr']):
        country = ['laos']
    elif(country == ['macedonia,', 'republic', 'of']):
        country = ['macedonia']
    elif(country == ['micronesia,', 'federated', 'states', 'of']):
        country = ['micronesia']
    elif(country == ['palestinian', 'territory']):
        country =  ['palestine']
    elif(country == ['republic', 'of', 'kosovo']):
        country = ['kosovo']
    elif(country == ['russian', 'federation']):
        country = ['russia']
    elif(country == ['saint', 'vincent', 'and', 'grenadines']):
        country = ['saint', 'vincent', 'and', 'the', 'grenadines']
    elif(country == ['syrian', 'arab', 'republic', '(syria)']):
        country = ['syria']
    elif(country == ['taiwan,', 'republic', 'of', 'china']):
        country = ['taiwan']
    elif(country == ['tanzania,', 'united', 'republic', 'of']):
        country = ['tanzania']
    elif(country == ['timor-leste']):
        country = ['timor', 'leste']
    elif(country == ['venezuela', '(bolivarian', 'republic)']):
        country = ['venezuela']
    elif(country == ['viet', 'nam']):
        country = ['vietnam']

    countries.append(country)

countries = filterCountryWords(countries)

start()
