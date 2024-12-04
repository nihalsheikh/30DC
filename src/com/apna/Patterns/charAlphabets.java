package com.apna.Patterns;

import java.util.Scanner;

public class charAlphabets {
    public static void main(String[] args) {
        // Triangle with Alphabets
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input for the no. of lines
        char ch = 'A'; // we will increase ch value through loop

        for(int i=0; i < n; i++) { // no. of line loop
            for(int j=0; j<=i; j++) { // no. of char should print loop
                System.out.print(ch);
                ch++; // Increase ch value to go from A to B
            }
            System.out.println();
        }
    }
}
