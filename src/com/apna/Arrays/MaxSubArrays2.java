package com.apna.Arrays;

public class MaxSubArrays2 {
    /*
       **************************************************
                        PREFIX SUM METHOD
       **************************************************
    */

    public static void PrefixArraysSum(int[] arr) {
        int currentSum = 0; // store the sum of subarray
        int[] arr2 = new int[arr.length]; // store the sum of sub-array elemnt here increasing order of elements in sub-arrays

        for(int i=0; i<arr.length; i++) {
            arr2[i] = currentSum + arr[i];
            currentSum = arr2[i];
        }

        System.out.println("Sum of Sub arrays is: ");
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,4,6,8};

        PrefixArraysSum(arr);
    }
}
