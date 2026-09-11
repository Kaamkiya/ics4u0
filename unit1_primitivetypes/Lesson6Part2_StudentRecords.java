/**
 * Author: Zia M
 * Date: Sep 11, 2026
 * Create a program that reads "marks.txt", calculates each student's
 * average, and writes the results to "averages.txt", as well as printing the
 * results.
 */
import java.io.*;
import java.util.*;

public class Lesson6Part2_StudentRecords {
    public static void main(String[] args) throws IOException {
        FileReader inputFile = new FileReader("marks.txt");
        Scanner s = new Scanner(inputFile);
        PrintWriter outputFile = new PrintWriter("averages.txt");

        String title;
        String name;
        double test1, test2, test3;
        double average;

        while (s.hasNext()) {
            title = s.nextLine();
            outputFile.println(title);

            name = s.next();
            outputFile.println("Student: "+name);
            test1 = s.nextDouble();
            test2 = s.nextDouble();
            test3 = s.nextDouble();
            average = (test1+test2+test3)/3.0;

            outputFile.printf("Test scores: %5.2f %5.2f %5.2f\n", test1, test2, test3);
            outputFile.printf("Average: %5.2f\n", average);
        }

        s.close();
        inputFile.close();
        outputFile.close();
    }
}
