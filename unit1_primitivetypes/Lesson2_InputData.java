/**
 * Author: Zia M
 * Date: Sep 08, 2026
 * Topic: Input data
 */
import java.util.*;

public class Lesson2_InputData
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = s.nextInt();
        System.out.print("Enter a double: ");
        double d = s.nextDouble();
        System.out.print("Enter a boolean: ");
        boolean b = s.nextBoolean();
        System.out.print("Enter a character: ");
        char c = s.next().charAt(0);
        System.out.print("Enter a string: ");
        String t = s.next();
    }
}
