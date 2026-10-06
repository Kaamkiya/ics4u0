/**
 * Author: Zia M
 * Date: Oct 05, 2026
 * Topic: sentinel while loop
 * Example of a sentinel while loop: write a program that asks the user to
 * enter their marks on some tests, and when they enter -1, end the loop and
 * print the average.
 */
import java.util.*;

public class Lesson1_SentinelWhileLoop {
    public static void main(String[] args) {
        // A sentinel while loop 
        Scanner s = new Scanner(System.in);

        double test = 0;
        double sum = 0;
        double average = 0;
        int count = 0;
        while (test != -1) {
            System.out.print("Mark#"+(count+1)+": ");
            test = s.nextDouble();
            if (test != 1) {
                sum += test;
                count++;
            }
        }
        average = sum/count;
        System.out.printf("Average: %.2f\n", average);
    }
}
