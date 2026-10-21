/**
 * Author: Zia M
 * Date: Oct 21, 2026
 * Topic: unit 5 problemset 2 part 2
 */

public class PurseTest {
    public static void main(String[] args) {
        Purse p1=new Purse(6,8,12);
        System.out.println("Purse p1: "+p1);
        System.out.printf("Value of purse p1: $%.2f\n",p1.inDollar());
        Purse p2=new Purse(4,5,8);
        System.out.println("Purse p2: "+p2);
        System.out.printf("Value of purse p2: $%.2f\n",p2.inDollar());

        p1.insert(3,6,5);
        System.out.println("Purse p1 after inserting coins: "+p1);
        p2.remove(2,3,4);
        System.out.println("Purse p2 after removing coins: "+p2);

        Purse p3 = p1.addPurses(p1, p2);
        Purse p4 = p1.addToPurse(p2);
        System.out.println("Adding p1 and p2: "+p3);
        System.out.println("Adding p1 to p2: "+p4);

        System.out.printf("Final value of two purses: $%.2f\n", p4.inDollar());
    }
}

