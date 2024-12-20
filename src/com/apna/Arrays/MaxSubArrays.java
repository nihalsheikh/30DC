package com.apna.Arrays;

public class MaxSubArrays {
    public static void Sub_Arrays(int[] arr) {
        int totalSubArrays = 0; // formula for counting total subArrays: (n*(n+1))/2

        for(int i=0; i<arr.length; i++) {
            int startElement = i;

            for(int j=i; j<arr.length; j++) { // not i+1 as we also want single subarray element
                int endElement = j;

                for(int k=startElement; k<=endElement; k++) {
                    System.out.print(arr[k] + " "); // printing sub_arrays
//                    int sumSubArrays = 0;
//                    System.out.print("sum of subarray = "+ (sumSubArrays+arr[k]) );
                }
                totalSubArrays++;
                System.out.println(); // print the next sub_array
            }
            System.out.println(); // next line
        }
//        int totalNumOfSubArrays = (arr.length*(arr.length + 1) )/ 2;
        System.out.println("Total Sub Arrays: " + totalSubArrays);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Sub_Arrays(arr);
    }
}
