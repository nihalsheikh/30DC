package com.apna.Arrays;

public class LargestNum {
    public static int Largest(int[] arr) {
        int largest = Integer.MIN_VALUE; // Integer.MIN_VALUE means: -infinity

        for(int i=0; i<arr.length; i++) { // loop to check the largest num
            if(arr[i] > largest)
                largest = arr[i]; // updating the largest num every loop
        }

        return largest; // method needs to return an int value
    }

    public static void main(String[] args) {
        int[] arr = {1,3,63,5,7,9,11,70,12,16,50};

        int bigNum = Largest(arr); // strong the return value in bigNum variable
        System.out.println("Largest num in Array is: " + bigNum);
    }
}
