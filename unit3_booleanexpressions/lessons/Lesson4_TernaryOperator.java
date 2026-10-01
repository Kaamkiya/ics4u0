/**
 * Author: Zia M
 * Date: Sep 30, 2026
 * Topic: ternary operator!!
 * Write a program that asks the user to enter the time. If the time is less
 * than 16, it prints good afternoon otherwise it prints good evening.
 */
import java.util.*;

public class Lesson4_TernaryOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter time: ");
        int t = s.nextInt();
        String res = t < 16 ? "afternoon" : "evening";
        System.out.println("Good "+res);
    }
}
