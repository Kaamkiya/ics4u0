/**
 * Author: Zia M
 * Date: Oct 14, 2026
 * Topic: Modify the previous question so that the user is asked if he/she wants to continue for another number.
 */
import java.util.*;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        char choice = 'y';
        do {
            System.out.print("Enter an integer: ");
            int n = s.nextInt();
            int sum = 0;
            int i = 0;
            while (i <= n) {
                sum += (i++);
            }
            System.out.println("Sum = "+sum);
            System.out.print("Would you like to continute for another number? y/n: ");
            choice = s.next().charAt(0);
        } while (choice == 'y');
    }
}
