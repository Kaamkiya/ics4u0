/**
 * Author: Zia M
 * Date: Sep 14, 2026
 * Topic: increment, decrement, casting, output format
 */
public class Lesson7_OtherTopics
{
    public static void main(String[] args)
    {
        // Increment and decrement
        // Two kinds: pre-increment and post-increment
        int i = 0;
        System.out.println(++i);
        int j = 0;
        System.out.println(j++);
        System.out.println(j);
        int a = 0;
        System.out.println(a--);
        System.out.println(a);
        int b = 0;
        System.out.println(b--);
        System.out.println(--b);

        // Casting
        double g = -9.8;
        System.out.println(g);
        int q = (int)12.16;
        System.out.println(q);

        // Concatenation
        System.out.println(2+3+" = five"); // 5 = five
        System.out.println("five = "+2+3); // five = 23
        System.out.println("five = "+(2+3)); // five = 5
    }
}
