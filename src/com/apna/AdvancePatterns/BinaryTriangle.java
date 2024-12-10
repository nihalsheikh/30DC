package com.apna.AdvancePatterns;

import java.util.Scanner;

public class BinaryTriangle {
    public static void Triangle(int n) {
        for(int i=1; i<=n; i++) { // as usual loop for row lines
            for(int j=1; j<=i; j++) { // loop for column lines
                // condition to check if the (i,j) co-ordinates are even or odd
                // and then print the num you want
                if((i+j)%2==0) {
                    System.out.print("1"+ " ");
                }
                else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println(); // going to next line after finishing a line1
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Triangle(n);
    }
}
