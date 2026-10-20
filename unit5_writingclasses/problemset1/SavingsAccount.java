/*
 * Author: Zia M
 * Date: Oct 20, 2026
 * Topic: unit 5 problemset 1 question 4
 */
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double b) {
        savingsBalance = b;
    }

    public void setSavingsBalance(double b) {savingsBalance=b;}
    public double getSavingsBalance() {return savingsBalance;}

    public double calculateMonthlyInterest() {
        savingsBalance *= (annualInterestRate/100.0/12.0);
        return savingsBalance;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    } 
}
