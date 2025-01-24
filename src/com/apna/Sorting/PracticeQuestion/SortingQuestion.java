package com.apna.Sorting.PracticeQuestion;

public class SortingQuestion {
    public static void Bubble(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Selection Sort
    public static void Selection(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;

            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Insertion Sort
    public static void Insertion(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >=0 && arr[prev] > curr) {
                arr[prev+1] = prev;
                prev--;
            }

            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};

        // Bubble Sort
        System.out.println("Bubble Sort called");
        Bubble(arr);

        // Selection Sort
        System.out.println("\nSelection Sort called");
        Selection(arr);

        // Insertion Sort
        System.out.println("\nInsertion Sort called");
        Insertion(arr);
    }
}
