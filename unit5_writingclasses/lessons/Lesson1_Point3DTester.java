/**
 * Author: Zia M
 * Date: Oct 15, 2026
 * Topic: Writing classes
 */

public class Lesson1_Point3DTester {
    public static void main(String[] args) {
        // using the default constructor
        Point3D blue = new Point3D();
        blue.setX(2);blue.setY(4);blue.setZ(6); // This is the bad way
        System.out.println(blue);

        // using the overloaded constructor
        Point3D purple = new Point3D(2, 4, 6);
        System.out.println(purple);

        Point3D pink = new Point3D(5, 8, 11);

        // distance
        System.out.println("distance blue->pink: " + blue.distance(blue, pink));
        System.out.println("midpoint blue->pink: " + blue.midpoint(blue, pink));
        System.out.println("distance purple->pink: " + purple.distanceTo(pink));
    }
}

class Point3D {
    // Definition of class: A class is a blueprint of an object
    // Definition of an object: An object is an instance of a class
    // The main parts of a class:
    // 1. Attributes of instance variables or class fields
    // 2. Behaviour (methods)
    // What are the constructors: to make an object you need a constructor
    // Different types of constructors
    // 1. Default constructor: when a class does not have any constructor, then
    //    Java creates a default one in the background
    // instance variables should always be private
    private double x;
    private double y;
    private double z;

    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() { return x; }
    public void setX(double x) { this.x=x; }
    public double getY() { return y; }
    public void setY(double y) { this.y=y; }
    public double getZ() { return z; }
    public void setZ(double z) { this.z=z; }

    // behaviour
    // 1. a method that calculates the distance between two points
    public double distance(Point3D a, Point3D b) {
        double dx = b.x-a.x;
        double dy = b.y-a.y;
        double dz = b.z-a.z;
        double dist = Math.sqrt(dx*dx + dy*dy + dz*dz);
        return dist;
    }
    public double distanceTo(Point3D a) {
        double dx = this.x-a.x;
        double dy = this.y-a.y;
        double dz = this.z-a.z;
        double dist = Math.sqrt(dx*dx + dy*dy + dz*dz);
        return dist;
    }
    // 2. A method that accepts two points and returns the coordinates of the
    // midpoint.
    public Point3D midpoint(Point3D a, Point3D b) {
        return new Point3D((a.x+b.x)/2, (a.y+b.y)/2, (a.z+b.z)/2);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
