package com.apna.Methods;

import java.util.Scanner;

public class FuncOver {
    // Function Overloading
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // double input
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        multiply(a, b); // two int multiplication
        multiply(x, y); // two double multiplication
        multiply(a, b, c); // three int multiplication

    }
}
