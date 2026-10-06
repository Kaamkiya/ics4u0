/**
 * Author: Zia M
 * Date: Oct 06, 2026
 */
import java.util.*;

public class Lesson3_SingleForLoop
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("How many marks: ");
        double mark, sum=0, average;
        int howMany = s.nextInt();
        for (int i = 1; i <= howMany; i++) {
            System.out.print("Mark#"+i+": ");
            mark = s.nextDouble();
            sum += mark;
        }
        average = sum/howMany;
        System.out.println();
        System.out.printf("Average = %.2f\n", average);
    }
}
