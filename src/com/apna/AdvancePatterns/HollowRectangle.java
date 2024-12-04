package com.apna.AdvancePatterns;

import java.util.Scanner;

public class HollowRectangle {
    // Hollow Rectangle
    public static void Hollow(int totRows, int totCols) {
        // loop to print the edge element only
        for(int i=0; i<totRows; i++) {  // outer loop is for rows
            for(int j=0; j<totCols; j++) { // inner loop is for columns
                // condition to print only the boundary elements
                if(i==0 || j==0 || i==totRows-1 || j==totCols-1) {
                    System.out.print("*"); // remember only to use print not ln
                }
                else {
                    System.out.print(" "); // empty space within the pattern
                }
            }
            System.out.println(); // going to next line or next row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totRows = sc.nextInt();
        int totCols = sc.nextInt();

        Hollow(totRows, totCols);
    }
}
