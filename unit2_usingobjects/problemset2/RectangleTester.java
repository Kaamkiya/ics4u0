/**
 * Author: Zia M
 * Date: Sep 18, 2026
 * Topic: rectangle
 */
public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(8, 12);
        System.out.println("Length: "+r.getLength());
        System.out.println("Width: "+r.getWidth());
        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
    }
}
