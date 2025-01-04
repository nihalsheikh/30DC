package com.apna.Arrays;

public class TrappingRainwater {
    public static int Rainwater(int[] arr) {
        int n = arr.length;

        // calculate left max boundary - arr
        int[] maxLeft = new int[n]; // Left maximum boundary from height(arr)
        maxLeft[0] = arr[0]; // initial value is always same as 1st element of arr
        for(int i=1; i<n; i++) { // loop to check left maximum boundary
            maxLeft[i] = Math.max(maxLeft[i], maxLeft[i-1]);
        }

        // calculate right max boundary - arr
        int[] maxRight = new int[n]; // Right maximum boundary
        maxRight[n-1] = arr[n-1];
        for(int i=1; i<n; i++) {
            maxRight[i] = Math.max(maxRight[i], maxRight[i+1]);
        } // need to optimize


        int trappedRainwater, waterLevel;
        trappedRainwater = 0;

        // loop for Water level
        for(int i=0; i<n; i++) {
            waterLevel = Math.max(maxLeft[i], maxRight[i]) - Math.min(maxLeft[i], maxRight[i]);
            trappedRainwater = Math.min(trappedRainwater, waterLevel);
        }

        // waterLevel = minimum of (left boundary and right boundary)
        // trappedRainwater = waterLevel - currentHeight[i]


        return trappedRainwater;
    }

    public static void main(String[] args) {
        System.out.println("Trapping Rainwater");
        int[] arr = {4,2,0,6,3,2,5};

        Rainwater(arr);
    }
}