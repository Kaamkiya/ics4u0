import java.util.*;
public class Lesson6_SortingArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList(Arrays.asList(12, 5, 15, 13, 4, 7));
        System.out.println(a);
        System.out.println(selectionSort(a));
        ArrayList<Integer> b = new ArrayList(Arrays.asList(12, 5, 15, 13, 4, 7));
        System.out.println(b);
        System.out.println(bubbleSort(b));
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            int minIndex = i;
            for (int j = i; j < a.size(); j++) {
                if (a.get(j)<a.get(minIndex)) minIndex = j;
            }

            int temp = a.get(minIndex);
            a.set(minIndex, a.get(i));
            a.set(i, temp);
        }
        return a;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 1; j < a.size()-i-1; j++) {
                if (a.get(j-1)>a.get(j)) {
                    int temp = a.get(j-1);
                    a.set(j-1, a.get(j));
                    a.set(j, temp);
                }
            }
        }

        return a;
    }
}
