package com.apna.AdvancePatterns;

import java.util.Scanner;

public class HollowRhombus {
    public static void H_Rhombus(int n) {
        // Outer loop
        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Hollow rhombus loop logic
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  "); // space in between
                }
            } // REMEMBER: if you want to give space in between stars, then also
              // increase the spaces in the else loop

            System.out.println(); // go to next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        H_Rhombus(n);
    }
}
