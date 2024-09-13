package Java_Miscellaneous;

public class BitwiseOperators {
    public static void main(String[] args) {

        // and operator &
        // or operator |
        // XOR ^
        // not ~
        // left shift <<
        // right shift >>
        // unsigned right shift >>>

        /*
         * Bitwise Operations between 0 and 1
         * ------------------------------------
         * | A | B | A & B | A | B | ~A | A ^ B |
         * ------------------------------------
         * | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 0 |
         * | 0 | 1 | 0 | 0 | 1 | 1 | 1 | 1 |
         * | 1 | 0 | 0 | 1 | 0 | 0 | 1 | 1 |
         * | 1 | 1 | 1 | 1 | 1 | 0 | 0 | 0 |
         * --------------------------------------
         */

        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        int b = 5 & 4;
        // System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));

        // b = 5 | 4;
        // System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));

        // b = 5 ^ 7;
        // System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));

        // b = ~a; // change all 0 to 1 and 1 to 0
        // System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));

        // b = a << 2; // shift left bit by n postioned left behind to 0
        // System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));

        // b = -a << 2;
        // System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));

        // b = 11 >> 2;
        // System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));

        b = -a >> 2;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));

        // b = 11 >>> 2;
        // System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));

        b = -a >>> 2;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));

        // Signed Right Shift (>>)
        // Behavior: This preserves the sign of the number. It shifts the bits to the
        // right and fills the leftmost bits with the sign bit (0 for positive numbers,
        // 1 for negative numbers).

        // Unsigned Right Shift (>>>)
        // Behavior: This does not preserve the sign. It shifts the bits to the right
        // and fills the leftmost bits with 0, regardless of whether the original number
        // was positive or negative.

    }
}
