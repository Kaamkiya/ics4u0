/**
 * Author: Zia M
 * Sep 14, 2026
 * Topic:
 * A farmer produces eggs and sells his eggs in boxes with following capacities:
 * 6-egg box
 * 12-egg box
 * 36-egg box
 * Write a program that asks the user to enter the number of eggs available for the sale, then the program prints out the number of required boxes.
 */
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of eggs: ");
        int eggCount = s.nextInt();
        int threeDozen = 0;
        int dozen = 0;
        int halfDozen = 0;

        while (eggCount >= 6) {
            if (eggCount >= 36) {
                threeDozen++;
                eggCount -= 36;
            } else if (eggCount >= 12) {
                dozen++;
                eggCount -= 12;
            } else if (eggCount >= 6) {
                halfDozen++;
                eggCount -= 6;
            }
        }

        System.out.println("Number of required boxes:");
        System.out.println("36-egg box: "+threeDozen);
        System.out.println("12-egg box: "+dozen);
        System.out.println("6-egg box: "+halfDozen);
        System.out.println("Leftover: "+eggCount);
    }
}
