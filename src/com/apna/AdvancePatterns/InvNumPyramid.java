package com.apna.AdvancePatterns;

import java.util.Scanner;

public class InvNumPyramid {
    public static void NumPyramid(int n) {
        // Print Nums in loop not stars
        for(int i=0; i<n; i++) { // Rows logic
            for(int j=1; j<=n-i; j++) { // Column Logic to print nums
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NumPyramid(n);
    }
}
