/*
 * Author: Zia M
 * Date: Nov 03, 2026
 * Topic: searching algorithms
 */
import java.util.Arrays;

public class Lesson5_SearchMethods {
    public static void main(String[] args) {
        // 1. linear search
        int[] a={12,34,15,92,56,11,21};
        System.out.println("a = "+Arrays.toString(a));
        System.out.println("56 at index: "+sequentialSearch(a, 56));
        String[] names = {"N", "A", "I", "D", "C", "R"};
        System.out.println("names = "+Arrays.toString(names));
        System.out.println("A at index: "+sequentialSearch(names, "A"));
    }

    public static int sequentialSearch(int[] a, int target) {
        for (int i=0;i<a.length;i++) {
            if (a[i]==target) return i;
        }
        return -1;
    }

    public static int sequentialSearch(String[] a, String target) {
        for (int i=0;i<a.length;i++) {
            if (a[i].equals(target)) return i;
        }
        return -1;
    }
}
