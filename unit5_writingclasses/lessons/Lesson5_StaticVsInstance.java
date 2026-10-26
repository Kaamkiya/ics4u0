/**
 * Author: Zia M
 * Date: Oct 26, 2026
 * Topic: static variables vs instance variables
 */
public class Lesson5_StaticVsInstance {
    private int a=0; // different with each instance
    private static int b=0; // stays the same across all instances

    public Lesson5_StaticVsInstance() {
        a += 5;
        b += 5;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Lesson5_StaticVsInstance blue = new Lesson5_StaticVsInstance();
        Lesson5_StaticVsInstance purple = new Lesson5_StaticVsInstance();
        Lesson5_StaticVsInstance pink = new Lesson5_StaticVsInstance();
    }
}
