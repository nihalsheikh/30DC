package com.apna.VariableAndDatatypes;
import java.util.*;

public class productOfNums {
    public static void main(String[] args) {
        // Making Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking num inputs and applying arithmetics
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;

        // Printing output
        System.out.println("Product of a * b = " + product);
    }
}
