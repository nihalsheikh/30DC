package com.apna.Arrays;

public class LinearSearch {
    public static void Linear(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 10) {
                System.out.print(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};

        System.out.println("Element 10 is at position: ");

        Linear(arr);
    }
}
