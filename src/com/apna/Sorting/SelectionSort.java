package com.apna.Sorting;

public class SelectionSort {
    public static void Selection(int[] arr) {
        for(int turn=0; turn<arr.length-1; turn++) {
            int minPos = turn; // assuming turn is the minimum element position

            for(int j=turn+1; j<arr.length; j++) { // imp: not arr.length-1
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            // swap outside the loop, otherwise it will become like Bubble sort
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};

        Selection(arr);
    }
}
