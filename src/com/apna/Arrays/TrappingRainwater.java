package com.apna.Arrays;

public class TrappingRainwater {
    public static int Rainwater(int[] arr) {
        int n = arr.length;

        // calculate left max boundary - arr
        int[] maxLeft = new int[n]; // Left maximum boundary from height(arr)
        maxLeft[0] = arr[0]; // initial value is always same as 1st element of arr
        for(int i=1; i<n; i++) { // loop to check left maximum boundary
            maxLeft[i] = Math.max(arr[i], maxLeft[i-1]);
        }

        // calculate right max boundary - arr
        int[] maxRight = new int[n]; // Right maximum boundary
        maxRight[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            maxRight[i] = Math.max(arr[i], maxRight[i+1]);
        }

        int trappedRainwater = 0, waterLevel;

        // loop for Water level and trapped water calculation
        for(int i=0; i<n; i++) {
            // waterLevel = minimum of (left boundary and right boundary)
            waterLevel = Math.min(maxLeft[i], maxRight[i]);

            // trappedRainwater = waterLevel - currentHeight[i]
            trappedRainwater += waterLevel - arr[i];
        }

        return trappedRainwater;
    }

    public static void main(String[] args) {
        System.out.println("Trapping Rainwater");
        int[] arr = {4,2,0,6,3,2,5};

        int totalWaterTrapped = Rainwater(arr);
        System.out.println(totalWaterTrapped);
    }
}