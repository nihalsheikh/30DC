package com.apna.AdvancePatterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void Triangle(int n) {
        int count = 0; // this variable make counts the rows in order
        for(int i=1; i<=n; i++) { // loops for the number of rows
            for(int j=1; j<=i; j++) { // Loop to print nums in increasing order
                System.out.print(count + 1 + " "); // add num to count var
                count++; //increment count var
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
