/**
 * Author: Zia M
 * Date: Sep 18, 2026
 * Topic: rectangle
 */
public class Rectangle
{
    private double width, length;

    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    public void setWidth(double w) {width = w;}
    public void setLength(double l) {length = l;}
    public double getWidth() {return width;}
    public double getLength() {return length;}

    public double area() {
        return width*length;
    }

    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Width: "+width+", Length: "+length;
    }
}
