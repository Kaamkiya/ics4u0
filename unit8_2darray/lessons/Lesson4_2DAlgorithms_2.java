public class Lesson4_2DAlgorithms_2 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(a);
        System.out.println("avg of row 1: "+rowAverage(a, 1));
        System.out.println("avg of col 1: "+columnAverage(a, 2));
        System.out.println("diagonal sum: "+diagonalSums(a));
    }

    public static double rowAverage(int[][] a, int rowIndex) {
        int sum = 0;
        for (int n:a[rowIndex]) {
            sum+=n;
        }
        return (double)sum/a[rowIndex].length;
    }

    public static double columnAverage(int[][] a, int colIndex) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][colIndex];
        }
        return (double)sum/a.length;
    }

    public static void print(int[][] a) {
        for (int[] b:a) {
            for (int c:b) {
                System.out.print(c+"  ");
            }
            System.out.println();
        }
    }

    public static int diagonalSums(int[][] a) {
        int sum=0;
        for (int i=0; i<a.length;i++) {
            sum += a[i][i] + a[i][a.length-1-i];
        }
        return sum;
    }
}
