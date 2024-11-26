package com.apna.VariableAndDatatypes.questionsOfVariableModules;
import java.util.*;

public class areaOfSquare {
    public static void main(String[] args) {
        // Question 2: Area of Square
        Scanner sc = new Scanner(System.in);

        // Input side
        int side = sc.nextInt();

        // Calculate area
        int area = side * side;

        // close Scanner object
        sc.close();

        // Print output
        System.out.println("Area of square is: " + area);
    }
}
