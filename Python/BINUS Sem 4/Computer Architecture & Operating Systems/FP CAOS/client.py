import tkinter as tk
from tkinter import messagebox
import socket
import threading

# Server config
SIZE = 1024
PORT = 5050
FORMAT = 'utf-8'
DISCONNECT_MESSAGE = "!DISCONNECT"
IP = socket.gethostbyname("localhost")
ADDR = (IP, PORT)

client = None
clientNickname = ""
Messages = []

window = tk.Tk()
window.title("Client")

#Top Frame
topFrame = tk.Frame(window)
labelName = tk.Label(topFrame, text = clientNickname).pack(side=tk.LEFT)
Name = tk.Entry(topFrame)
Name.pack(side=tk.LEFT)
btnConnect = tk.Button(topFrame, text="Connect", command=lambda : connect())
btnConnect.pack(side=tk.LEFT)
topFrame.pack(side=tk.TOP)

#Middle Frame
middleFrame = tk.Frame(window)
scrollBar = tk.Scrollbar(middleFrame)
scrollBar.pack(side=tk.RIGHT, fill=tk.Y)
tkDisplay = tk.Text(middleFrame, height=20, width=55)
tkDisplay.pack(side=tk.LEFT, fill=tk.Y, padx=(5, 0))
scrollBar.config(command=tkDisplay.yview)
tkDisplay.config(yscrollcommand=scrollBar.set, background="white", highlightbackground="grey", state="disabled")
middleFrame.pack(side=tk.TOP)

#Bottom Frame
bottomFrame = tk.Frame(window)
tkMsg = tk.Text(bottomFrame, height=2, width=55)
tkMsg.pack(side=tk.LEFT, padx=(5, 13), pady=(5, 10))
tkMsg.config(highlightbackground="grey", state="disabled")
tkMsg.bind("<Return>", (lambda event: write(tkMsg.get("1.0", tk.END))))
bottomFrame.pack(side=tk.BOTTOM)

def connect():
    global clientNickname
    if len(Name.get()) < 1:
        tk.messagebox.showerror(title="Error", message="You must enter your name")
    else:
        clientNickname = Name.get()
        main()
        

def recieveMsg(client):
    connected = True
    while connected:
        try:
            msg = client.recv(SIZE).decode(FORMAT)
            if msg == 'NICK':
                client.send(clientNickname.encode(FORMAT))
            elif msg == DISCONNECT_MESSAGE:
                connected = False
                client.close()
                window.destroy()
                break
            else:
                texts = tkDisplay.get("1.0", tk.END).strip()
                tkDisplay.config(state=tk.NORMAL)
                if len(texts) < 1:
                    tkDisplay.insert(tk.END, msg)
                else:
                    tkDisplay.insert(tk.END, "\n\n"+ msg)

                tkDisplay.config(state=tk.DISABLED)
                tkDisplay.see(tk.END)
                print(msg)
        except:
            client.close()
            window.destroy()
            break

def write(msg):
    tkMsg.delete("1.0", tk.END)
    msg = msg.replace('\n', ' ')
    texts = tkDisplay.get("1.0", tk.END).strip()
    
    tkDisplay.config(state=tk.NORMAL)
    if len(texts) < 1:
        tkDisplay.insert(tk.END, "You->" + msg) # no line
    else:
        tkDisplay.insert(tk.END, "\n\n" + "You->" + msg)

    tkDisplay.config(state=tk.DISABLED)

    send_mssage(msg)

    tkDisplay.see(tk.END)
    tkMsg.delete('1.0', tk.END)

def send_mssage(msg):
    # while True:
    #     # msg = f'{clientNickname}: {input("")}'
    #     msg = input("> ")
    #     # print (msg)
    #     if msg == DISCONNECT_MESSAGE:
    #         client.close()
    #         break
    #     client.send(msg.encode(FORMAT))
    if msg == DISCONNECT_MESSAGE:
        client.close()
        window.destroy()
    client.send(msg.encode(FORMAT))
           
def main():
    global client
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect(ADDR)
    # print(F"[CONNECTED] Client is connected to {IP}:{PORT}")
    Name.config(state=tk.DISABLED)
    btnConnect.config(state=tk.DISABLED)
    tkMsg.config(state=tk.NORMAL)
    recieve = threading.Thread(target = recieveMsg, args=(client,))
    # writes = threading.Thread(target= send_mssage,args=(client,))
    recieve.start()
    # writes.start()

window.mainloop()