package com.apna.Arrays;

public class ArrayUpdation {
    public static void Update(int[] marks) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int[] marks = {90, 91, 92};

        System.out.println("Old Marks");
        for(int i=0; i<marks.length; i++) { // printing old marks
            System.out.print(marks[i] + " ");
        }
        System.out.println("\n");

        // Update the marks
        Update(marks); // calling Update method with marks array as parameter

        System.out.println("New Marks");

        // print all marks from array
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " "); // marks with space in between
        }
        System.out.println(); // go to next line
    }
}
