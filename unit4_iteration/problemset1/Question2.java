/**
 * Author: Zia M
 * Date: Oct 05, 2026
 * Topic: unit 4 problem set 1 question 2
 */
import java.util.*;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How many integers to process: ");
        int i = s.nextInt();
        System.out.println("Enter "+i+" positive integers");
        int count = 1;
        int prod = 1;
        while (count <= i) {
            System.out.print("#"+count+": ");
            int n = s.nextInt();
            if (n >= 1) {
                prod *= n;
            } else {
                System.out.println(n+" not counted.");
            }
            count++;
        }

        System.out.println("The product of the positives is "+prod+".");
    }
}
