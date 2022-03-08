import html
from os import X_OK
import functions
import requests

from telegram import ParseMode

def command_help(update, context):
    link = functions.github_link()
    text = (
        "<b> Welcome to hellolilybot! "
        "You are bored and don't know what to do? "
        "This bot can help you a lot. "
        "You can chat with this artificial intelligence conversation bot.</b> "
        "\n\nMy creators are <a href="">@sunnyjov</a> , <a href="">@lynceusthepotato</a>, muhammadnaufaldi, and <a href="">@rioontelegram</a>"
        
        "\n\n<i>You can also ask about COVID-19 information of all countries all over the world!</i>"
        "\n\n<b>Supported commands:</b>\n"
        "/help\n"
        "/covidglobal\n"
        "/countryname"

         "\n\n<i>Note: </i>"
         "\n<i>1. Please type your country's FULL NAME in SMALL LETTERS only</i>"
         "\n<i>2. If the country's FULL NAME consist of more than one word, please type them altogether WITHOUT any spacing</i>"
         "\n<i>3. Example: /unitedstatesofamerica /newzealand /indonesia</i>"
    )
    update.message.reply_text(text=text, parse_mode=ParseMode.HTML, reply_markup=link)

def command_covidglobal(update, context):
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Global'])
        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: Global'+
        '\nTotal Confirmed: '+str(data['Global']['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Global"]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Global"]["TotalRecovered"])+
        "\nDate: "+data["Global"]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_0(update, context):
    x = 0
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_1(update, context):
    x = 1
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_2(update, context):
    x = 2
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_3(update, context):
    x = 3
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_4(update, context):
    x = 4
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_5(update, context):
    x = 5
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_6(update, context):
    x = 6
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_7(update, context):
    x = 7
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_8(update, context):
    x = 8
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_9(update, context):
    x = 9
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_10(update, context):
    x = 10
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_11(update, context):
    x = 11
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_12(update, context):
    x = 12
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_13(update, context):
    x = 13
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_14(update, context):
    x = 14
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_15(update, context):
    x = 15
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_16(update, context):
    x = 16
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_17(update, context):
    x = 17
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_18(update, context):
    x = 18
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_19(update, context):
    x = 19
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_20(update, context):
    x = 20
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_21(update, context):
    x = 21
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_22(update, context):
    x = 22
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_23(update, context):
    x = 23
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_24(update, context):
    x = 24
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_25(update, context):
    x = 25
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_26(update, context):
    x = 26
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_27(update, context):
    x = 27
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_28(update, context):
    x = 28
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_29(update, context):
    x = 29
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_30(update, context):
    x = 30
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_31(update, context):
    x = 31
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_32(update, context):
    x = 32
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_33(update, context):
    x = 33
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_34(update, context):
    x = 34
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_35(update, context):
    x = 35
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_36(update, context):
    x = 36
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_37(update, context):
    x = 37
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_38(update, context):
    x = 38
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_39(update, context):
    x = 39
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_40(update, context):
    x = 40
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_41(update, context):
    x = 41
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_42(update, context):
    x = 42
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_43(update, context):
    x = 43
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_44(update, context):
    x = 44
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_45(update, context):
    x = 45
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_46(update, context):
    x = 46
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_47(update, context):
    x = 47
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_48(update, context):
    x = 48
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_49(update, context):
    x = 49
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_50(update, context):
    x = 50
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_51(update, context):
    x = 51
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_52(update, context):
    x = 52
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_53(update, context):
    x = 53
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_54(update, context):
    x = 54
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_55(update, context):
    x = 55
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_56(update, context):
    x = 56
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_57(update, context):
    x = 57
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_58(update, context):
    x = 58
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_59(update, context):
    x = 59
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_60(update, context):
    x = 60
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_61(update, context):
    x = 61
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_62(update, context):
    x = 62
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_63(update, context):
    x = 63
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_64(update, context):
    x = 64
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_65(update, context):
    x = 65
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_66(update, context):
    x = 66
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_67(update, context):
    x = 67
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_68(update, context):
    x = 68
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_69(update, context):
    x = 69
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_70(update, context):
    x = 70
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_71(update, context):
    x = 71
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_72(update, context):
    x = 72
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_73(update, context):
    x = 73
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_74(update, context):
    x = 74
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_75(update, context):
    x = 75
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_76(update, context):
    x = 76
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_77(update, context):
    x = 77
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_78(update, context):
    x = 78
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_79(update, context):
    x = 79
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_80(update, context):
    x = 80
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_81(update, context):
    x = 81
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_82(update, context):
    x = 82
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_83(update, context):
    x = 83
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_84(update, context):
    x = 84
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_85(update, context):
    x = 85
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_86(update, context):
    x = 86
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_87(update, context):
    x = 87
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_88(update, context):
    x = 88
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_89(update, context):
    x = 89
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_90(update, context):
    x = 90
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_91(update, context):
    x = 91
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_92(update, context):
    x = 92
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_93(update, context):
    x = 93
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_94(update, context):
    x = 94
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_95(update, context):
    x = 95
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_96(update, context):
    x = 96
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_97(update, context):
    x = 97
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_98(update, context):
    x = 98
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_99(update, context):
    x = 99
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_100(update, context):
    x = 100
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_101(update, context):
    x = 101
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_102(update, context):
    x = 102
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_103(update, context):
    x = 103
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_104(update, context):
    x = 104
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_105(update, context):
    x = 105
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_106(update, context):
    x = 106
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_107(update, context):
    x = 107
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_108(update, context):
    x = 108
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_109(update, context):
    x = 109
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_110(update, context):
    x = 110
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_111(update, context):
    x = 111
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_112(update, context):
    x = 112
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_113(update, context):
    x = 113
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_114(update, context):
    x = 114
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_115(update, context):
    x = 115
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_116(update, context):
    x = 116
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_117(update, context):
    x = 117
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_118(update, context):
    x = 118
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_119(update, context):
    x = 119
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_120(update, context):
    x = 120
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_121(update, context):
    x = 121
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_122(update, context):
    x = 122
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_123(update, context):
    x = 123
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_124(update, context):
    x = 124
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_125(update, context):
    x = 125
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_126(update, context):
    x = 126
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_127(update, context):
    x = 127
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_128(update, context):
    x = 128
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_129(update, context):
    x = 129
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_130(update, context):
    x = 130
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_131(update, context):
    x = 131
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_132(update, context):
    x = 132
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_133(update, context):
    x = 133
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_134(update, context):
    x = 134
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_135(update, context):
    x = 135
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_136(update, context):
    x = 136
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_137(update, context):
    x = 137
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_138(update, context):
    x = 138
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_139(update, context):
    x = 139
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_140(update, context):
    x = 140
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_141(update, context):
    x = 141
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_142(update, context):
    x = 142
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_143(update, context):
    x = 143
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_144(update, context):
    x = 144
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_145(update, context):
    x = 145
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_146(update, context):
    x = 146
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_147(update, context):
    x = 147
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_148(update, context):
    x = 148
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_149(update, context):
    x = 149
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_150(update, context):
    x = 150
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_151(update, context):
    x = 151
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_152(update, context):
    x = 152
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_153(update, context):
    x = 153
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_154(update, context):
    x = 154
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_155(update, context):
    x = 155
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_156(update, context):
    x = 156
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_157(update, context):
    x = 157
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_158(update, context):
    x = 158
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_159(update, context):
    x = 159
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_160(update, context):
    x = 160
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_161(update, context):
    x = 161
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_162(update, context):
    x = 162
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_163(update, context):
    x = 163
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_164(update, context):
    x = 164
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_165(update, context):
    x = 165
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_166(update, context):
    x = 166
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_167(update, context):
    x = 167
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_168(update, context):
    x = 168
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_169(update, context):
    x = 169
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_170(update, context):
    x = 170
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_171(update, context):
    x = 171
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_172(update, context):
    x = 172
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_173(update, context):
    x = 173
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_174(update, context):
    x = 174
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_175(update, context):
    x = 175
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_176(update, context):
    x = 176
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_177(update, context):
    x = 177
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_178(update, context):
    x = 178
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_179(update, context):
    x = 179
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_180(update, context):
    x = 180
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_181(update, context):
    x = 181
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_182(update, context):
    x = 182
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_183(update, context):
    x = 183
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_184(update, context):
    x = 184
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_185(update, context):
    x = 185
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_186(update, context):
    x = 186
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_187(update, context):
    x = 187
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_188(update, context):
    x = 188
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")

def command_189(update, context):
    x = 189
    response = requests.get('https://api.covid19api.com/summary')
    if (response.status_code == 200):  # Everything went okay, we have the data
        data = response.json()
        print(data['Countries'][x])

        context.bot.send_message(chat_id=update.effective_chat.id, text=
        'Country: '+data['Countries'][x]['Country']+
        '\nTotal Confirmed: '+str(data['Countries'][x]['TotalConfirmed'])+
        "\nTotal Deaths: "+str(data["Countries"][x]["TotalDeaths"])+
        "\nTotal Recovered: "+str(data["Countries"][x]["TotalRecovered"])+
        "\nDate: "+data["Countries"][x]["Date"])
    else:  # something went wrong
        context.bot.send_message(chat_id=update.effective_chat.id, text="Error, something went wrong.")






















