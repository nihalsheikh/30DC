package com.apna.Sorting.PracticeQuestion;

public class SortingQuestion {
    public static void Bubble(int[] arr) { // Bubble Sort
        for(int turn=0; turn<arr.length-1; turn++) { //  loop for number of turns to sort
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j+1]) { // comparing elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void Selection(int[] arr) { // Selection Sort
        System.out.println();
    }

    public static void Insertion(int[] arr) { // Insertion Sort
        System.out.println();
    }

    public static void Counting(int[] arr) { // Counting Sort
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};

        System.out.println("Bubble Sort method used");
        Bubble(arr);

//        System.out.println();
//        System.out.println("Selection Sort method used");
//        Selection(arr);
//
//        System.out.println();
//        System.out.println("Insertion Sort method used");
//        Insertion(arr);
//
//        System.out.println();
//        System.out.println("Counting Sort method used");
//        Counting(arr);
    }
}
