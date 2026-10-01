/**
 * Author: Zia M
 * Date: Oct 01, 2026
 * Topic: switch
 * Write a menu driven program that asks the user to enter two numbers and an
 * integer as an option. If the option is 1, add the numbers. If it's 2, find
 * the difference. If it's 3, find the product. If it's 4, find the quotient.
 * Afterwards, print the result.
 */
import java.util.*;

public class Lesson5_SwitchStatements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("To add, enter       1");
        System.out.println("To subtract, enter  2");
        System.out.println("To multiply, enter  3");
        System.out.println("To divide, enter    4");
        System.out.print("Enter the operation: ");
        int op = s.nextInt();
        System.out.print("Enter the first number: ");
        double a = s.nextDouble();
        System.out.print("Enter the second number: ");
        double b = s.nextDouble();

        switch (op) {
            case 1: System.out.println("Sum = "+(a+b)); break;
            case 2: System.out.println("Difference = "+(a-b)); break;
            case 3: System.out.println("Product = "+(a*b)); break;
            case 4: System.out.println("Quotient = "+(a/b)); break;
            default: System.out.println("Invalid operation"); break;
        }
    }
}
