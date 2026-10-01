/**
 * Author: Zia M
 * Date: Sep 30, 2026
 * Topic: nested conditionals
 */
import java.util.*;

public class Lesson3_NestedIfElse
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Age: ");
        int age = s.nextInt();
        System.out.print("Income: $");
        int income = s.nextInt();

        if (age > 65) {
            if (income < 20000) {
                System.out.println("You are eligible for the discount");
            } else {
                System.out.println("You are not eligible for the discount");
            }
        } else {
            
        }
    }
}
