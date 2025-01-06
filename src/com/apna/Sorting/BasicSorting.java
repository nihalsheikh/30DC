package com.apna.Sorting;

public class BasicSorting {
    public static void BubbleSort(int[] arr) {
        // basic sorting: ascending
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
    }

    public static void main(String[] args) {
        // Basic sorting
        int[] arr = {5,4,1,3,2};

        BubbleSort(arr);
    }
}
