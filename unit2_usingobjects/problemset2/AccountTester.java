/**
 * Author: Zia M
 * Date: Sep 22, 2026
 * Topic: bank account
 */
public class AccountTester {
    public static void main(String[] args) {
        BankAccount t = new BankAccount("Tara", 500);
        t.withdraw(500);
        t.deposit(1600);
        System.out.println("Balance before adding interest\n"+t);
        t.addInterest(5);
        System.out.println("Balance after adding interest\n"+t);

        BankAccount m = new BankAccount();
        m.setCustomer("Marya");
        m.setBalance(2000);
        m.withdraw(450);
        m.deposit(620);
        System.out.println("Balance before adding interest\n"+m);
        m.addInterest(5);
        System.out.println("Balance after adding interest\n"+m);
    }
}
