package com.apna.VariableAndDatatypes.questionsOfVariableModules;
import java.util.*;

public class billOfItems {
    public static void main(String[] args) {
        // Question 3: Total Cost of Items
        Scanner sc = new Scanner(System.in);

        // List
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        // Total cost
        float totalCost = pencil + pen + eraser;

        // GST on items
        // don't take % symbol as percentage, it is for Modulus operator
        float finalCost = ((18 * totalCost) / 100) + totalCost;

        // close Scanner object
        sc.close();

        // Print bill
        System.out.println("Final bill amount is: " + finalCost);
    }
}
