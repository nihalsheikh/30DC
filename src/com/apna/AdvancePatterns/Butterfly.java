package com.apna.AdvancePatterns;
import java.util.Scanner;

public class Butterfly {
    public static void Triangle(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n+n; j++) {

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
