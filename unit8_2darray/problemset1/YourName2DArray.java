public class YourName2DArray {
    public int[][] initGrid(int size) {
        int[][] res = new int[size][size];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                res[i][j] = (int)(Math.random()*size)+1;
            }
        }
        return res;
    }

    public int numEven(int[][] r) {
        int c = 0;
        for (int[] r1:r) {
            for (int r2:r1) {
                if (r2%2==0) c++;
            }
        }
        return c;
    }

    public int rowProduct(int[][] a, int r) {
        if (r < 0 || r >= a.length) {
            return -1;
        }

        int total = 1;
        for (int n:a[r]) {
            total *= n;
        }
        return total;
    }

    public int colProduct(int[][] a, int c) {
        if (c < 0 || c > a[0].length) {
            return -1;
        }

        int total = 1;
        for (int i = 0; i < a[c].length; i++) {
            total *= a[i][c];
        }
        return total;
    }

    public int[][] swapRow(int[][] a, int rowIndexA, int rowIndexB) {
        int[] tmp = a[rowIndexA];
        a[rowIndexA] = a[rowIndexB];
        a[rowIndexB] = tmp;
        return a;
    }

    public void printArray(int[][] a) {
        for (int[] a1:a) {
            for (int a2:a1) {
                System.out.print(a2+"  ");
            }
            System.out.println();
        }
    }
}
