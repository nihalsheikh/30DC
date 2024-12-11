package com.apna.AdvancePatterns;

import java.util.Scanner;

public class RhombusPattern {
    public static void Rhombus(int n) {
        // Rhombus Pattern loop
        for(int i=0; i<n; i++) { // outer loop for the number of lines in pattern
            for(int j=0; j<n-i; j++) { // loop for spaces before stars
                System.out.print(" ");
            }

            for(int j=0; j<n; j++) { // loop for stars
                System.out.print("* ");
            }
            System.out.println(); // go to next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Rhombus(n);
    }
}
