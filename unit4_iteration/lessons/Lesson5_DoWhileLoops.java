/**
 * Author: Zia M
 * Date: Oct 14, 2026
 * Topic: do while loops
 * Difference from while loop:
 * 1. do while loop executes at least one loop
 * 2. do-while loop checks condition at the end of the iteration, while loop
 *    checks at the start
 */
import java.util.*;

public class Lesson5_DoWhileLoops
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int mark = 0;
        int count = 0;
        int sum = 0;
        double average;
        char choice='y';
        do {
            System.out.print("Enter a mark: ");
            mark=s.nextInt();sum+=mark;count++;
            System.out.print("Do you want to continue? y/n: ");
            choice=s.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        average = (double)sum/(double)count;
        System.out.printf("Average: %.2f\n", average);
    }
}
