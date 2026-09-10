/**
 * Author: Zia M
 * Date: Sep 10, 2026
 * Topic: writing file
 */
import java.io.*;

public class Lesson5_WritingFile
{
    public static void main(String[] args)
    {
        try {
            // Creating a text file
            PrintWriter output = new PrintWriter("tests.csv");
            // Writing data to the file
            output.println("person,70,90,85");
            output.println("human,65,90,83");
            output.println("someone,90,95,86");
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
