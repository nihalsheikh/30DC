package com.apna.AdvancePatterns;
import java.util.Scanner;

public class InvertedHalfPyramid {
    // Right-sided pyramid
    public static void InvPyramid(int n) {
        for(int i=0; i<=n; i++) { // Loops for total lines or total rows

            // Space Loop
            for(int j=0; j<n-i; j++) { // this loop prints spaces before stars
                System.out.print(" ");
            }

            // Stars (*) Loop or any other, you can print (#) too
            for(int j=0; j<i; j++) { // this loop prints stars
                System.out.print("*");
            }

            System.out.println(); // go to next line after finishing a row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        InvPyramid(n);
        sc.close();
    }
}
