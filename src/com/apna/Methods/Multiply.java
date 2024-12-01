package com.apna.Methods;
import java.util.Scanner;

public class Multiply {
    public static int product(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        // Create a method to return the product of two nums
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int multiplication = product(a, b);

        System.out.println(a + " * " + b + " = "+ multiplication);
    }
}
