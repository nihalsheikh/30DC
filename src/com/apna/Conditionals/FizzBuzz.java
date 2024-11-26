package com.apna.Conditionals;

public class FizzBuzz {
    public static void main(String[] args) {
        // num variables
        for(int i = 0; i <= 100; i++) {
            boolean exp1 = i%2 == 0;
            boolean exp2 = i%5 == 0;

            if(exp1 && exp2) {
                System.out.println("fizzbuzz " + i);
            }
            else if(exp1) {
                System.out.println("fizz " + i);
            } else if (exp2) {
                System.out.println("buzz " + i);
            }
            else {
                System.out.println("Other number " + i);
            }
        }
    }
}