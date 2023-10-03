package TetrisProjectJava;

import java.util.Random;

// class which is a blueprint of the all the models of the Tetris blocks
// includes the variable data(coordinates) of each model, and methods that can be used to control these blocks 
public class Shape {

	// all the different types of models of Tetris blocks
    protected enum Model {
        NoShape, ZShape, SShape, LineShape,
        TShape, SquareShape, LShape, MirroredLShape
    }

    private Model pieceShape;
    private int[][] coords;

    // constructor of Shape class
    public Shape() {
    		// initializes the 'area' for each block [row][column], all blocks have the same area
        coords = new int[4][2];
        // sets the initial shape to be 'NoShape' which is empty and has no 'fill' in it
        setShape(Model.NoShape);
    }

    // this method assigns all the different coordinates to and create the shape of each model
    void setShape(Model shape) {
    	
    		// each model is assigned to their specific coordinates
        int[][][] coordsTable = new int[][][]{
                {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
                {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}},
                {{0, -1}, {0, 0}, {1, 0}, {1, 1}},
                {{0, -1}, {0, 0}, {0, 1}, {0, 2}},
                {{-1, 0}, {0, 0}, {1, 0}, {0, 1}},
                {{0, 0}, {1, 0}, {0, 1}, {1, 1}},
                {{-1, -1}, {0, -1}, {0, 0}, {0, 1}},
                {{1, -1}, {0, -1}, {0, 0}, {0, 1}}
        };

        // assign one of the coordinates into only one of the Tetris models
        // this will be done more later, for other models when setShape() method is called
        for (int i = 0; i < 4; i++) {

            System.arraycopy(coordsTable[shape.ordinal()], 0, coords, 0, 4);
        }

        pieceShape = shape;
    }

    // setter method used by the rotateLeft() and rotateRight() methods
    // sets the coordinates after the x coordinate is modified with the x() method
    private void setX(int i, int x) {

        coords[i][0] = x;
    }

    // setter method used by the rotateLeft() and rotateRight() methods
    // sets the coordinates after the y coordinate is modified with the y() method
    private void setY(int i, int y) {

        coords[i][1] = y;
    }

    // getter method that returns the coordinates after the x-value is changed
    int x(int i) {

        return coords[i][0];
    }

    // getter method that returns the coordinates after the y-value is changed
    int y(int i) {

        return coords[i][1];
    }
    
    // getter method to return the shape
    Model getShape() {

        return pieceShape;
    }

    // finds a random shape in Models and sets their 'fill' coordinates with the setShape() method
    void setRandomShape() {

        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;

        Model[] values = Model.values();
        setShape(values[x]);
    }

    public int minX() {

        int m = coords[0][0];

        for (int i = 0; i < 4; i++) {

            m = Math.min(m, coords[i][0]);
        }

        return m;
    }


    int minY() {

        int m = coords[0][1];

        for (int i = 0; i < 4; i++) {

            m = Math.min(m, coords[i][1]);
        }

        return m;
    }

    // rotate left function; the block will rotate 90 degrees to the left
    Shape rotateLeft() {

        if (pieceShape == Model.SquareShape) {

            return this;
        }

        Shape result = new Shape();
        result.pieceShape = pieceShape;

        for (int i = 0; i < 4; i++) {

            result.setX(i, y(i));
            result.setY(i, -x(i));
        }

        return result;
    }

    // rotate right function; the block will rotate 90 degrees to the right
    Shape rotateRight() {

        if (pieceShape == Model.SquareShape) {

            return this;
        }

        Shape result = new Shape();
        result.pieceShape = pieceShape;

        for (int i = 0; i < 4; i++) {

            result.setX(i, -y(i));
            result.setY(i, x(i));
        }

        return result;
    }
}