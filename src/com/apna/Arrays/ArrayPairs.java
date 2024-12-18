package com.apna.Arrays;

public class ArrayPairs {
    public static void Pairs(int[] arr) {
        for(int i=0; i<=arr.length-1; i++) { // outer loop for increasing i
            for(int j=i+1; j<=arr.length-1; j++) { // inner loop for j
                System.out.print("(" +arr[i] + "," + arr[j] + ")" + " ");
            }
            System.out.println(); // next line
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        Pairs(arr);
    }
}
