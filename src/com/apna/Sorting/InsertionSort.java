package com.apna.Sorting;

public class InsertionSort {
    public static void Insertion(int[] arr) {
        // Time Complexity: O(n^2)
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            // finding the correct position for insertion
            while(prev >= 0 && arr[prev] > curr) { // arr[prev] < curr for Descending order
                arr[prev+1] = arr[prev];
                prev--;
            }

            // inserting elements
            arr[prev+1] = curr;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};

        Insertion(arr);
    }
}
