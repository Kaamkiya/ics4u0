public class MyArrayTester {
    public static void main(String[] args) {
        MyArray m=new MyArray();
        int[] list = m.fill(20);
        m.print(list);

        list=m.addEnd(list, 99);
        m.print(list);

        list=m.addFront(list, 99);
        m.print(list);

        list=m.remove(list, 3);
        m.print(list);

        int[] positions =m.searchPositions(list, 2);
        m.print(positions);

        list = m.insert(list, 9, 5);
        m.print(list);

        int[] twosm = m.twoSmallest(list);
        m.print(twosm);

        int[] s = m.sort(list);
        m.print(s);

        System.out.println(m.palindrome("abcba"));
    }
}
