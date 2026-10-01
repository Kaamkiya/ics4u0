/**
 * Author: Zia M
 * Date: Sep 30, 2026
 * Topic: LazyDays
 */
import java.util.*;

public class LazyDays
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Guides for LazyDays Activities: ");

        System.out.print("Enter the temperature: ");
        int temp = s.nextInt();

        if (temp >= 95) {
            System.out.println("Visit our shops");
        } else if (temp >= 80) {
            System.out.println("Swimming is the best option");
        } else if (temp >= 60) {
            System.out.println("Tennis is the best option");
        } else if (temp >= 40) {
            System.out.println("Golf is the best option");
        } else if (temp >= 20) {
            System.out.println("Skiing is the best option");
        } else {
            System.out.println("Visit our shops");
        }
    }
}
