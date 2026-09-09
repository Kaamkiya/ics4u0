/**
 * Author: Zia M
 * Date: Sep 09, 2026
 * Topic: unit 1 problem set 1
 */
import javax.swing.*;

public class Tax
{
    public static void main(String[] args)
    {
        String amountStr = JOptionPane.showInputDialog("Enter the quantity: ");
        String costStr = JOptionPane.showInputDialog("Enter the price: ");
        double amount = Double.parseDouble(amountStr);
        double cost = Double.valueOf(costStr);
        double ans = amount*cost*1.13;
        JOptionPane.showMessageDialog(null, String.format("Total cost: %.2f", ans));
    }
}
