package TetrisProjectJava;

import TetrisProjectJava.Shape.Model;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// this class is a blueprint of all the game logic
public class GameArea extends JPanel {

	// these are 3 constants of the game which will not be changed as the game runs
	// gameArea_WIDTH and gameArea_HEIGHT constant determines the size of the board
	// PERIOD_INTERVAL constant determines the speed of the game
    private final int gameArea_WIDTH = 10;
    private final int gameArea_HEIGHT = 22;
    private final int PERIOD_INTERVAL = 300;

    // create the timer variable for the game using javax.swing.Timer
    private Timer timer;
    // boolean to check if the block has fallen to the bottom
    private boolean isFallingFinished = false;
    // boolean to determine if the game is paused or not
    private boolean isPaused = false;
    // counts the number of lines removed, which will be used to calculate the player's score
    private int numLinesRemoved = 0;
    // curX and curY determines the exact position of the falling Tetris block that we are controlling
    private int curX = 0;
    private int curY = 0;
    // creates a statusbar using JLabel to show the status; score, paused, or when game is over
    private JLabel statusbar;
    // curPiece variable is the current Shape variable that we are controlling
    private Shape curPiece;
    // array to store the game area's blocks, so the blocks will not overlap each other
    private Model[] gameArea;

    // constructor
    public GameArea(Tetris parent) {

        initgameArea(parent);
    }

    // method used by constructor to initialize the initial game area
    private void initgameArea(Tetris parent) {

        setFocusable(true);
        statusbar = parent.getStatusBar();
        addKeyListener(new TAdapter());
    }

    // determines the width of each single Tetris model
    private int squareWidth() {

        return (int) getSize().getWidth() / gameArea_WIDTH;
    }

    // determines the height of each single Tetris model
    private int squareHeight() {

        return (int) getSize().getHeight() / gameArea_HEIGHT;
    }

    // determines the shape at the given coordinate, and is stored in the gameArea array
    private Model shapeAt(int x, int y) {

        return gameArea[(y * gameArea_WIDTH) + x];
    }

    // this method is called when the game is launched
    void start() {

    		// randomly assigns a 'Shape' or Model to the the current piece variable
        curPiece = new Shape();
        // creates a new game area object
        gameArea = new Model[gameArea_WIDTH * gameArea_HEIGHT];

        // board is cleared (emptied)
        cleargameArea();
        // new piece is initialized
        newPiece();
        
        // create a timer object
        timer = new Timer(PERIOD_INTERVAL, new GameCycle());
        // timer starts as soon as object is created and the game is launched
        timer.start();
    }

    // method responsible to pause and resume the game
    private void pause() {
    		
    		// boolean turns opposite every time the method is called
        isPaused = !isPaused;

        if (isPaused) {
        		// show in status  bar that the game is paused
            statusbar.setText("paused");
        } else {
        		// remove status bar message that the game is paused
            statusbar.setText(String.valueOf(numLinesRemoved));
        }

        repaint();
    }

    @Override
    // create the graphics of each block
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
    
    // draws all the objects around the board
    private void doDrawing(Graphics g) {

        Dimension size = getSize();
        int gameAreaTop = (int) size.getHeight() - gameArea_HEIGHT * squareHeight();

        // paint all the shapes that have been dropped to the board
        for (int i = 0; i < gameArea_HEIGHT; i++) {

            for (int j = 0; j < gameArea_WIDTH; j++) {

                Model shape = shapeAt(j, gameArea_HEIGHT - i - 1);

                if (shape != Model.NoShape) {

                    drawSquare(g, j * squareWidth(), gameAreaTop + i * squareHeight(), shape);
                }
            }
        }

        // now paint the current piece that is being controlled
        if (curPiece.getShape() != Model.NoShape) {

            for (int i = 0; i < 4; i++) {

                int x = curX + curPiece.x(i);
                int y = curY - curPiece.y(i);

                drawSquare(g, x * squareWidth(),
                        gameAreaTop + (gameArea_HEIGHT - y - 1) * squareHeight(),
                        curPiece.getShape());
            }
        }
    }

    // speeds up the game by instantly dropping the block to the bottom; x-coordinate stays the same
    private void dropDown() {

        int newY = curY;

        while (newY > 0) {

            if (!tryMove(curPiece, curX, newY - 1)) {

                break;
            }

            newY--;
        }

        pieceDropped();
    }

    // players can manually move the controlled block one step down, which makes the game speed faster
    private void oneLineDown() {

        if (!tryMove(curPiece, curX, curY - 1)) {

            pieceDropped();
        }
    }

    // clears the game area; method called when the game starts
    private void cleargameArea() {

        for (int i = 0; i < gameArea_HEIGHT * gameArea_WIDTH; i++) {

            gameArea[i] = Model.NoShape;
        }
    }
    
    // puts all the fallen pieces into an array to be remembered, so that the area will not be overlapped 
    private void pieceDropped() {

        for (int i = 0; i < 4; i++) {

            int x = curX + curPiece.x(i);
            int y = curY - curPiece.y(i);
            gameArea[(y * gameArea_WIDTH) + x] = curPiece.getShape();
        }
        
        // remove lines that are fully covered with blocks
        removeFullLines();

        if (!isFallingFinished) {
        		// when the current block has fallen, the next block will be spawned and controlled by the user
            newPiece();
        }
    }

    // spawn a new piece on the top right of the game window
    private void newPiece() {

        curPiece.setRandomShape();
        curX = gameArea_WIDTH / 2 + 1;
        curY = gameArea_HEIGHT - 1 + curPiece.minY();

        // if this new random piece spawned cannot move when the game is not paused, this indicates that the game is over
        // this is because the only way that this is possible if the blocks are piled to the brim 
        // and there is not a single space for the block to move around the game area from its initial spawn position
        if (!tryMove(curPiece, curX, curY)) {

            curPiece.setShape(Model.NoShape);
            // timer is stopped and game is concluded
            timer.stop();

            String msg = String.format("Game over. Score: %d", numLinesRemoved);
            statusbar.setText(msg);
        }
    }

    // returns false if it has reached the board boundaries or it is adjacent to the already fallen Tetris pieces.
    private boolean tryMove(Shape newPiece, int newX, int newY) {

        for (int i = 0; i < 4; i++) {

            int x = newX + newPiece.x(i);
            int y = newY - newPiece.y(i);

            if (x < 0 || x >= gameArea_WIDTH || y < 0 || y >= gameArea_HEIGHT) {

                return false;
            }

            if (shapeAt(x, y) != Model.NoShape) {

                return false;
            }
        }

        curPiece = newPiece;
        curX = newX;
        curY = newY;

        repaint();

        return true;
    }

    // scans and clears any full row
    private void removeFullLines() {

        int numFullLines = 0;

        // scans the entire window
        for (int i = gameArea_HEIGHT - 1; i >= 0; i--) {

            boolean lineIsFull = true;

            for (int j = 0; j < gameArea_WIDTH; j++) {

                if (shapeAt(j, i) == Model.NoShape) {

                    lineIsFull = false;
                    break;
                }
            }

            // if row is full, increase the counter by one, and clear the row
            if (lineIsFull) {

                numFullLines++;

                for (int k = i; k < gameArea_HEIGHT - 1; k++) {
                    for (int j = 0; j < gameArea_WIDTH; j++) {
                        gameArea[(k * gameArea_WIDTH) + j] = shapeAt(j, k + 1);
                    }
                }
            }
        }

        // add the global numLinesRemoved counter variable by the local numLinesRemoved counter
        if (numFullLines > 0) {

            numLinesRemoved += numFullLines;

            statusbar.setText(String.valueOf(numLinesRemoved));
            isFallingFinished = true;
            curPiece.setShape(Model.NoShape);
        }
    }

    // method that draws & colors the tiles of the blocks in the game
    private void drawSquare(Graphics g, int x, int y, Model shape) {

        Color colors[] = {new Color(0, 0, 0), new Color(204, 102, 102),
                new Color(102, 204, 102), new Color(102, 102, 204),
                new Color(204, 204, 102), new Color(204, 102, 204),
                new Color(102, 204, 204), new Color(218, 170, 0)
        };

        Color color = colors[shape.ordinal()];

        g.setColor(color);
        g.fillRect(x + 1, y + 1, squareWidth() - 2, squareHeight() - 2);

        g.setColor(color.brighter());
        g.drawLine(x, y + squareHeight() - 1, x, y);
        g.drawLine(x, y, x + squareWidth() - 1, y);

        g.setColor(color.darker());
        g.drawLine(x + 1, y + squareHeight() - 1,
                x + squareWidth() - 1, y + squareHeight() - 1);
        g.drawLine(x + squareWidth() - 1, y + squareHeight() - 1,
                x + squareWidth() - 1, y + 1);
    }

    // create a game cycle
    private class GameCycle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            doGameCycle();
        }
    }

    // The game is divided into game cycles. Each cycle updates the game and redraws the board
    private void doGameCycle() {

        update();
        repaint();
    }

    // updates the instances of the game, keeps updating as the game is still running
    private void update() {

    		// if game is paused
        if (isPaused) {

            return;
        }

        // if blocks have fallen completely
        if (isFallingFinished) {

            isFallingFinished = false;
            newPiece();
        } else {

        		// if blocks have not reached the bottom, move it down one step
            oneLineDown();
        }
    }
    
    // sets the keyboard controls of for the player
    class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            if (curPiece.getShape() == Model.NoShape) {

                return;
            }

            int keycode = e.getKeyCode();

            // Java 12 switch expressions
            switch (keycode) {

            		// pause
                case KeyEvent.VK_P:
                		pause();
                		break;
                	
                	// move current piece to the left
                case KeyEvent.VK_LEFT:
                		tryMove(curPiece, curX - 1, curY);
                		break;
                	
                	// move current piece to the right
                case KeyEvent.VK_RIGHT:
                		tryMove(curPiece, curX + 1, curY);
                		break;
                		
                	// rotate current piece to the clockwise
                case KeyEvent.VK_UP:
                		tryMove(curPiece.rotateRight(), curX, curY);
                		break;
                		
                	// drop current piece to the bottom instantly, x-coordinate stays the same
                case KeyEvent.VK_SPACE:
                		dropDown();
                		break;
                		
                	// move the current piece one step down, x-coordinate stays the same
                case KeyEvent.VK_DOWN:
                		oneLineDown();
                		break;
            }
        }
    }
}
