/**
 * Author: Zia M
 * Date: Sep 14, 2026
 * Topic: unit 1 problem set 3 question 4
 * Write a program that writes given information to a file called MyInfo.txt
 */
import java.io.*;

public class Q4 {
    public static void main(String[] args) throws IOException {
        PrintWriter f = new PrintWriter("MyInfo.txt");
        f.println("First Name: John");
        f.println("Last Name: Jackson");
        f.println("Age: 17");
        f.println("Student Number: 459");
        f.close();
    }
}
