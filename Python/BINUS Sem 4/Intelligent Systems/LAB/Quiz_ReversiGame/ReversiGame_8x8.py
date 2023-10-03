import random

def Move(board, firstMove):

    # lists to store areas that can be placed (double array)
    # columns * rows = j * i
    # adjacent areas, empty areas
    emptyAdjacent = []
    flipOpponent = []
    empty = []

    # create and initialize opponent variable
    opponentNumber = 0

    # override opponent number
    if(firstMove == 1):
        opponentNumber = 2
    elif(firstMove == 2):
        opponentNumber = 1

    for i in range(8):
        for j in range(8):
            # find the empty spots in the board
            # store in "empty" list
            if (board[i][j] == 0):
                empty.append([j, i])

                # for each empty spots, locate the adjacent ones
                # for each adjacent spots, locate the opponent which it is adjacent to
                # store them in their respective lists
                if(i+2<=7):
                    if(board[i+1][j] == opponentNumber and board[i+2][j] == firstMove):
                        emptyAdjacent.append([j, i])
                        flipOpponent.append([j, i+1])
                if (i-2 >= 0):
                    if(board[i-1][j] == opponentNumber and board[i-2][j] == firstMove):
                        emptyAdjacent.append([j, i])
                        flipOpponent.append([j, i-1])
                if (j+2 <= 7):
                    if(board[i][j+1] == opponentNumber and board[i][j+2] == firstMove):
                        emptyAdjacent.append([j, i])
                        flipOpponent.append([j+1, i])
                if (j-2 >= 0):
                    if(board[i][j-1] == opponentNumber and board[i][j-2] == firstMove):
                        emptyAdjacent.append([j, i])
                        flipOpponent.append([j-1, i])

    # test functions
    # print(emptyAdjacent)
    # print(flipOpponent)
    # print(empty)

    # if there are adjacent spots, choose 1 spot
    if(len(emptyAdjacent)>=1):
        print("Player", firstMove, "Move")
        print("===================================")

        checker = random.choice(emptyAdjacent)
        xChecker = checker[0]
        yChecker = checker[1]
        checkerIndex = emptyAdjacent.index(checker)

        opponent = flipOpponent[checkerIndex]
        xOpponent = opponent[0]
        yOpponent = opponent[1]

        # override adjacent spot with player number
        board[yChecker][xChecker] = firstMove

        # override the opponent spot with player number
        board[yOpponent][xOpponent] = firstMove

        # display board
        for i in board:
            print(i)
        print("===================================")

        # next player's turn
        Move(board, opponentNumber)

    # if there are no more possible adjacent spots, pick a random spot
    elif(len(emptyAdjacent)==0):

        # check for a random empty spot
        if(len(empty) >= 1):
            print("Player", firstMove, "Move")
            print("===================================")

            checker = random.choice(empty)
            xChecker = checker[0]
            yChecker = checker[1]

            # override adjacent spot with player number
            board[yChecker][xChecker] = firstMove

            # display board
            for i in board:
                print(i)
            print("===================================")

            # next player's turn
            Move(board, opponentNumber)

        # if there are no random empty spots, then its game over
        elif(len(empty) == 0):
            print("GAME OVER")

            # calculate score & determine winner
            p1_Score = 0
            p2_Score = 0

            for i in board:
                p1_Score = p1_Score + i.count(1)
                p2_Score = p2_Score + i.count(2)

            # display scoring system
            print("Player 1 Score: ", p1_Score)
            print("Player 2 Score: ", p2_Score)
            print("===================================")

            # determine the winner
            if(p1_Score>p2_Score):
                print("Result: Player 1 Wins")
            elif(p2_Score>p1_Score):
                print("Result: Player 2 Wins")
            elif(p1_Score==p2_Score):
                print("Result: Tie")
            print("===================================")


# driver code
def main():

    print("===================================")
    print("Welcome to the CheckerBoard Game")
    print("By: Christensen Mario Frans")
    print("===================================")

    # initial board
    board = [
        [0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 1, 2, 0, 0, 0],
        [0, 0, 0, 2, 1, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 0, 0]
    ]

    # list of players
    players = [1, 2]

    # display initial board
    for i in board:
        print(i)
    print("===================================")

    # randomly choose a player who moves first
    firstMove = random.choice(players)
    print("First Move is Player", firstMove)
    print("===================================")

    # call the function based on the player who moves first
    Move(board, firstMove)


if __name__ == "__main__":
    main()