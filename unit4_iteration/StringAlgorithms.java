/**
 * Author: Zia M
 * Date: Oct 13, 2026
 * Topic: string algorithms
 */
import java.util.*;

public class StringAlgorithms
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        System.out.println(reverse(s.nextLine()));
        System.out.println("Number of x's in lajfdsxdhsxhxkjdx: "+countChars("lajfdsxdhsxhxkjdx", 'x'));
    }

    // write a method that accepts a string and returns the reverse
    public static String reverse(String s) {
        String r = "";
        for (int c=s.length()-1; c>=0; c--) {
            r += s.substring(c, c+1);
        }
        return r;
    }

    // write a method that accepts a string and a char and returns the
    // number of chars in the string.
    public static int countChars(String s, char c) {
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                t++;
            }
        }

        return t;
    }

    // write a method that accepts a string and returns true if it's a
    // palindrome.
    public static boolean isPalindrome(String s) {
        // easiest method:
        // return s.equals(reverse(s));

        // two pointer method
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
