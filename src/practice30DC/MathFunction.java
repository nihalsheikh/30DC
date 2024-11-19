package practice30DC;

public class MathFunction {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 99, b = 10;
        double d = 50.00, f = 5.0;

        // Addition
        int add = a + b;
        System.out.println();

        // Subtraction
        int sub = a - b;
        System.out.println(sub);

        // Multiplication
        int mul = a * b;
        System.out.println(mul);

        // Division
        int div = a / b;
        System.out.println(div);

        // Modulo
        double mod = a % b;
        System.out.println(mod);

        // Increment
        int m = 10;
        m++; // the original value is counted first then the value is incremented

        int r = 20;
        ++r; // The original value is increased then counted

        // Decrement
        int n = 100;
        n--; // this means original value is same, then the value is decremented

        int q = 30;
        --q; // this means the original value is decremented first then count starts

        // Advance Addition
        int e = 10;
        e += 5; // this means e = e + 5

        //  Advance Subtraction
        e -= 5; // this means e = e - 5



        // Assignment Operators

        // = assigning values a = 8; meaning 8 is assigned to a
        // += advance addition
        // -= advance subtraction
        // *= advance multiplication
        // /= advance division
        // %= 	x %= 3  means  => 	x = x % 3


        // &= 	x &= 3  means  => 	x = x & 3
        /*
        *
        * */


        // |= 	x |= 3  means  => 	x = x | 3
        /*
        * int x = 5;  // binary: 0101
        * x |= 3;     // binary: 0011
        * Result: x = 7 (binary: 0111)
        * */


        // ^= 	x ^= 3 this is XOR operator  means  => 	x = x ^ 3
        /*
        * in XOR there is the addition of
        * binary numbers to get the result
        * int a = 5;  // binary = 0101
        * int b = 3;  // binary = 0011
        * a ^= b; // means a = a ^ b
        * System.out.println(a); // a = 6;  binary = 0110
        * */

        // >>= 	x >>= 3  means  => 	x = x >> 3
        // <<= 	x <<= 3  means  => 	x = x << 3


        // Comparison Operator

        // == 	Equal to 	x == y
        // != 	Not equal 	x != y
        // > 	Greater than 	x > y
        // < 	Less than 	x < y
        // >= 	Greater than or equal to 	x >= y
        // <= 	Less than or equal to 	x <= y



        // 01 Round off number
        double roundOff = Math.round(5.67);
//        System.out.println(roundOff);

        // 02 Ceil Value of a number
        double ceilValue = Math.ceil(4.3);
//        System.out.println(ceilValue);

        // 03 Floor Value of a number
        double floorValue = Math.floor(4.3);
//        System.out.println(floorValue);

        // 04 Logarithmic values
        double logValue = Math.log(100);
//        System.out.println(logValue);

        // 05 Random Values
        double randomValue = Math.random();
//        System.out.println(randomValue);

        // 06 Square Root of a number
        double sqrtOfNum = Math.sqrt(100);
//        System.out.println(sqrtOfNum);

        // 07 Cube Root of a number
        double cbrtOfNum = Math.cbrt(125);
//        System.out.println(cbrtOfNum);

        // 08 Power of a Number
        double powOfNum = Math.pow(2, 3);
//        System.out.println(powOfNum);

        // 09 Maximum value
        int maxValue = Math.max(10, 5);
//        System.out.println(maxValue);

        // 10 Minimum Value
        int minValue = Math.min(10, 5);
//        System.out.println(minValue);
    }
}
