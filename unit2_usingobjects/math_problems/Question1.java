/**
 * Author: Zia M
 * Date: Sep 21, 2026
 * Topic: cramer solution
 */
import java.util.*;

public class Question1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a1, b1, c1, a2, b2, c2:");
        double a1 = s.nextDouble();
        double b1 = s.nextDouble();
        double c1 = s.nextDouble();
        double a2 = s.nextDouble();
        double b2 = s.nextDouble();
        double c2 = s.nextDouble();

        if ((a1*b2 - a2*b1) == 0) {
            System.out.println("There is no solution");
        } else {
            double x = (c1*b2-c2*b1)/(a1*b2-a2*b1);
            double y = (a1*c2-a2*c1)/(a1*b2-a2*b1);
            System.out.printf("X: %.1f, Y: %.1f\n", x, y);
        }
    }
}
