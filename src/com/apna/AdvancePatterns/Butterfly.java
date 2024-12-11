package com.apna.AdvancePatterns;
import java.util.Scanner;

public class Butterfly {
    public static void Triangle(int n) {
        // Code divided in 2 parts: Upper and Lower half
        // Every half need 3 different loops: for stars, space and stars again

        // Upper Part
        for(int i=1; i<=n; i++) { // loop for no. of lines
            // stars = i
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            // spaces = 2 * (n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }

            // stars = i
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Part
        for(int i=n; i>=1; i--) {
            // stars = i
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            // spaces = 2 * (n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            }

            // stars = i
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Triangle(n);
    }
}
