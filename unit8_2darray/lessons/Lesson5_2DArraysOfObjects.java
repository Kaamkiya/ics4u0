/*
 * Author: Zia M
 * Date: Nov 27, 2026
 * Topic: 2d arrays of objects
 */
public class Lesson5_2DArraysOfObjects {
    public static void main(String[] args) {
        Point[][] points = new Point[10][10];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[j][i] = new Point(j, i);
                System.out.print(points[j][i]+"\t");
            }
            System.out.println();
        }
    }
}

class Point {
    private int x,y;

    public Point() {
        x=0;
        y=0;
    }

    public Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}
