package com.apna.Sorting;

public class BubbleSort {
    public static void Sorting(int[] arr) {
        // Bubble Sort
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Basic sorting
        int[] arr = {1,2,6,3,5,4};

        Sorting(arr);
    }
}
