package com.apna.Sorting;

import java.util.Arrays;

public class InbuiltSort {
    public static void Inbuilt(int[] arr) {
        // inbuilt function of java
        Arrays.sort(arr); // Inbuilt in java function
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        Inbuilt(arr); // for simple ascending sorting of array

        // Syntax for sorted array of a length you want
        Arrays.sort(arr, 0, 3);
    }
}
