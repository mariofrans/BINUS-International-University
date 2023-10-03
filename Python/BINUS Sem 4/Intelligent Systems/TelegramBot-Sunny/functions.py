from telegram import InlineKeyboardButton, InlineKeyboardMarkup
from telegram import ParseMode

def github_link():
    button = InlineKeyboardButton(
        text = "Source code",
        url = "https://www.google.com/"
    )
    button_list = [[button]]
    link = InlineKeyboardMarkup(button_list)
    return link

def echo_all(update, context):
    chat_id = update.effective_chat.id # get id of the chat
    f_name = update.effective_chat.first_name # first name of bot user
    l_name = update.effective_chat.last_name # last name of bot user
    full_name = f_name + '' + l_name  # Full name of bot user
    out_text = 'Hi {0} {1}! How are you?'.format(f_name, l_name)
    # The print functions are to show the contents of the variables
    # You can remove the print functions
    print(update)
    print('effective_chat ->', update.effective_chat)
    print('chat_id->', chat_id)
    print('bot->', context.bot)

    my_bot = context.bot  # my_bot is an object of type telegram.Bot
    # print(my_bot)
    my_bot.send_message(chat_id, text=out_text)