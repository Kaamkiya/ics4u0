/**
 * Author: Zia M
 * Date: Sep 21, 2026
 * Topic: 5 digit integer sum digits
 */
import java.util.*;

public class Question3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a 5-digit integer: ");
        int n = s.nextInt();

        int sum = n%10;
        n /= 10;
        sum += n%10;
        n /= 10;
        sum += n%10;
        n /= 10;
        sum += n%10;
        n /= 10;
        sum += n%10;
        n /= 10;
        System.out.println(sum);
    }
}
