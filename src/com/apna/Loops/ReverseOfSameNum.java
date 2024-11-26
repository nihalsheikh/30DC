package com.apna.Loops;

public class ReverseOfSameNum {
    public static void main(String[] args) {
        // changing the original num as its reverse
        int n = 123456;
        int rev = 0;

        while (n > 0) {
            // Don't write print statement inside loop
            int lastDigit = n % 10; // taking last digit
            rev = (rev * 10) + lastDigit; // making the reverse num

            n /= 10; // updating the n to new num
        }

        System.out.println(rev);

    }
}
