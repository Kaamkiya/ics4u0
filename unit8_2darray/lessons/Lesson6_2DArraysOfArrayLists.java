import java.util.*;

public class Lesson6_2DArraysOfArrayLists {
    public static void main(String[] args) {
        ArrayList<String>[][] colors = new ArrayList<String>[2][2];
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                colors[i][j] = new ArrayList<>();
            }
        }
        colors[0][0].add("Fuschia");
        colors[0][0].add("Magenta");
        colors[0][1].add("Maroon");
        colors[0][1].add("Mahogany");
        colors[1][0].add("Sage");
        colors[1][0].add("Jade");
        colors[1][1].add("Cerulean");
        colors[1][1].add("Sea");
        System.out.println(colors[1][1].get(1)); // Sea
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
