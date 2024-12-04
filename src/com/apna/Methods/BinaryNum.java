package com.apna.Methods;

import java.util.Scanner;

public class BinaryNum {
    // Binary to Decimal Number (base 2 to base 10)
    public static int BinaryToDec(int binNum) {
        int pow = 0; // initially power will be 0
        int lastDig = 0; // start the last digit with 0
        int decNum = 0; // decimal num ber initialized with 0

        while(binNum > 0) { // binary 0 & decimal 10 are same
            lastDig = binNum % 10; // Formula to get last digit of any number
            // Formula to get New decimal number from binary to decimal
            decNum = decNum + (lastDig * (int)Math.pow(2, pow));
            pow++; // power will be increased every loop
            binNum = binNum / 10; // binary number updated by removing last digit
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();

        // storing decimal num in a variable
        int decNum = BinaryToDec(binNum);
        System.out.println("Decimal of: "+binNum+" = "+decNum);
    }
}
