/**
 * Author: Zia M
 * Date: Sep 11, 2026
 * Topic: reading files
 */
import java.io.*;
import java.util.*;

public class Lesson6_ReadingFiles
{
    public static void main(String[] args) throws IOException
    {
        FileReader file = new FileReader("data.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        file.close();
        sc.close();
    }
}
