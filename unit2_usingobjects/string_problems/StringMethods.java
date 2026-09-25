/**
 * Author: Zia M
 * Date: Sep 25, 2026
 * Topic: string problem set
 */
import java.util.*;

public class StringMethods
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String w = s.next();
        System.out.println("It has "+w.length()+" characters");

        System.out.print("Enter the first string: ");
        String a = s.next();
        System.out.print("Enter the second string: ");
        String b = s.next();
        int product = Integer.parseInt(a)*Integer.parseInt(b);
        System.out.println("Product: "+product);

        System.out.print("Original String: ");
        String orig = s.next();
        System.out.println("Specified sequence of chars: ");
        String specified = s.nextLine();
        System.out.println(orig.contains(specified));

        String x = "example.com";
        String y = "example.com";
        String z = "Example.com";
        System.out.println("Comparing "+x+" and "+y+": "+ x.equals(y));
        System.out.println("Comparing "+x+" and "+z+": "+ x.equals(z));

        System.out.print("Enter a sentence: ");
        String t = s.nextLine();
        System.out.print("Enter the first digit: ");
        int d1 = s.nextInt();
        System.out.print("Enter the second digit: ");
        int d2 = s.nextInt();
        System.out.println("Characters in the given range are "+t.substring(d1, d2));

        System.out.print("Enter a number: ");
        String n = s.next();
        int sum = 0;
        for (int i=0;i<n.length();i++) {
            sum += Integer.parseInt(n.substring(i,i+1));
        }
        System.out.println("Sum of digits: "+sum);

        String st = "Toronto District School Board";
        System.out.print(st.substring(0,1)+st.substring(8,9)+st.substring(17,18)+st.substring(24,25));
    }
}
