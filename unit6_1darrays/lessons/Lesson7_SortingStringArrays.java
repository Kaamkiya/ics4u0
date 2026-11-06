import java.util.Arrays;

public class Lesson7_SortingStringArrays {
    public static void main(String[] args) {
        String[] colors = {"red", "orange", "yellow", "green", "blue", "purple"};
        System.out.println("unsorted = "+Arrays.toString(colors));
        colors=sortingStrings(colors);
        System.out.println("sorted =   "+Arrays.toString(colors));
    }

    public static String[] sortingStrings(String[] s) {
        for (int i=0;i<s.length;i++) {
            int minIndex = i;
            for (int j=i+1;j<s.length;j++) {
                if (s[j].compareTo(s[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String tmp = s[minIndex];
            s[minIndex] = s[i];
            s[i] = tmp;
        }
        return s;
    }
}
