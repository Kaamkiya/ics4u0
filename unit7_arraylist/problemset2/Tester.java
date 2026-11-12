import java.util.*;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> b = MyArrayLists.numbers(10, 20);
        ArrayList<String> c = new ArrayList(Arrays.asList("red", "orange", "yellow", "green", "blue", "purple"));

        System.out.println(b);
        System.out.println("b contains 3: "+MyArrayLists.search(b, 3));
        System.out.println("sorted b: "+MyArrayLists.sort(b));
        System.out.println("reversed b: "+MyArrayLists.reverse(b));
        System.out.println("swap b[4] with b[7]: "+MyArrayLists.swap(b, 4, 7));
        System.out.println("shuffled b: "+MyArrayLists.shuffle(b));

        System.out.println(c);
        System.out.println("inserting turquiose at index 4: "+MyArrayLists.insert(c, 4, "turquiose"));
        System.out.println("removing index 4: "+MyArrayLists.takeOut(c, 4));
        System.out.println("removing orange: "+MyArrayLists.takeOut(c, "orange"));
        System.out.println("replacing 2 with pink: "+MyArrayLists.replace(c, 2, "pink"));
    }
}
