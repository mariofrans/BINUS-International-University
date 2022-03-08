Title: Multithreading Artificial Intelligence Chatbot

Description:
For our final project, we attempted to create an Artificial Intelligence chatbot through 
the use of socket programming on Python. That is, when the clients are connected to the
server (chatbot), they are able to ask questions specifically about COVID-19, such as what 
it is, as well as its symptoms. Moreover, the server (chatbot) is also able to display the 
live COVID-19 data of countries all over the world, when requested by the user/client.

Tutorial:
1. Install all required libraries listed on the "libraries.txt" file
2. Download the 'punkt' package from nltk (you can uncomment the "# nltk.download('punkt')"
   on line 3 of "nltk_utils.py" file, and run it to download)
3. Go to "output.py" and set the "path" (line 15-19) depending on which operating system 
   you use:
   - If you are using Mac OS, comment line 19
   - If you are using Windows, comment line 16
4. Set the IP Addresses for both "client.py" and "server.py" by changing the "IP" variable to
   a STRING of the computer's IP Address on line 11 and 13 of those files respectively. By 
   default, the IP variable is set to "socket.gethostbyname("localhost")". Both files must be 
   using the same IP Address in order to connect.
5. Run "server.py" file on terminal to start the main server (chatbot)
6. Run "client.py" file on another terminal to start asking questions from your end!

Group Member:
- Christensen Mario Frans
- Muhammad Naufaldi
- Muhammad Lukman Ismail Hanafi

Note:
- If you have trouble trying to run/execute the program, please contact one of our group
  members for assistance, we will be more than happy to assist you
