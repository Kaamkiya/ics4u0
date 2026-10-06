/**
 * Author: Zia M
 * Date: Oct 05, 2026
 * Topic: target controlled while loop
 * Write a program that asks the users to enter the balance in their checking
 * account. The bank requires that customers should always have at least 100$
 * in their account. Then they may withdraw money, repeatedly, stopping them
 * before they go below 100$ in the account.
 */
import java.util.*;

public class Lesson2_TargetWhileLoop
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter balance: $");
        double balance = s.nextDouble();
        double withdraw = 0;
        while (balance >= 100) {
            System.out.print("Withdraw: $");
            withdraw = s.nextDouble();
            if (balance-withdraw >= 100) {
                balance -= withdraw;
            } else {
                System.out.println("Denied.");
                break;
            }
        }
        System.out.printf("Your final balance is: %.2f\n", balance);
    }
}
