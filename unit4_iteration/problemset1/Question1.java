/**
 * Author: Zia M
 * Date: Oct 05, 2026
 * Topic: unit 4 problem set 1 question 1
 */
import java.util.*;

public class Question1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Retirement account: ");
        double r = s.nextDouble();
        double in = 0;
        System.out.println("Withdrawals: ");
        int year = 1;

        while (in != -1 && r > 0) {
            System.out.print("Year "+(year++)+": ");
            in = s.nextDouble();
            if (in == -1) {
                break;
            } else {
                r -= in;
            }
        }

        System.out.printf("You have $%.2f left.\n", r);
    }
}
