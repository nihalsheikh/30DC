package com.apna.Operators.questionOnOperators;

public class que2 {
    public static void main(String[] args) {
        // Answer is Java
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java"); // Correct answer
        }
        if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
        }
    }
}
