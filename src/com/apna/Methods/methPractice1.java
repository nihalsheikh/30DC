package com.apna.Methods;

import java.util.Scanner;

public class methPractice1 {
    // Method 1
    public static int sum(int x, int y) {
        int add = x + y;
        return add;
    }

    // Method 2
    public static void calcSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is: "+sum);
    }

    // Method 3
    public static void calcAdd(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum is: "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int add = sum(x,y); // method 1
        System.out.println("sum is: "+add);


//        calcSum(); // Method 2

//        calcAdd(x, y); // Method 3
    }
}
