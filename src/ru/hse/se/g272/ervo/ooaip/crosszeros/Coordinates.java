package ru.hse.se.g272.ervo.ooaip.crosszeros;

/**
 * Coordinates of the cell.
 *
 * @author Ervo Victor
 * @since 07.04.2014
 */
public class Coordinates {
    /**
     * x coordinate.
     */
    private final int x;

    /**
     * y coordinate.
     */
    private final int y;

    /**
     * Construct new coordinates.
     * @param i x coordinate
     * @param j y coordinate
     */
    public Coordinates(final int i, final int j) {
        this.x = i;
        this.y = j;
    }

    /**
     * Gets x coordinate.
     * @return x coordinate
     */
    public final int getX() {
        return x;
    }

    /**
     * Gets y coordinate.
     * @return y coordinate
     */
    public final int getY() {
        return y;
    }

    /**
     * String representation of coordinates.
     * @return x y
     */
    @Override
    public final String toString() {
        return "" + getX() + " " + getY();
    }

    /**
     * Gets coordinates from the string.
     * @param s String with coordinates
     * @return Coordinates
     */
    public static Coordinates parseCoordinates(final String s) {
        String[] cStr = s.split(" ");
        int x = Integer.parseInt(cStr[0]);
        int y = Integer.parseInt(cStr[1]);
        return new Coordinates(x, y);
    }
}
