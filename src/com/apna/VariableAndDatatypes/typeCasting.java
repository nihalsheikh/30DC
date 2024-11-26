package com.apna.VariableAndDatatypes;

public class typeCasting {
    public static void main(String[] args) {
        // Type Casting
        float a = 3.1461f;

        /*
            varType varName = (<typeCasting type>) value;
        */
        int b = (int) a;
        System.out.println("After type casting, value of b is: "+b);

        // Type casting can also be performed on char data types
        // Java follows Unicode + ASCII
        char ch = 'a';
        int x = (int) ch;
        System.out.println("char a after type casting is: " + x);
    }
}
