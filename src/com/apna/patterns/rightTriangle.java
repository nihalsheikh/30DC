package com.apna.patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rightTriangle {
    void rightAngleTriangle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void invertedRightTriangle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j<n-i; j++) { // Don't use println
                System.out.print("*"); // Only print * in the same line
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightTriangle obj = new rightTriangle();
//        obj.rightAngleTriangle();
        obj.invertedRightTriangle();
    }
}
