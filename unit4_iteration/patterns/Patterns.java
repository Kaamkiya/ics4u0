public class Patterns {
    public static void main(String[] args) {
        pyramidPattern(5);
        System.out.println();
        rightStarPattern(5);
        System.out.println();
        leftStarPattern(5);
        System.out.println();
        diamondPattern();
        System.out.println();
        downwardTriangle(5);
        System.out.println();
        mirroredRightTriangle(5);
        System.out.println();
        reversedPyramidPattern(5);
        System.out.println();
    }

    public static void pyramidPattern(int rows) {
        int spaces=rows+1;
        for (int i=1;i<=rows;i++) {
            for (int j=0;j<spaces;j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reversedPyramidPattern(int rows) {
        int spaces=0;
        for (int i=rows;i>0;i--) {
            for (int j=0;j<spaces;j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightStarPattern(int rows) {
        for (int i=1;i<=rows;i++) {
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftStarPattern(int rows) {
        int spaces=rows;
        for (int i=1;i<=rows;i++) {
            for (int j=0;j<spaces;j++) {
                System.out.print("  ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
    }

    public static void diamondPattern() {
        System.out.println("    *\n   ***\n  *****\n *******\n*********\n *******\n  *****\n   ***\n    *\n");
    }

    public static void downwardTriangle(int rows) {
        for (int i=rows;i>0;i--) {
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void mirroredRightTriangle(int rows) {
        for (int i=1;i<=rows;i++) {
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
