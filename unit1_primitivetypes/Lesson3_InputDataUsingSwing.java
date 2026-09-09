/**
 * Author: Zia M
 * Date: Sep 09, 2026
 * Topic: input data using swing
 */
import java.awt.*;
import javax.swing.*;

public class Lesson3_InputDataUsingSwing
{
    public static void main(String[] args)
    {
        // showInputDialog only works to input strings
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, "+name);

        // Write a program that asks the user to enter the width and length of
        // a rectangle and outputs the area.
        String widthStr = JOptionPane.showInputDialog("Enter rectangle width: ");
        String lengthStr = JOptionPane.showInputDialog("Enter rectangle height: ");
        double width = Double.parseDouble(widthStr);
        double length = Double.parseDouble(lengthStr);
        double area = width*length;
        double perimeter = 2*(width+length);
        JOptionPane.showMessageDialog(null, String.format("Area: %.2f\nPerimeter: %.2f", area, perimeter));
    }
}
