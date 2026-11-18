import java.util.*;

public class Lesson5_SearchingArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList(Arrays.asList(12, 5, 15, 13, 4, 7));
        System.out.println(a);
        System.out.println("15 at idx: "+sequentialSearch(a, 15));
    }

    public static int sequentialSearch(ArrayList<Integer> a, int target) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Integer> a, int target) {
        Collections.sort(a);

        int left=0, right = a.size()-1;
        while (left <= right) {
            int middle = (left+right)/2;

            if (a.get(middle) == target) {
                return middle;
            }

            if (a.get(middle) < target) {
                left = middle+1;
            }
            if (a.get(middle) > target) {
                right = middle-1;
            }
        }
    }
}
