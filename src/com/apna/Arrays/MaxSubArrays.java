package com.apna.Arrays;

public class MaxSubArrays {
    public static void Sub_Arrays(int[] arr) {
        int totalSubArrays = 0; // formula for counting total subArrays: (n*(n+1))/2
        System.out.println("*************** Sub arrays start here ***************");

        for(int i=0; i<arr.length; i++) {
            int startElement = i;

            for(int j=i; j<arr.length; j++) { // not i+1 as we also want single subarray element
                int endElement = j;

                for(int k=startElement; k<=endElement; k++) {
                    System.out.print(arr[k] + " "); // printing sub_arrays
                }
                totalSubArrays++; //in case of printing subarray un-comment this
                System.out.println(); // print the next sub_array
            }
            System.out.println(); // next line
        }
    }

    public static void SumOfSubArrays(int[] arr) {
        int currentSum = 0; // calc sub array sum of that instant
        int maxSum = Integer.MIN_VALUE;
        int totalSubArrays = 0;

        System.out.println("*************** Sum of Sub arrays start here ***************");

        for(int i=0; i<arr.length; i++) {
            int startElement = i;

            for(int j=i+1; j<arr.length; j++) {
                int endElement = j;
                currentSum = 0;

                for(int k=startElement; k<=endElement; k++) {
                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum of sub array = "+ maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Sub_Arrays(arr);
        SumOfSubArrays(arr);
    }
}
