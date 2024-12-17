package com.apna.Arrays;

public class ReverseArray {
    public static void Reverse(int[] arr) {
        int firstElement = 0, lastElement = arr.length - 1;

        // Swapping Element logic
        while(firstElement < lastElement) {
            int temp = arr[firstElement]; // temp var to save arrays first element
            arr[firstElement] = arr[lastElement]; // swapping elements
            arr[lastElement] = temp;

            firstElement++; // increment the index from start
            lastElement--; // decrement the index from end
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Original Array

        System.out.println("Original array is:");
        for(int i=0; i<arr.length; i++) { // Printing the Original Array
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n"); // go to new line

        Reverse(arr); // Reversing the Array

        System.out.println("New Reversed array is:");
        for(int i=0; i<arr.length; i++) { // Printing the Reversed array
            System.out.print(arr[i] + " ");
        }
    }
}
