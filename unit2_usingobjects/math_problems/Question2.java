/**
 * Author: Zia M
 * Date: Sep 21, 2026
 * Topic: quadratics
 */
import java.util.*;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values of a, b, c:");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double discriminant = b*b - 4*a*c;
        if (discriminant < 0) {
            System.out.println("No real solutions.");
        } else if (discriminant == 0) {
            double x = (-b-Math.sqrt(discriminant))/(2*a);
            System.out.printf("x=%.1f\n", x);
        } else {
            double x1 = (-b+Math.sqrt(discriminant))/(2*a);
            double x2 = (-b-Math.sqrt(discriminant))/(2*a);
            System.out.printf("x1=%.1f, x2=%.1f\n", x1, x2);
        }
    }
}
