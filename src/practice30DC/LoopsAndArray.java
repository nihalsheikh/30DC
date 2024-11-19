package practice30DC;

import java.util.Scanner;

public class LoopsAndArray {
    public static void main(String[] args) {
        // For Loop
        int n = 10;
        for(int i = 0; i < n; i++) {
//            System.out.println("This is a For Loop used for " + i + " times");
        }

        // While Loop
        int i = 0;
        while(i<10) {// Syntax: while(condition){code + increment/decrement }
//            System.out.println("This is the use of while loop for " + i + " times");
            i++;
        }

        // Do While Loop
        int d = 0;
        do {
//            System.out.println("This is Do While Loop usage "+ d+ " times");
            d++;
        } while (d < 10);


        // Arrays
        // direct one line arrays declaration and initialization
        int[] array1 = {10,20,30};
//        System.out.println("Number in array1: "+array1[0]);

        // Array declaration and then initialization
        int[] array2 = new int[5];
        array2[0] = 1;
        array2[1] = 2;
//        System.out.println("Number in array2: "+array2[0]);

        // Array Input from user
        Scanner sc = new Scanner(System.in);
        int[] numInput = new int[5];

        for(int num = 0; num < 5; num++) {
            numInput[num] = sc.nextInt(); // storing input from user in the ith index
        }

        // printing whole array using loop
        for(int a = 0; a < numInput.length; a++) {
            System.out.print("Array element at a: "+ a + " :");
            System.out.println(numInput[a]);
        }
    }
}
