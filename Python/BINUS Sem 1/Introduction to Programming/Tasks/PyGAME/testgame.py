import pygame

pygame.init()

display_width = 1000
display_height = 800

gameDisplay = pygame.display.set_mode((display_width, display_height))
pygame.display.set_caption('Mario')

black = (0, 0, 0)
white = (255, 255, 255)

clock = pygame.time.Clock()
crashed = False
logo1 = pygame.image.load('/Users/mariofrans/PycharmProjects/hello/PyGAME/samsung2.png')


def logo(x, y):
    gameDisplay.blit(logo1, (x, y))


print(logo1.get_rect().width)
x = (display_width * 0.5 - logo1.get_rect().width * 0.5)
y = (display_height * 0.5 - logo1.get_rect().height * 0.5)
x_change = 0
y_change = 0
car_speed = 3

while not crashed:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            crashed = True

        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                x_change -= 5 * car_speed
            if event.key == pygame.K_RIGHT:
                x_change += 5 * car_speed
            if event.key == pygame.K_UP:
                y_change -= 5 * car_speed
            if event.key == pygame.K_DOWN:
                y_change += 5 * car_speed

        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                x_change = 0
            if event.key == pygame.K_UP or event.key == pygame.K_DOWN:
                y_change = 0


    x += x_change
    y += y_change
    gameDisplay.fill(white)
    logo(x, y)
    pygame.display.update()
    clock.tick(400)

pygame.quit()
quit()

# import pygame
#
# pygame.init()
# screen = pygame.display.set_mode((400, 300))
# done = False
# is_blue = True
# x = 30
# y = 30
#
# while not done:
#     for event in pygame.event.get():
#         if event.type == pygame.QUIT:
#             done = True
#         if event.type == pygame.KEYDOWN and event.key == pygame.K_SPACE:
#             is_blue = not is_blue
#
#     pressed = pygame.key.get_pressed()
#     if pressed[pygame.K_UP]: y -= 3
#     if pressed[pygame.K_DOWN]: y += 3
#     if pressed[pygame.K_LEFT]: x -= 3
#     if pressed[pygame.K_RIGHT]: x += 3
#
#     if is_blue:
#         color = (0, 128, 255)
#     else:
#         color = (255, 100, 0)
#     pygame.draw.rect(screen, color, pygame.Rect(x, y, 60, 60))
#
#     pygame.display.flip()
