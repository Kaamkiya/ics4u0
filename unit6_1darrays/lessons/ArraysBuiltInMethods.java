/**
 * Author: Zia M
 * Date: Nov 03, 2026
 * Topic: arrays' builtin methods
 */
import java.util.*;

public class ArraysBuiltInMethods {
    public static void main(String[] args) {
        // toString
        int[] a={10,25,28,34,16};
        System.out.println("a = "+Arrays.toString(a));

        // sort method
        Arrays.sort(a);
        System.out.println("a = "+Arrays.toString(a));

        // binary search
        // array must be sorted to be able to use binary search
        int[] b={10,18,23,26,43,76};
        int i = Arrays.binarySearch(b, 26);
        System.out.println("b = "+Arrays.toString(b)+", b["+i+"] = 26");

        // copyOfRange
        int[] c = {1,2,3,4,5,6,7};
        int[] d = Arrays.copyOfRange(c, 2, 6);
        System.out.println("c = "+Arrays.toString(c));
        System.out.println("c[2:6] = "+Arrays.toString(d));
    }
}
