/**
 * Author: Zia M
 * Date: Sep 11, 2026
 * Topic: Unit 1 problem set 2
 */
import java.util.*;
import java.io.*;

public class ProblemSet2
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("input_data.txt");
        Scanner infile = new Scanner(fr);
        PrintWriter outfile = new PrintWriter("averagemark.txt");

        while (infile.hasNext()) {
            String line = infile.nextLine();
            outfile.println(line);
            System.out.println(line);

            String subject = infile.next();
            double test1 = infile.nextDouble();
            double test2 = infile.nextDouble();
            double test3 = infile.nextDouble();
            double test4 = infile.nextDouble();
            double average = (test1+test2+test3+test4)/4.0;

            outfile.println("Subject: "+subject);
            outfile.printf("Marks: %5.2f %5.2f %5.2f %5.2f\n", test1, test2, test3, test4);
            outfile.printf("Average: %5.2f\n", average);

            System.out.println("Subject: "+subject);
            System.out.printf("Marks: %5.2f %5.2f %5.2f %5.2f\n", test1, test2, test3, test4);
            System.out.printf("Average: %5.2f\n", average);
        }

        fr.close();
        infile.close();
        outfile.close();
    }
}
