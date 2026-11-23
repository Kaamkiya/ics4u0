public class YourNameTester {
    public static void main(String[] args) {
        YourName2DArray t = new YourName2DArray();
        int[][] a = t.initGrid(3);
        System.out.println("Size: 3");
        System.out.println("Initial Grid: ");
        t.printArray(a);

        System.out.println("Product of elements in row 2 (index 1): "+t.rowProduct(a, 1));
        System.out.println("Product of elements in column 2 (index 1): "+t.colProduct(a, 1));

        a = t.swapRow(a, 0, 1);
        System.out.println("After swapping row 0 and row 1: ");
        t.printArray(a);
    }
}
