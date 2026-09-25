/**
 * Author: Zia M
 * Date: Sep 25, 2026
 * Topic: boolean laws
 */
import java.util.*;

public class BooleanLaws {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Boolean operators:
        // > greater than, >= greater than or equal to
        // < less than, <= less than or equal to
        // == equal, != not equal
        // || or, && and, ! not
        boolean a = s.nextBoolean();
        boolean b = s.nextBoolean();
        boolean c = s.nextBoolean();

        System.out.println((!(a||b)) == (!a&&!b));
        System.out.println(!(a&&b) == (!a||!b));

        System.out.println(a||(b&&c) == (a||b)&&(a||c));
    }
}
