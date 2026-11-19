import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>(Arrays.asList("ek", "do", "tin", "chaar", "paanch", "chhe", "saat", "aat", "nau", "das"));
        ArrayList<Integer> i = new ArrayList<>(Arrays.asList(75, 76, 23, 72, 57, 67, 45, 99, 98, 13));
        ArrayList<Double> d = new ArrayList<>(Arrays.asList(5.0, 2.0, 3.4, 5.6, 8.7, 9.2, 8.2, 0.4, 9.3, 10.0));

        System.out.println(s);
        System.out.println(wordToRemove(s, "tin"));
        System.out.println(sortStrings(s));
        System.out.println(searchString(s, "chaar"));
        System.out.println();

        System.out.println(i);
        System.out.println(selectionSort(i));
        System.out.println(toDuplicate(i, 75));
        System.out.println(searchInt(i, 57));
        System.out.println();

        System.out.println(d);
        System.out.println(bubbleSort(d));
        System.out.println();
    }

    public static ArrayList<String> wordToRemove(ArrayList<String> a, String wordToRemove) {
        ArrayList<String> res = new ArrayList<>();
        for (String s:a) {
            if (!s.equals(wordToRemove)) {
                res.add(s);
            }
        }
        return res;
    }

    public static ArrayList<String> sortStrings(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            int minIndex = i;
            for (int j=i+1;j<a.size();j++) {
                if (a.get(minIndex).compareTo(a.get(i)) < 0) {
                    minIndex = j;
                }
            }

            String tmp = a.get(minIndex);
            a.set(minIndex, a.get(i));
            a.set(i, tmp);
        }
        return a;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            int minIndex = i;
            for (int j=i+1;j<a.size();j++) {
                if (a.get(j) < a.get(minIndex)) {
                    minIndex = j;
                }
            }

            int tmp = a.get(minIndex);
            a.set(minIndex, a.get(i));
            a.set(i, tmp);
        }
        return a;
    }

    public static ArrayList<Double> bubbleSort(ArrayList<Double> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 1; j<a.size()-i-1; j++) {
                if (a.get(j-1) > a.get(j)) {
                    double tmp = a.get(j-1);
                    a.set(j-1, a.get(j));
                    a.set(j, tmp);
                }
            }
        }
        return a;
    }

    public static ArrayList<Integer> toDuplicate(ArrayList<Integer> a, int e) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int n:a) {
            if (n==e) res.add(n);
            res.add(n);
        }
        return res;
    }

    public static int searchString(ArrayList<String> a, String t) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == t) return i;
        }
        return -1;
    }

    public static int searchInt(ArrayList<Integer> a, Integer t) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == t) return i;
        }
        return -1;
    }
}
