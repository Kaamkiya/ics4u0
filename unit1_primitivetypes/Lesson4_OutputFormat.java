/**
 * Author: Zia M
 * Date: Sep 10, 2026
 * Topic: formatting output
 */
public class Lesson4_OutputFormat
{
    public static void main(String[] args)
    {
        int x = 12;
        System.out.printf("x = %10d\n", x); // Print x, and fill 10 spaces

        double y = 10.1984332;
        System.out.printf("y = %20.4f\n", y); // Print y to fill 20 spaces with 4 decimals

        boolean b = true;
        System.out.printf("b = %8b\n", b); // Print b to fill 4 spaces

        char c = '&';
        System.out.printf("c = %19c\n", c); // Print c to fill 19 spaces

        // allll together now
        System.out.printf("\033[31;1mx\033[0m=%4d, y=%7.2f, b=%7b, c=%12c\n", x, y, b, c);
    }
}
