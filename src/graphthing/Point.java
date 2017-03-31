package graphthing;

/**
 * The Point class is used to create an object that can be stored in a TableView
 * and defines coordinates that can be plotted on a graph.
 * @author julian
 */
public class Point {
    
    private float x;
    private float y;
    
    /**
     * This method allows for the redefining of the X coordinate of a point.
     * @param x The new X coordinate of the point.
     */
    public void setX(float x) {
        this.x = x;
    }
    
    /**
     * This method allows for the redefining of the Y coordinate of a point.
     * @param y The new Y coordinate of the point.
     */
    public void setY(float y) {
        this.y = y;
    }
    
    /**
     * This method is used to retrieve the value of the point's X coordinate.
     * @return The current X coordinate of the point.
     */
    public float getX() {
        return x;
    }
    
    /**
     * This method is used to retrieve the value of the point's Y coordinate.
     * @return The current Y coordinate of the point.
     */
    public float getY() {
        return y;
    }
    
    /**
     * Passing two floats to the constructor will automatically set those two
     * values to the X and Y coordinates of the point, respectively.
     * @param x The X coordinate of the point
     * @param y The Y coordinate of the point
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Giving the constructor no parameters will automatically set both the X
     * and Y coordinates of the point to 0.
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
}
