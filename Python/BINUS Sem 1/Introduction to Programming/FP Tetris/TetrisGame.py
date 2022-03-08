import pygame
import random

pygame.font.init()

file = 'scores.txt'

# GLOBALS VARS

# confgurating the size of the GUI display
s_width = 800
s_height = 700

# confgurating the window of the play area
play_width = 300    # meaning 300 // 10 = 30 width per block
play_height = 600   # meaning 600 // 20 = 30 height per block
block_size = 30     # the size of each tile/grid

# confgurating the location of the game window within the GUI display
top_left_x = (s_width - play_width) // 2     # in the middle of x-axis
top_left_y = s_height - play_height          # aligned with the bottom of the y-axis


# SHAPE FORMATS

S = [['.....',          # These are for the 'S' shaped blocks
      '.....',          # All the possible rotations of the block
      '..00.',          # 'I' shaped blocks only have 2 possible rotation
      '.00..',
      '.....'],
     ['.....',
      '..0..',
      '..00.',
      '...0.',
      '.....']]

Z = [['.....',          # These are for the 'Z' shaped blocks
      '.....',          # All the possible rotations of the block
      '.00..',          # 'Z' shaped blocks are similar to the s shaped block
      '..00.',
      '.....'],
     ['.....',
      '..0..',
      '.00..',
      '.0...',
      '.....']]

I = [['..0..',          # These are for the 'I' shaped blocks
      '..0..',          # All the possible rotations of the block
      '..0..',          # 'I' shaped blocks only have 2 possible rotation
      '..0..',
      '.....'],
     ['.....',
      '0000.',
      '.....',
      '.....',
      '.....']]

O = [['.....',          # These are for the square shaped blocks
      '.....',          # Square shaped blocks only have no possible rotation
      '.00..',
      '.00..',
      '.....']]

J = [['.....',          # These are for the 'J' shaped blocks
      '.0...',          # All the possible rotations of the block
      '.000.',          # 'J' shaped blocks have 4 possible rotation
      '.....',
      '.....'],
     ['.....',
      '..00.',
      '..0..',
      '..0..',
      '.....'],
     ['.....',
      '.....',
      '.000.',
      '...0.',
      '.....'],
     ['.....',
      '..0..',
      '..0..',
      '.00..',
      '.....']]

L = [['.....',          # These are for the 'z' shaped blocks
      '...0.',          # All the possible rotations of the block
      '.000.',          # 'L' shaped blocks are similar to 'J' shaped blocks
      '.....',
      '.....'],
     ['.....',
      '..0..',
      '..0..',
      '..00.',
      '.....'],
     ['.....',
      '.....',
      '.000.',
      '.0...',
      '.....'],
     ['.....',
      '.00..',
      '..0..',
      '..0..',
      '.....']]

T = [['.....',          # These are for the 'T' shaped blocks
      '..0..',          # All the possible rotations of the block
      '.000.',          # 'T' shaped blocks have 4 possible rotation
      '.....',
      '.....'],
     ['.....',
      '..0..',
      '..00.',
      '..0..',
      '.....'],
     ['.....',
      '.....',
      '.000.',
      '..0..',
      '.....'],
     ['.....',
      '..0..',
      '.00..',
      '..0..',
      '.....']]


# the shapes are put into a list
shapes = [S, Z, I, O, J, L, T]
# adjust the colors of the shapes according to the list
shape_colors = [(0, 255, 0), (255, 0, 0), (0, 255, 255), (255, 255, 0), (255, 165, 0), (0, 0, 255), (128, 0, 128)]
# index 0 - 6 represent shape


class Piece(object):  # *
    def __init__(self, x, y, shape):                        # initializes the class
        self.x = x
        self.y = y
        self.shape = shape                                  # index of the list
        self.color = shape_colors[shapes.index(shape)]      # calls the list using the index 'shape'
        self.rotation = 0                                   # default rotation is 0


def create_grid(locked_pos={}):  # *

    # creates list in a list for the BLANK grids
    # so 20 rows(sublist) for each column(list)
    # each column has 10 grids

    grid = [[(0,0,0) for _ in range(10)] for _ in range(20)]        # the grid is initially black

    # register grids that are already filled with blocks
    # to check every position if it is filled with blocks

    for i in range(len(grid)):
        for j in range(len(grid[i])):
            if (j, i) in locked_pos:                # 'j' are x-values(column), 'i' are y-values(rows)
                c = locked_pos[(j,i)]               # locked_pos is a dictionary for the position & color, keys & values
                grid[i][j] = c                      # to set the color of the grid
    return grid

# this method converts the shape formats that are written on top, including its
# possible rotations into code to be understood by the computer
def convert_shape_format(shape):
    positions = []
    format = shape.shape[shape.rotation % len(shape.shape)]

    # for every line look for a '0' in the columns
    for i, line in enumerate(format):
        row = list(line)
        for j, column in enumerate(row):
            if column == '0':
                # adding the positions of the shape if found and putting them in a list
                positions.append((shape.x + j, shape.y + i))

    for i, pos in enumerate(positions):
        positions[i] = (pos[0] - 2, pos[1] - 4)

    return positions


def valid_space(shape, grid):
    # gathering every single position of the grids
    # adding the block to the position if the grid is empty
    accepted_pos = [[(j, i) for j in range(10) if grid[i][j] == (0,0,0)] for i in range(20)]
    # overwrites the list by taking all the possible positions in the grid, turning it into a one dimensional list
    accepted_pos = [j for sub in accepted_pos for j in sub]

    formatted = convert_shape_format(shape)
    # check if this position exist within the accepted positions

    for pos in formatted:
        if pos not in accepted_pos:
            if pos[1] > -1:
                return False
    return True

# check if any of the positions are off-the screen space
def check_lost(positions):
    for pos in positions:
        x, y = pos
        if y < 1:
            return True

    return False

# method to choose a random shape for the next shape which will spawn
def get_shape():
    # use the class to create & choose a random shape
    # x has to be in the middle of the screen; 5, y is 0
    return Piece(5, 0, random.choice(shapes))


def draw_text_middle(surface, text, size, color):
    font = pygame.font.SysFont("comicsans", size, bold=True)
    label = font.render(text, 1, color)

    surface.blit(label, (top_left_x + play_width /2 - (label.get_width()/2), top_left_y + play_height/2 - label.get_height()/2))

# this method draws the gridlines which are filled/not filled with tiles
def draw_grid(surface, grid):
    sx = top_left_x
    sy = top_left_y

    for i in range(len(grid)):
        # Sets the colour of the gridlines for the rows
        pygame.draw.line(surface, (128,128,128), (sx, sy + i*block_size), (sx+play_width, sy+ i*block_size))
        # Sets the colour of the gridlines for the columns
        for j in range(len(grid[i])):
            pygame.draw.line(surface, (128, 128, 128), (sx + j*block_size, sy),(sx + j*block_size, sy + play_height))

# clear the rows once the rows are fully filled
def clear_rows(grid, locked):

    inc = 0
    for i in range(len(grid)-1, -1, -1):
        row = grid[i]
        if (0,0,0) not in row:
            inc += 1
            ind = i
            for j in range(len(row)):
                try:
                    del locked[(j,i)]
                except:
                    continue

    if inc > 0:
        for key in sorted(list(locked), key=lambda x: x[1])[::-1]:
            x, y = key
            if y < ind:
                newKey = (x, y + inc)
                locked[newKey] = locked.pop(key)

    return inc

# this function displays the next shape that will be spawned
def draw_next_shape(shape, surface):
    font = pygame.font.SysFont('comicsans', 30)
    label = font.render('NEXT SHAPE', 1, (255,255,255))

    sx = top_left_x + play_width + 50
    sy = top_left_y + play_height/2 - 100
    format = shape.shape[shape.rotation % len(shape.shape)]

    for i, line in enumerate(format):
        row = list(line)
        for j, column in enumerate(row):
            if column == '0':
                pygame.draw.rect(surface, shape.color, (sx + j*block_size, sy + i*block_size, block_size, block_size), 0)

    surface.blit(label, (sx + 10, sy - 30))


def update_score(nscore):
    score = max_score()

    with open(file, 'w') as f:
        if int(score) > nscore:
            f.write(str(score))
        else:
            f.write(str(nscore))


def max_score():
    with open(file, 'r') as f:
        lines = f.readlines()
        score = lines[0].strip()

    return score


def draw_window(surface, grid, score=0, last_score = 0):

    # sets the color of the game area black initially, surface is the game area in the display
    surface.fill((0, 0, 0))

    pygame.font.init()
    font = pygame.font.SysFont('comicsans', 60)         # sets up the font of the title
    label = font.render('TETRIS', 1, (255, 255, 255))   # label, white color

    # draw the label on the screen
    surface.blit(label, (top_left_x + play_width / 2 - (label.get_width() / 2), 30))

    # current score
    font = pygame.font.SysFont('comicsans', 30)
    label = font.render('SCORE: ' + str(score), 1, (255,255,255))

    sx = top_left_x + play_width + 50
    sy = top_left_y + play_height/2 - 100

    surface.blit(label, (sx + 20, sy + 160))
    # last score
    label = font.render('HIGH SCORE: ' + str(last_score), 1, (255,255,255))

    sx = top_left_x - 230
    sy = top_left_y + 200

    surface.blit(label, (sx + 20, sy + 160))

    # draws the blank grids on the display
    for i in range(len(grid)):
        for j in range(len(grid[i])):
            # draws a rectangle for each grid (surface, color, position)
            pygame.draw.rect(surface, grid[i][j], (top_left_x + j*block_size, top_left_y + i*block_size, block_size, block_size), 0)

    # creates a red rectangular frame around the game area; width of 5
    pygame.draw.rect(surface, (255, 0, 0), (top_left_x, top_left_y, play_width, play_height), 5)

    draw_grid(surface, grid)
    #pygame.display.update()


def main(win):
    last_score = max_score()
    locked_positions = {}
    grid = create_grid(locked_positions)

    change_piece = False
    run = True
    current_piece = get_shape()             # the current piece of block which is spawned and controlled by the player
    next_piece = get_shape()                # the next piece of block to be spawned
    clock = pygame.time.Clock()
    fall_time = 0
    fall_speed = 0.27                       # how long it takes before each block starts falling
    level_time = 0
    score = 0

    while run:

        # keeps updating the grids as it moves down or/and the player rotates it
        grid = create_grid(locked_positions)
        # gets the real time
        fall_time += clock.get_rawtime()
        level_time += clock.get_rawtime()
        clock.tick()

        if level_time/1000 > 5:
            level_time = 0
            if level_time > 0.12:
                level_time -= 0.005

        if fall_time/1000 > fall_speed:
            fall_time = 0
            current_piece.y += 1
            # check if the piece moving down touches another block or the bottom
            if not(valid_space(current_piece, grid)) and current_piece.y > 0:
                current_piece.y -= 1
                change_piece = True

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                run = False
                pygame.display.quit()

            # configuring the buttons and its function in the game
            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_LEFT:
                    current_piece.x -= 1
                    if not(valid_space(current_piece, grid)):
                        current_piece.x += 1
                if event.key == pygame.K_RIGHT:
                    current_piece.x += 1
                    if not(valid_space(current_piece, grid)):
                        current_piece.x -= 1
                if event.key == pygame.K_DOWN:
                    current_piece.rotation += 1
                    if not (valid_space(current_piece, grid)):
                        current_piece.rotation -= 1
                if event.key == pygame.K_SPACE:
                    fall_speed = fall_speed - 10000
                if event.key == pygame.K_UP:
                    current_piece.rotation += 1
                    if not(valid_space(current_piece, grid)):
                        current_piece.rotation -= 1

        shape_pos = convert_shape_format(current_piece)

        # adding colour to the pieces
        for i in range(len(shape_pos)):
            x, y = shape_pos[i]
            if y > -1:
                grid[y][x] = current_piece.color

        # when the position is locked, the block no longer moves
        # there will be a new block spawned
        if change_piece:
            for pos in shape_pos:
                p = (pos[0], pos[1])
                locked_positions[p] = current_piece.color
            current_piece = next_piece
            next_piece = get_shape()
            change_piece = False
            score += clear_rows(grid, locked_positions) * 10
            fall_speed = 0.27

        # updates the window everytime the game runs
        draw_window(win, grid, score, last_score)
        draw_next_shape(next_piece, win)
        pygame.display.update()

        if check_lost(locked_positions):
            draw_text_middle(win, "YOU LOST!", 80, (255,255,255))
            pygame.display.update()
            pygame.time.delay(1500)
            run = False
            update_score(score)
            main_menu(win)  # start game


def main_menu(win):  # *
    run = True
    while run:
        win.fill((0, 0, 0))
        draw_text_middle(win, 'PRESS ANY KEY TO PLAY', 60, (255,255,255))
        pygame.display.update()
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                run = False
            if event.type == pygame.KEYDOWN:
                main(win)

    pygame.display.quit()


win = pygame.display.set_mode((s_width, s_height))          # sets up display for the game
pygame.display.set_caption('TETRIS')                        # adds title to the display frame

main_menu(win)      # start game