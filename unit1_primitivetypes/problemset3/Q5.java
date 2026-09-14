/**
 * Author: Zia M
 * Date: Sep 14, 2026
 * Topic: unit 1 problem set 3 question 5
 * Write a program that reads the content from the file created in question 4
 * and prints it to the screen.
 */
import java.io.*;
import java.util.*;

public class Q5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("MyInfo.txt");
        Scanner s = new Scanner(fr);

        while (s.hasNext()) {
            String line = s.nextLine();
            System.out.println(line);
        }

        fr.close();
        s.close();
    }
}
