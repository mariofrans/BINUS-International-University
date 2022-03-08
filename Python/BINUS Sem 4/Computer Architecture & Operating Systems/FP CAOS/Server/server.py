import socket 
import threading
import tkinter as tk
from svm import getOutput, svm

# Server config
server = None
# HEADER_LEN = 64
SIZE = 1024
PORT = 5050
FORMAT = 'utf-8'
DISCONNECT_MESSAGE = "!DISCONNECT"
IP = socket.gethostbyname("localhost")
ADDR = (IP, PORT)

#GUI Thingy
window = tk.Tk()
window.title("The server")

# TOP PART
topFrame = tk.Frame(window)
btnStart = tk.Button(topFrame, text="Connect", command=lambda : start())
btnStart.pack(side=tk.LEFT)
btnStop = tk.Button(topFrame, text="Stop", command=lambda : stop(), state=tk.DISABLED)
btnStop.pack(side=tk.LEFT)
topFrame.pack(side=tk.TOP, pady=(5, 0))

# MIDDLE PART 
middleFrame = tk.Frame(window)
hostLabel = tk.Label(middleFrame, text = f'HOST: {IP}')
hostLabel.pack(side=tk.LEFT)
portLabel = tk.Label(middleFrame, text = f'PORT: {PORT}')
portLabel.pack(side=tk.LEFT)
middleFrame.pack(side=tk.TOP, pady=(5, 0))

# BOTTOM PART
boxFrame = tk.Frame(window)
CLLabel = tk.Label(boxFrame, text="---CLIENT LIST---")
scrollBar = tk.Scrollbar(boxFrame)
scrollBar.pack(side=tk.RIGHT, fill=tk.Y)
tkDisplay = tk.Text(boxFrame, height=15, width=30)
tkDisplay.pack(side=tk.LEFT, fill=tk.Y, padx=(5, 0))
scrollBar.config(command=tkDisplay.yview)
tkDisplay.config(yscrollcommand=scrollBar.set, background="#F4F6F7", highlightbackground="grey", state="disabled")
boxFrame.pack(side=tk.BOTTOM, pady=(5, 10))

clients = []
nicknames = []

def handle_client(conn, addr):
    # New connection
    print("A user has connected")
    conn.send("NICK".encode(FORMAT))
    nickname = conn.recv(SIZE).decode(FORMAT)
    nicknames.append(nickname)
    updateNOD(nicknames)
    connected = True
    # If connected
    while connected:
        try:
            msg = conn.recv(SIZE).decode(FORMAT)
            if msg == DISCONNECT_MESSAGE:
                connected = False
            tag = svm(msg)
            output = getOutput(tag, msg)
            print(output, tag)
            conn.send(output.encode(FORMAT))
            # Validation message size
            # msg_length = conn.recv(SIZE).decode(FORMAT)

            # # If ok
            # if msg_length:
            #     msg_length = int(msg_length)
            #     msg = conn.recv(msg_length).decode(FORMAT)

            #     # If msg is disconnect cmd
            #     if msg == DISCONNECT_MESSAGE:
            #         connected = False
            #         print("A User has disconnected")
            #         conn.send(str("!DISCONNECT").encode(FORMAT))
            #         break

            #     print(f"[{addr}] {msg}")

            #     # Get tag
            #     tag = svm(msg)
            #     # Get output
            #     output = getOutput(tag, msg)

            #     # Print output on server
            #     print(f"To: [{addr}] {tag}")

            #     # Send output to client
            #     conn.send(str(output).encode(FORMAT))
            #     # conn.send("Msg received".encode(FORMAT))
        except:
            index = clients.index(conn)
            nickname = nicknames[index]
            clients.remove(conn)
            nicknames.remove(nickname)
            conn.close()
            break
        
def start():
    btnStart.config(state=tk.DISABLED)
    btnStop.config(state=tk.NORMAL)
    
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    server.bind(ADDR)
    server.listen()
    
    threading._start_new_thread(acceptClient, (server,))
    
def acceptClient(server):
    while True:
        conn, addr = server.accept()
        clients.append(conn)
        
        thread = threading.Thread(target=handle_client, args=(conn, addr))
        thread.start()
        # print(f"[ACTIVE CONNECTIONS] {threading.activeCount() - 1}")

def stop():
    btnStart.config(state=tk.NORMAL)
    btnStop.config(state=tk.DISABLED)

def updateNOD(name_list):
    tkDisplay.config(state=tk.NORMAL)
    tkDisplay.delete('1.0', tk.END)

    for c in name_list:
        tkDisplay.insert(tk.END, c+"\n")
    tkDisplay.config(state=tk.DISABLED)
    
window.mainloop()