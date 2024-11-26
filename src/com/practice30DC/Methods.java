package com.practice30DC;

public class Methods {
    // practice30DC.Methods
    static String method1(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    static int addMethod(int a, int b){
        return a + b;
    }

    // Method overloading
    static int meth1(int x, int y){
        return x + y;
    }

    static int meth1(int x){
        return x;
    }

    static double meth1(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        // Calling the methods
        String fullName = method1("John", "Doe");
        System.out.println("Full name is: "+fullName);

        // calling addMethod
        int addition = addMethod(10,5);
        System.out.println("Sum is: "+addition);

        // Method Overloading
        // practice30DC.Methods with same name but different parameters

        // return sum of int
        int intSum = meth1(5, 5);
        System.out.println(intSum);

        // return int meth1
        int myInt = meth1(10);
        System.out.println(myInt);

        // return sum of double
        double doubleSum = meth1(10.11, 5.89);
        System.out.println(doubleSum);
    }
}
