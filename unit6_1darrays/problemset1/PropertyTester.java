/**
 * Author: Zia M
 * Date: Oct 28, 2026
 * Topic: u6ps1q2
 */
public class PropertyTester {
    public static void main(String[] args) {
        int[] b={3,2,4,1};
        int[] w={4,2,5,1};
        String[] t={"Townhouse","Apartment","Detached","Semi-detached"};
        Property p = new Property(b,w,t);
        System.out.println(p);
    }
}
