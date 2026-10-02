/**
 * Author: Zia M
 * Date: Oct 02, 2026
 * Topic: comparing objects
 */
    class Point {
        double x, y;
        public Point(double x, double y) {
            this.x=x;
            this.y=y;
        }
    }
public class Lesson6_ComparingObjects {
    public static void main(String[] args) {
        String s1 = "blue";
        String s2 = new String("blue");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        int x = 10;
        Integer y = new Integer(10);
        System.out.println(x==y);
        System.out.println(y.equals(x));

        Point p1 = new Point(4, 8);
        Point p2 = new Point(4, 8);
        System.out.println(p1 == p2); // false
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.x==p2.x&&p1.y==p2.y); // true

        // instanceof keyword
        System.out.println(p1 instanceof Point); // true
    }
}
