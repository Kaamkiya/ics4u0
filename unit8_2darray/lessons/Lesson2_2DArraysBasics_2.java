public class Lesson2_2DArraysBasics_2 {
    public static void main(String[] args) {
        // ragged 2d array: an array containing arrays of different lengths
        int[][] r = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                System.out.print(r[i][j] + "  ");
            }
            System.out.println();
        }

        String[][] s = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        printRowOrder(s);
        System.out.println();
        printColumnOrder(s);
    }

    public static void printRowOrder(String[][] s) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }

    public static void printColumnOrder(String[][] s) {
        for (int i = 0; i < s[0].length; i++) {
            for (int j = 0; j < s.length; j++) {
                System.out.print(s[j][i]+ "  ");
            }
            System.out.println();
        }
    }
}
