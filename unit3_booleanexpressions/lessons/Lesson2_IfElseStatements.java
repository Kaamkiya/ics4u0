/**
 * Author: Zia M
 * Date: Sep 28, 2026
 * Topic: if and else
 * Create a menu-driven program that asks the use to enter two decimal numbers.
 * Then ask for an operation. If the operation is +, print the sum. If the
 * operation is * print the product. If -, print difference, if / print
 * quotient.
 */
import java.util.*;

public class Lesson2_IfElseStatements
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("To add, enter:      +");
        System.out.println("To subtract, enter: -");
        System.out.println("To multiply, enter: *");
        System.out.println("To divide, enter:   /");
        System.out.println();

        System.out.print("First number: ");
        double a = s.nextDouble();
        System.out.print("Second number: ");
        double b = s.nextDouble();
        System.out.print("Enter operation: ");
        char op = s.next().charAt(0);

        double output;
        switch (op) {
        case '+':
            System.out.println("Sum = "+(a+b));
            break;
        case '-':
            System.out.println("Difference = "+(a-b));
            break;
        case '*':
            System.out.println("Product = "+(a*b));
            break;
        case '/':
            System.out.println("Quotient = "+(a/b));
            break;
        default:
            break;
        }
    }
}
