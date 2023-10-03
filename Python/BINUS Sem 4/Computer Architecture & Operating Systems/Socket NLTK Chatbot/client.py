import socket

HEADER_LEN = 64
PORT = 1234
FORMAT = 'utf-8'
DISCONNECT_MESSAGE = "!DISCONNECT"
SERVER = "127.0.0.1"
ADDR = (SERVER, PORT)

botName = 'Bot'

connected = True
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(ADDR)

def handle(msg):
    message = msg.encode(FORMAT)
    msg_length = len(message)
    send_length = str(msg_length).encode(FORMAT)
    send_length += b' ' * (HEADER_LEN - len(send_length))
    client.send(send_length)
    client.send(message)
    output = client.recv(2048).decode(FORMAT)

    if output == "!DISCONNECT":
        return False
    else:
        print("\n"+botName+": "+output)
        return True

# driver code
print("\nWelcome to your chatbot assistant, my name is "+botName+
    "\nFeel free to ask me any data about COVID-19."
    "\n\nTo exit chatbot, simply type 'exit'")

while connected:
    if not connected:
        break
    userMessage = raw_input("\nYou: ")
    # IF ITS DISCONNECT MESSAGE THEN QUIT?
    connected = handle(userMessage)

print("\nSuccessfully Disconnected!\n")
