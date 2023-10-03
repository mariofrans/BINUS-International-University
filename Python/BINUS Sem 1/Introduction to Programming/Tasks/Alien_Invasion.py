--snip--
from ship import Ship
from alien
import Alien
import game_functions as gf

def run_game():
    -snip--
    # Make an alien.
    alien = Alien(ai_settings, screen)
    # Start the main loop for the game.
    while True:
        gf.check_events(ai_settings, screen, ship, bullets)
        ship.update()
        gf.update_bullets(bullets)
        gf.update_screen(ai_settings, screen, ship, alien, bullets)
run_game()

def update_screen(ai_settings, screen, ship, alien, bullets):
--snip--
    # Redraw all bullets behind ship and aliens.
    for bullet in bullets:
        bullet.draw_bullet()
    ship.blitme()
    alien.blitme()
    # Make the most recently drawn screen visible.
    pygame.display.flip()