package TetrisProjectJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {

	// this is the console of the game window
	// displays the current status of the game (paused or not), shows player's score and 'Game over' if the player loses
    private JLabel statusbar;

    // constructor of Tetris class, calls the method that initializes the UI of the game
    public Tetris() {
        initUI();
    }
    
    // method creates all the initial user interface settings when a new game is launched
    private void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        GameArea gameArea = new GameArea(this);
        add(gameArea);
        gameArea.start();

        setTitle("Tetris");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    //getter method to return the status bar, which is on the bottom of the game window
    JLabel getStatusBar() {

        return statusbar;
    }

    // main function to run the program
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        		// create a new game
            Tetris game = new Tetris();
            // make user interface visible
            game.setVisible(true);
        });
    }
}
