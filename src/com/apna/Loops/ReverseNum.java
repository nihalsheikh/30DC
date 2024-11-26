package com.apna.Loops;

public class ReverseNum {
    public static void main(String[] args) {
        // Print the Reverse of a number
        int n = 123456789;

        while (n > 0) {
            int rev = n % 10;
            n /= 10;
            System.out.print(rev);
        }
        System.out.println(" ");
    }
}
