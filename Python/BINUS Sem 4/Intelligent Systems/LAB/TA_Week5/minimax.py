
from random import randint
from random import choice
board = ['-' for x in range(9)]

winforms = ([0, 1, 2], [3, 4, 5], [6, 7, 8],
            [0, 3, 6], [1, 4, 7], [2, 5, 8],
            [0, 4, 8], [2, 4, 6])

def showBoard(curBoard):
  for i in range(3):
    print(curBoard[i*3],curBoard[i*3+1],curBoard[i*3+2])
  print()

def checkWinner(curBoard):
  for winform in winforms:
    if curBoard[winform[0]] == curBoard[winform[1]]:
      if curBoard[winform[1]] == curBoard[winform[2]]:
        return curBoard[winform[0]]
    return '-'

def totalMoves(curBoard):
  return sum([curBoard[x] == '-' for x in range(9)])

def minimax(newBoard, i, player):
  newBoard[i] = player
  if not playable(newBoard):
    winner = checkWinner(newBoard)
    if winner == 'X':
      return -1
    else:
      return 1
    return 0
  else:
    if player == 'X':
      bestval = 2
      enemy = 'O'
    else:
      bestval = -2
      enemy = 'X'
    for j in range(9):
      if newBoard[j] == '-':
        minimaxval = minimax(newBoard.copy(), j, enemy)
        if player == 'X':
          if minimaxval < bestval:
            bestval = minimaxval
        else:
          if minimaxval > bestval:
            bestval = minimaxval
    return bestval

def playable(curBoard):
  winner = checkWinner(curBoard)
  if winner != '-':
    return False
  if totalMoves(curBoard) == 0:
    return False
  return True

def play():
  player = 'X'
  while playable(board):    
    if totalMoves(board) == 9:
      move = 4
    else:
      moves = []
      if player == 'X':
        best = 2
      else:
        best = -2
      for i in range(9):
        if board[i] == '-':
          minimaxval = minimax(board.copy(), i, player)
          if player == 'X':
            if minimaxval < best:
              best = minimaxval
              moves = [i]
          else:
            if minimaxval > best:
              best = minimaxval
              moves = [i]
          if minimaxval == best:
            moves.append(i)
      move = choice(moves)
    board[move] = player
    if player == 'X':
      player = 'O'
    else:
      player = 'X'
    showBoard(board)

showBoard(board)
play()