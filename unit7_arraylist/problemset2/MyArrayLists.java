import java.util.*;

public class MyArrayLists {
    public static ArrayList<Integer> numbers(int m, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            res.add((int)(Math.random()*n)+1);
        }
        return res;
    }

    public static boolean search(ArrayList<Integer> a, int b) {
        return a.contains(b);
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 1; j < a.size()-i; j++) {
                if (a.get(j-1)>a.get(j)) {
                    int temp = a.get(j-1);
                    a.set(j-1, a.get(j));
                    a.set(j, temp);
                }
            }
        }
        return res;
    }

    public static ArrayList<Integer> swap(ArrayList<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
        return a;
    }

    public static ArrayList<Integer> shuffle(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            int j = (int)(Math.random()*a.size());

            int temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
        }
        return a;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int n:a) res.add(0, n);
        return res;
    }

    public static ArrayList<String> insert(ArrayList<String> a, int i, String s) {
        a.add(i, s);
        return a;
    }

    public static ArrayList<String> takeOut(ArrayList<String> a, int i) {
        a.remove(i);
        return a;
    }

    public static ArrayList<String> takeOut(ArrayList<String> a, String name) {
        a.remove(name);
        return a;
    }

    public static ArrayList<String> replace(ArrayList<String> a, int idx, String value) {
        a.set(idx, value);
        return a;
    }
}
