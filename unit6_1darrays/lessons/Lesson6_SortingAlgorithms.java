import java.util.Arrays;
public class Lesson6_SortingAlgorithms {
    public static void main(String[] args) {
        int[] a={54,98,43,63,12};
        System.out.println("a = "+Arrays.toString(a));
        System.out.println("sorted = "+Arrays.toString(selectionSort(a)));
        int[] b={54,98,43,63,12};
        System.out.println("b = "+Arrays.toString(b));
        System.out.println("sorted = "+Arrays.toString(bubbleSort(b)));
    }

    public static int[] selectionSort(int[] a) {
        for (int i=0;i<a.length;i++) {
            int minIndex = i;
            for (int j = i+1; j<a.length;j++) {
                if (a[j]<a[minIndex]) minIndex=j;
            }

            int temp=a[minIndex];
            a[minIndex]=a[i];
            a[i]=temp;
        }
        return a;
    }

    public static int[] bubbleSort(int[] a) {
        int temp=0;
        for (int i=0;i<a.length;i++) {
            for (int j=1;j<a.length-i;j++) {
                if (a[j-1]>a[j]) {
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
