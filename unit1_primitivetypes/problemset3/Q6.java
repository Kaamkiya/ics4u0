/**
 * Author: Zia M
 * Date: Sep 14, 2026
 * Topic: Write a program that asks the user to enter his/her initial balance,
 * the amount of money deposited and the amount of money withdrawn from the
 * account in a month in a dialog box, then the program shows the user new
 * balance in a dialog box.
 */
import javax.swing.*;

public class Q6
{
    public static void main(String[] args)
    {
        String initStr = JOptionPane.showInputDialog("Enter your initial balance: ");
        String depositedStr = JOptionPane.showInputDialog("How much did you deposit this month? ");
        String withdrawnStr = JOptionPane.showInputDialog("How much did you withdraw this month? ");

        double init = Double.parseDouble(initStr);
        double deposited = Double.parseDouble(depositedStr);
        double withdrawn = Double.parseDouble(withdrawnStr);

        double ans = init+deposited-withdrawn;

        JOptionPane.showMessageDialog(null, "New balance: "+ans);
    }
}
