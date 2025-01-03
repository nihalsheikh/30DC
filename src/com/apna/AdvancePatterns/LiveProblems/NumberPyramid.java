package com.apna.AdvancePatterns.LiveProblems;

import java.util.Scanner;

public class NumberPyramid {
    public static void Pyramid(int n) {
        for(int i=1; i<=n; i++) { // outer loop for no. of lines
            // spaces
            for(int j=1; j<=n-i; j++) { // spaces before nums should be n-i
                System.out.print(" ");
            }

            // numbers logic
            for(int j=1; j<=i; j++) { //
                System.out.print(i + " ");
            }
            System.out.println(); // next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pyramid(n);
        sc.close();
    }
}
