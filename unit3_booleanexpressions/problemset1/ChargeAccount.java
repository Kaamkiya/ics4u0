/**
 * Author: Zia M
 * Date: Sep 30, 2026
 * Topic: charge account
 */
import java.util.*;

public class ChargeAccount
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Previous balance: $");
        double prevBalance = s.nextDouble();
        System.out.print("Additional charges: $");
        double additional = s.nextDouble();

        double interest;
        if (prevBalance == 0) {
            interest = 0;
        } else {
            interest = 0.02 * (prevBalance+additional);
        }

        double newBalance = prevBalance+additional+interest;
        double minPayment;
        if (newBalance < 50) {
            minPayment = newBalance;
        } else if (newBalance <= 300) {
            minPayment = 50;
        } else {
            minPayment = 0.2*newBalance;
        }

        System.out.printf("Interest: $%.2f\n", interest);
        System.out.printf("New balance: $%.2f\n", newBalance);
        System.out.printf("Minimum payment: $%.2f\n", minPayment);
    }
}
