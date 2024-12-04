package com.apna.Methods;

import java.util.Scanner;

public class DecimalNum {
    // Decimal to Binary Number conversion (base 10 to base 2)
    public static int Decimal(int decNum) {
        int pow = 0; // power. that will be incremented every loop
        int binNum = 0; // last remainders we are storing from dec to bin
        int binDig = 0; // the final binary number converted

        while(decNum > 0) {
            binNum = decNum % 2; // getting remainders from dec to bin
            binDig = binDig + binNum * (int)Math.pow(10, pow); // storing binary in final binary digit

            pow++; // incrementing power
            decNum = decNum / 2; // updating the original decimal number every loop after dividing by 2
        }
        return binDig;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt(); // taking the decimal number input

        int binNum = Decimal(decNum); // storing the binary number here obtained from method
        System.out.println(binNum);
    }
}
