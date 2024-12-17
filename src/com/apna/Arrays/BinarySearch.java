package com.apna.Arrays;

import org.w3c.dom.ls.LSOutput;

public class BinarySearch {
    public static int Binary(int[] arr, int key) {
        // Initializing the start and end index of array
        int start = 0, end = arr.length - 1;

        while(start <= end) { // condition will be true until we have a single element
            int mid = (start + end) / 2; // calculate the mid-point of array

            // Comparing the mid-element with key to find our key
            if(arr[mid] == key) { // if mid is key, return its index num, which is mid
                return mid; // when mid is found, return immediately
            }
            if (arr[mid] < key) { // & if arr[mid] is lesser, then search for key in right part of array
                start = mid + 1; // update start
            }
            else { //  if arr[mid] is greater, search in the left part of our array
                end = mid - 1; // updating end
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int key = 14;

        int BinSearch = Binary(arr, key); // storing index in a var

        if(BinSearch == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Key "+key+" is at index: "+BinSearch);
        }
    }
}
