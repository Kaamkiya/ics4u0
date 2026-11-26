public class Lesson3_2DArraysAlgorithms {
    public static void main(String[] args) {
        int[][] o = {{50, 60, 70}, {55, 65, 75}, {70, 80, 90}};
        print(o);
        System.out.printf("Average: %.2f\n", average(o));
        System.out.printf("Highest: %d\n", maximum(o));
        System.out.println("Swap rows 1 and 2: ");
        o = swapRows(o, 1, 2);
        print(o);
        System.out.println("Swap columns 1 and 2: ");
        o = swapColumns(o, 1, 2);
        print(o);
    }

    public static void print(int[][] a) {
        for (int[] b:a) {
            for (int c:b) {
                System.out.print(c+"  ");
            }
            System.out.println();
        }
    }

    public static double average(int[][] a) {
        int sum = 0;
        int i = 0;
        for (int[] b:a) {
            for (int c:b) {
                ++i;
                sum+=c;
            }
        }
        return sum/(double)i;
    }

    public static int maximum(int[][] a) {
        int n = a[0][0];
        for (int[] b:a) {
            for (int c:b) {
                if (c<n)n=c;
            }
        }
        return n;
    }

    public static int[][] swapRows(int[][] a, int i, int j) {
        int[] tmp = a[i];
        a[i]=a[j];
        a[j]=tmp;
        return a;
    }

    public static int[][] swapColumns(int[][] a, int k, int l) {
        for (int i = 0; i < a[0].length; i++) {
            int tmp = a[i][k];
            a[i][k] = a[i][l];
            a[i][l] = tmp;
        }
        return a;
    }

    public static boolean search(int[][] a, int target) {
        for (int[] b:a) {
            for (int c:b) {
                if (c==target) return true;
            }
        }
        return false;
    }
}
