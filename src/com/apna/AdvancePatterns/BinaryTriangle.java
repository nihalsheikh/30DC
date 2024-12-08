package com.apna.AdvancePatterns;

import java.util.Scanner;

public class BinaryTriangle {
    public static void Triangle(int n) {
        int binary = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(binary +1 + " ");
                binary = 0;
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
