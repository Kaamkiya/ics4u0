/**
 * Author: Zia M
 * Date: Sep 30, 2026
 * Topic: salary
 */
import java.util.*;

public class Salary
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Salary increase statement\n");
        System.out.print("Name:        ");
        String name = s.nextLine();
        System.out.print("Salary:      $");
        double salary = s.nextDouble();
        System.out.print("Performance: ");
        String perf = s.next();

        double raise = 0;
        double raisedSalary;
        if (perf.equals("Poor")) {
            raise = 0.015 * salary;
        } else if (perf.equals("Good")) {
            raise = 0.04 * salary;
        } else if (perf.equals("Excellent")) {
            raise = 0.06 * salary;
        }
        raisedSalary = raise+salary;
        System.out.printf("Raise:         $%.2f\n", raise);
        System.out.printf("Raised Salary: $%.2f\n", raisedSalary);
    }
}
