import java.util.*;

public class Lesson1_2DArraysBasics {
    public static void main(String[] args) {
        // declaring a 2d array: first approach
        int[][] a = new int[2][3]; // 2 = number of rows, 3 = number of columns
        a[0][0] = 2; a[0][1] = 4; a[0][2] = 6;
        a[1][0] = 7; a[1][1] = 8; a[1][2] = 9;

        // declaring a 2d array: second approach
        int[][] b = {
            {2, 4, 6},
            {8, 7, 9},
        };

        // printing 2d array: first approach (bad)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        // printing 2d array: second approach (good)
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }

        // rows/columns in array
        String[][] colours = new String[4][6];
        System.out.println("Number of rows in 'colours' array: "+colours.length);
        System.out.println("Number of columns in 'colours' array: "+colours[0].length);

        // printing 2d array using nested enhanced for loop
        int[][] t = {{50, 60, 70}, {80, 90, 100}, {20, 30, 40}};
        for (int[] t1 : t) {
            for (int t2 : t1) {
                System.out.print(t2 + "  ");
            }
            System.out.println();
        }

        // printing a row
        int[] t1 = t[1];
        for (int n:t1) System.out.print(n+"  ");
        System.out.println();

        // printing a column
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i][0]);
        }

        // printing in column major order
        char[][] c = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        for (int i = 0; i < c[0].length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[j][i]+"  ");
            }
            System.out.println();
        }

        // printing in row major order
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
