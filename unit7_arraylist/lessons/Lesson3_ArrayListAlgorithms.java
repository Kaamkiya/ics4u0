import java.util.*;

public class Lesson3_ArrayListAlgorithms {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>(Arrays.asList(2.5, 3.5, 4.5, 5.5));
        System.out.println(a);
        System.out.println("Sum = "+sum(a));
        System.out.println("Average = "+average(a));

        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(5, 2, 321, 324, 932, 214, 123, 547));
        System.out.println(b);
        System.out.println("Max = "+maximum(b));
        b = swap(b, 2, 4);
        System.out.println(b);
        Collections.sort(b);
        System.out.println(b);
        b = reverse(b);
        System.out.println(b);

        ArrayList<String> c = new ArrayList<>(Arrays.asList("purple", "blue", "pink", "yellow", "black", "green"));
        System.out.println(c);
        System.out.println(shuffle(c));
    }

    public static double sum(ArrayList<Double> a) {
        double sum = 0;
        for (int i = 0; i<a.size();i++) {
            sum+=a.get(i);
        }
        return sum;
    }

    public static double average(ArrayList<Double> a) {
        return sum(a)/a.size();
    }

    public static int maximum(ArrayList<Integer> a) {
        int max=a.get(0);
        for (int i=1;i<a.size();i++) {
            if (a.get(i)>max) max=a.get(i);
        }
        return max;
    }

    public static ArrayList<Integer> swap(ArrayList<Integer> a, int i, int j) {
        int temp=a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
        return a;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i=a.size()-1;i>=0;i--) {
            res.add(a.get(i));
        }
        return res;
    }

    public static ArrayList<String> shuffle(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            int j = (int)(Math.random()*a.size());

            String temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
        }
        return a;
    }
}
