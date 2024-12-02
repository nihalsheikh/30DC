package com.apna.Methods;

public class Swapping {
    // Call by value
    // Swap - exchange values
    public static void main(String[] args) {
        // 1. take 2 initial variable of some values
        int a = 10;
        int b = 5;

        // 2. Create a temp variable and store value of a in it
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(temp);
    }
}
