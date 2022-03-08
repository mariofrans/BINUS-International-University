import socket
import threading

IP = socket.gethostbyname("localhost")
PORT = 5050
ADDR = (IP, PORT)
SIZE = 1024
FORMAT = "utf-8"
DISCONNECT_MSG = "!BYE"
LIMIT = 2
STARTPLAY = "!PLAY"

clients = []
nicknames = []
playroom = []

def handle_client(conn, addr):
    print(f"[NEW CONNECTION] {addr} connected")
    connected = True
    while connected:
        try:
            msg = conn.recv(SIZE).decode(FORMAT)
            if msg == DISCONNECT_MSG:
                clients.remove(conn)                    
                connected = False
            elif msg == STARTPLAY:
                clients.remove(conn)                    
                playroom.append(conn)
                connected = False
            elif not msg:
                clients.remove(conn)
                connected = False
            broadcast(msg)
        except:
            index = clients.index(conn)
            nickname = nicknames[index]
            broadcast(f'{nickname} has left the room!')
            clients.remove(conn)
            nicknames.remove(nickname)
            conn.close()
            break
        
def send(s, msg):
    s.send(msg.encode(FORMAT))

def broadcast(msg):
    for c in clients:
        send(c, msg)
        
def GAME(conn):
    index = playroom.index(conn)
    nickname = nicknames[index]
    broadcast(f'{nickname} entered the playroom')
    IPR = True
    while IPR:
        try:
            msg = conn.recv(SIZE).decode(FORMAT)
            if msg == DISCONNECT_MSG:
                playroom.remove(conn)
                IPR = False
            broadcast(msg)
        except:
            index = playroom.index(conn)
            nickname = nicknames[index]
            playroom.remove(conn)
            conn.close()
            broadcast(f'{nickname} has left the room!')
            break
    

def main():
    print(f"[STARTING] Server is starting...")
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.bind(ADDR)
    server.listen()
    conns = {server}
    print(f"[LISTENING] Server is listening on {IP}:{PORT}")
    
    while True:
        # Limit the user to only 2 since playing rps
        # For now its only for communication
        if server in conns:
            conn, addr = server.accept()
            conn.send("NICK".encode(FORMAT))
            nickname = conn.recv(SIZE).decode(FORMAT)
            nicknames.append(nickname)
            clients.append(conn)
            print(f'The nickname of the client is {nickname}')
            broadcast(f'{nickname} just join the room')
            conn.send("Connected to the server!".encode(FORMAT))
            if len(clients) > LIMIT:
                clients.remove(conn)
                conn.close()
            if len(playroom) == LIMIT:
                gameThread = threading.Thread(target=GAME, args= (conn,))
                gameThread.start()
        thread = threading.Thread(target=handle_client, args=(conn, addr))
        thread.start()
        print(f"[CONNECTIONS] {threading.activeCount() - 1}")

if __name__ == "__main__":
    main()