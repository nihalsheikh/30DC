package com.apna.AdvancePatterns;
import java.util.Scanner;

public class InvertedPyramid {
    // Right-sided pyramid
    public static void InvPyramid(int n) {
        // we will need 3 loops to print inverted pyramid
        for(int i=0; i<=n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        InvPyramid(n);
        sc.close();
    }
}
