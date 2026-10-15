/**
 * Author: Zia M
 * Date: Oct 14, 2026
 * Topic: Write a program using while / do while loop that asks the user to enter an integer, then the program prints out the sum of consecutive integers from 1 to that number.
 */
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = s.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum += (i++);
        }
        System.out.println("Sum = "+sum);
    }
}
