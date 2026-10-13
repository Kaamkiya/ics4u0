/**
 * Author: Zia M
 * Date: Oct 13, 2026
 * Topic: string practice
 */
import java.util.*;

public class StringPractice
{
    public static int countVowels(String s) {
        int c = 0;
        for (int i=0;i<s.length();i++){
            char q = s.charAt(i);
            if (q == 'a' || q == 'e' || q == 'i' || q == 'o' || q == 'u') {
                c++;
            }
        }
        return c;
    }
    public static String reverse(String s) {
        String r = "";
        for (int c=s.length()-1; c>=0; c--) {
            r += s.substring(c, c+1);
        }
        return r;
    }
    public static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(reverse(s));
    }
    public static int countCharacter(String s, char c) {
        int q = 0;
        for (int i=0;i<s.length();i++) {
            if (c == s.charAt(i)) {
                q++;
            }
        }
        return q;
    }
    public static String removeSpaces(String s) {
        String o = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                o += s.charAt(i);
            }
        }
        return o;
    }

    public static String replaceCharacter(String s, char a, char b) {
        String r="";
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==a) {
                r+=b;
            } else {
                r+=s.charAt(i);
            }
        }
        return r;
    }

    public static int countWords(String s) {
        return s.split(" ").length;
    }

    public static String longestWord(String s) {
        String[] words = s.split(" ");
        String longest="";
        for (String w:words) {
            if (w.length()>longest.length()) {
                longest = w;
            }
        }
        return longest;
    }

    public static String removeConsecutiveDuplicates(String s) {
        String r = s.substring(0,1);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != r.charAt(r.length()-1)) {
                r+=s.charAt(i);
            }
        }
        return r;
    }

    public static boolean areAnagrams(String a, String b) {
        for (int i=0;i<a.length();i++) {
            char c=a.charAt(i);
            if (countCharacter(a, c) != countCharacter(b, c)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(countVowels("Computer Science"));
        System.out.println(reverse("Java"));
        System.out.println(isPalindrome("Level"));
        System.out.println(isPalindrome("Hello"));
        System.out.println(countCharacter("banana", 'a'));
        System.out.println(countCharacter("Mississippi", 's'));
        System.out.println(removeSpaces("Java is fun"));
        System.out.println(replaceCharacter("banana", 'a', 'o'));
        System.out.println(replaceCharacter("school", 'o', 'a'));
        System.out.println(countWords("Java is interesting"));
        System.out.println(countWords(" Java is fun "));
        System.out.println(longestWord("Java programming is interesting"));
        System.out.println(removeConsecutiveDuplicates("aaabbccccd"));
        System.out.println(removeConsecutiveDuplicates("bookkeeper"));
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("earth", "heart"));
        System.out.println(areAnagrams("hello", "world"));
    }
}
