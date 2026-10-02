/**
 * Author: Zia M
 * Date: Oct 02, 2026
 * Topic: delivery service
 */
import java.util.*;

public class ExpressDeliveryService {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Type of package:        ");
        String type = s.nextLine();
        System.out.print("Type of service:        ");
        String service = s.nextLine();
        System.out.print("Weight of package (oz): ");
        int weight = s.nextInt();

        if (type.equals("Letter")) {
            if (weight > 8) {
                System.out.println("Service for letters with more than 8oz is not available.");
                System.out.println("Please use a box-service package.");
            } else {
                if (service.equals("Next Day Priority")) {
                    System.out.printf("Cost of delivery:      $%.2f\n", 12.00);
                } else if (service.equals("Next Day Standard")) {
                    System.out.printf("Cost of delivery:      $%.2f\n", 10.50);
                } else {
                    System.out.println("This service is not available for weights less than 8oz.");
                    System.out.println("Please use Next Day Standard or Next Day Priority.");
                }
            }
        } else {
            if (service.equals("Next Day Priority")) {
                double lbs = Math.max(0, Math.ceil(weight/16.0)-1);
                double cost = 15.75 + lbs*1.25;
                System.out.printf("Cost of delivery:      $%.2f\n", cost);
            } else if (service.equals("Next Day Standard")) {
                double lbs = Math.max(0, Math.ceil(weight/16.0)-1);
                double cost = 13.75 + lbs*1.00;
                System.out.printf("Cost of delivery:      $%.2f\n", cost);
            } else if (service.equals("Two-Day")) {
                double lbs = Math.max(0, Math.ceil(weight/16.0)-1);
                double cost = 7.00 + lbs*0.50;
                System.out.printf("Cost of delivery:      $%.2f\n", cost);
            }
        }
    }
}
