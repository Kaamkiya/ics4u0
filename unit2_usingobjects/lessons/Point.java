/**
 * Author: Zia M
 * Date: Sep 14, 2026
 * Topic: creating a class that represents a point
 */
public class Point
{
    private double x;
    private double y;

    public Point() {
        x = 0;
        y = 0;
    }

    // Overloaded constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double newx) {
        x = newx;
    }

    public void setY(double newy) {
        y = newy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
