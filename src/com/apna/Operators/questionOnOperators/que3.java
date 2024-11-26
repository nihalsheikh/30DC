package com.apna.Operators.questionOnOperators;

public class que3 {
    public static void main(String[] args){
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + ", " + y + ", " + z);
        // Output in int: 4, 0, 0
        // Output in double: 4.0, 0.0, 0.5
    }
}
