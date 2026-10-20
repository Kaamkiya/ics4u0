/*
 * Author: Zia M
 * Date: Oct 20, 2026
 * Topic: unit 5 problemset 1 question 4
 */
public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);
        System.out.printf("Saver 1: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f\n", saver2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(5);
        System.out.printf("Saver 1: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f\n", saver2.getSavingsBalance());
    }
}
