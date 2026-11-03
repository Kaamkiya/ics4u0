import java.util.*;
public class Lesson2_ArrayAlgorithms {
    private static int[] shuffle(int[] a) {
        for (int i=a.length-1;i>0;i--) {
            int j = (int)(Math.random()*i)+1;
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
        }
        return a;
    }

    public String[] insert(String[] a, String n, int p) {
        String[] res = new String[a.length+1];
        for (int i=0;i<a.length;i++) {
            res[i+(i<p?0:1)] = a[i];
        }
        res[p]=n;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(shuffle(arr)));
    }
}
