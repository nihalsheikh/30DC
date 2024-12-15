package com.apna.Arrays;

public class LinearSearch {
    // Linear Search: Searching an Array Element using key & finding index element
    public static int LinearNum(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Using String array to find a dish(i.e. key) in menu(i.e. array)
    public static int StringMenu(String[] menu, String dish) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i] == dish) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20}; // Number array
        int key = 10;

        String[] menu = {"Dosa", "Idli", "Poha", "Vadapav", "Upma", "Sabudana"};
        String dish = "Vadapav";

        int index = LinearNum(arr, key); // saving the return value of LinearNum method
        int index2 = StringMenu(menu, dish); // saving the return value of StringMenu method

        // Number Search
        if(index == -1) {
            System.out.println("Number not found");
        }
        else {
            System.out.println("Element " + key + " is at index: " + index);
        }

        // Dish in the Menu
        if(index2 == -1) {
            System.out.println("Dish not found");
        }
        else {
            System.out.println("Dish " + dish + " is at index: " + index2);
        }
    }
}
