/**
 * Author: Zia M
 * Date: Sep 30, 2026
 * Topic: TERNARIES!!!
 */
import java.util.*;

public class MaxOfThree
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three integer: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println("The largest number is: "+(
            a>b&&a>c? a : (b>c?b:c)
        ));
    }
}
