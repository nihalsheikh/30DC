package com.apna.Arrays;

public class MaxSubArrays2 {
    /*
       **************************************************
                        PREFIX SUM METHOD
       **************************************************
    */

    public static void PrefixArraysSum(int[] arr) {
        int[] prefix = new int[arr.length]; // store all sum of sub-array elements here increasing order of elements in sub-arrays

        // first element of prefix array will be same as original arr element
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++) { // starting from 1 as 0 is fixed
            prefix[i] = prefix[i-1] + arr[i]; // calculating sum of sub-array formula
        }

        System.out.println("Sum of Sub arrays is: "); // print the array containing sum
        for(int i=0; i<prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }

    public static void Kadanes(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<arr.length; i++) {
            currSum = currSum + arr[i];

            if(currSum < 0)
                currSum = 0;

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Max sub-array sum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 4, 3, 7};

//        PrefixArraysSum(arr);
        Kadanes(arr);
    }
}