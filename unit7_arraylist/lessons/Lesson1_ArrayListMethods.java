/**
 * Author: Zia M
 * Date: Nov 09, 2026
 * Topic: array list methods
 */
import java.util.*;

public class Lesson1_ArrayListMethods {
    public static void main(String[] args) {
        // declaring an arraylist
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // adding elements
        nums.add(76);
        nums.add(57);
        nums.add(73);
        nums.add(22);
        nums.add(6);
        // printing
        System.out.println(nums);

        // again
        ArrayList<String> names = new ArrayList<>();
        names.add("kwak");
        names.add("triplet");
        names.add("kaki");
        names.add("kaamkiya");
        System.out.println(names);

        // get the length of an arraylist
        System.out.println(names.size());

        // replace an element at a specified index
        names.set(1, "blue");
        System.out.println(names);

        // get an element at a specified index
        System.out.println(names.get(0));

        // get the index of an element
        System.out.println(names.indexOf("kaki"));

        // insert a value at an index (overloaded add method)
        names.add(1, "triplet");
        System.out.println(names);

        // check if arraylist is empty
        System.out.println(names.isEmpty());

        // clear method removes all elements
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());

        // new arraylist with elements
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,18,11,92,5));
        System.out.println(list);

        // getting an element from an arraylist
        System.out.println(list.get(2));

        // sorting an arraylist
        Collections.sort(list);
        System.out.println(list);

        // traversing an arraylist
        for (int i = 0; i<list.size();i++) System.out.print(list.get(i)+"  ");
        System.out.println();

        // traversing an arraylist with an enhanced for loop
        for (Integer q : list) {
            System.out.print(q+"  ");
        }
        System.out.println();

        // traversing with an iterator
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+"  ");
        }
        System.out.println();

        // check if arraylist contains element
        System.out.println(list.contains(6));
    }
}
