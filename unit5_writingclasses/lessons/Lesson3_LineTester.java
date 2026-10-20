/**
 * Author: Zia M
 * Date: Oct 20, 2026
 * Topic: instance variables as reference variables
 */
import java.util.*;

public class Lesson3_LineTester
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
    }
}

class Line {
    private Point3D p1;
    private Point3D p2;

    public Line() {
        p1=new Point3D();
        p2=new Point3D();
    }

    public Line(Point3D a, Point3D b) {
        p1=a;
        p2=b;
    }

    public void setP1(Point3D a) {
        p1=a;
    }

    public void setP2(Point3D a) {
        p2=a;
    }

    public double distance() {
        double dx=p2.getX() - p1.getX();
        double dy=p2.getX() - p1.getX();
        double dz=p2.getX() - p1.getX();
        double dist = Math.sqrt(dx*dx + dy*dy + dz*dz);
        return dist;
    }

    public Point3D midpoint() {
        return new Point3D((p1.getX()+p2.getX())/2, (p1.getY()+p2.getY())/2, (p1.getZ()+p2.getZ())/2);
    }

    @Override
    public String toString() {
        return String.format("Line: (%s)'(%s)", p1, p2);
    }
}
