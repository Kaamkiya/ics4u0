import java.util.*;

public class Lesson4_ArrayListOfArrayLists {
    public static void main(String[] args) {
        ArrayList<String> f = new ArrayList<>();
        f.add("clementine");
        f.add("tangerine");
        f.add("mandarin");

        ArrayList<String> d = new ArrayList<>();
        d.add("milk");
        d.add("water");
        d.add("juice");

        ArrayList<String> v = new ArrayList<>();
        v.add("cauliflower");
        v.add("tomato");
        v.add("onion");

        ArrayList<ArrayList<String>> a = new ArrayList<>();
        a.add(f);
        a.add(d);
        a.add(v);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
