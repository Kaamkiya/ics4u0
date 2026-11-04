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
        double[] ihatethisclass = {1.2,3.4,5.6,7.8,9.0};
        System.out.println("h = "+Arrays.toString(ihatethisclass));
        System.out.println("7.8 at index: "+binarySearch(ihatethisclass, 7.8));
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

    public static int binarySearch(double[] list, double item) {
        int bottom=0;
        int top=list.length-1;
        int middle;
        boolean found = false;
        while (bottom <= top) {
            middle = (bottom+top)/2;
            if (list[middle]==item) {
                return middle;
            }
            if (list[middle]<item) {
                bottom=middle+1;
            } else {
                top=middle-1;
            }
        }
        return -1;
    }
}
