/**
 * Author: Zia M
 * Date: Sep 08, 2026
 * Topic: Primitive Types
 */
public class Lesson1_PrimitiveTypes
{
    public static void main(String[] args)
    {
        /* Whole numbers */
        byte t = 127;    // size: 8 bits;  range: -2^7 to 2^7-1
        short v = 43;    // size: 16 bits; range: -2^15 to 2^15-1
        int c = 18;      // size: 32 bits; range: -2^31 to 2^31-1
        long x = 999101; // size: 64 bits; range: -2^63 to 2^63-1

        /* Decimal numbers */
        float q = 4.01;  // size: 32 bits; range: approx. -3.4*10^38 to 3.4*10^38
        double u = 19.84; // size: 64 bits; range: approx. -1.8*10^108 to 1.8*10^308

        /* Booleans */
        boolean b = false; // size: 8 bits; range: true or false (0 or 1)

        /* Characters */
        char g = 'r'; // size: 16 bits; range: -2^15 to 2^15-1
    }
}
