/**
 * Author: Zia M
 * Date: Oct 01, 2026
 * Topic: 
 */
import java.util.*;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter regular price: ");
        double rp = s.nextDouble();
        System.out.print("Enter dept code: ");
        int dc = s.nextInt();

        double discountedPrice;
        switch (dc) {
        case 310: discountedPrice = rp*0.9; break;
        case 438: discountedPrice = rp*0.88; break;
        case 284: discountedPrice = rp*0.92; break;
        case 652: discountedPrice = rp*0.85; break;
        default: discountedPrice = rp*0.95; break;
        }
        System.out.printf("Regular price: $%.2f\n", rp);
        System.out.printf("Sale price: $%.2f\n", discountedPrice);
    }
}
