package com.apna.VariableAndDatatypes;

public class typePromotion {
    public static void main(String[] args) {
        // Type Promotion
        char a = 'a'; // a = 97
        short b = 50;

        // type casting char a
        System.out.println("Type casting, char a = "+ (int) a);

        System.out.println("a + b = "+ (a + b));

        // example 2:
        char x = 'x';
        char y = 'y';

        System.out.println("Type casting, char y = "+ (int) y);
        System.out.println("Type casting, char x = "+ (int) x);

        System.out.println("y - x = "+ (y - x));


        // example with long, float, double
        float fl = 5.192f;
        long l = 300;
        double d = 35.2145;
        System.out.println("fl + l + d = " + (fl + l + d));
    }
}
