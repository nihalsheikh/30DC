package com.apna.Arrays;

public class ArrayUpdation {
    // Passing array as arguments
    public static void Update(int[] marks) { // int[] marks arguments
        for(int i=0; i<marks.length; i++) { // Updating the array through loop
            marks[i] = marks[i]+1; // updating marks by adding 1 in marks
        }
    }

    public static void main(String[] args) {
        int[] marks = {80,85,95};

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
