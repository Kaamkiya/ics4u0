/**
 * Author: Zia M
 * Date: Sep 22, 2026
 * Topic: bank account
 */
public class BankAccount
{
    public String customer;
    public double balance;
    
    public BankAccount() {
        customer = null;
        balance = 0.0;
    }

    public BankAccount(String c, double b) {
        customer = c;
        balance = b;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void setCustomer(String c) {
        customer = c;
    }

    public String getCustomer() {
        return customer;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest(int rate) {
        balance += balance*(rate/100.0);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Balance: $%.2f", customer, balance);
    }
}
