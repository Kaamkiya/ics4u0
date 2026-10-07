/**
 * Author: Zia M
 * Date: Oct 07, 2026
 * Topic: Nested for loop practice
 */
import java.util.*;

public class NestedForLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 2; i++ ) { // country
            System.out.print("Name of country: ");
            s.next();
            for (int j = 0; j < 3; j++) { // city
                System.out.print("Name of city: ");
                s.next();
                double sum = 0;
                for (int k = 0; k < 4; k++) { // season
                    System.out.print("Season#"+(k+1)+": ");
                    sum += s.nextDouble();
                }
                double avg = sum/4.0;

                System.out.printf("Average temperature = %.2f\n", avg);
            }
        }
    }
}
