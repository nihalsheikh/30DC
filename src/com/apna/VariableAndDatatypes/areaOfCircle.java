package com.apna.VariableAndDatatypes;
import java.util.*;

public class areaOfCircle {
    public static void main(String[] args) {
        // Scanner obj
        Scanner sc = new Scanner(System.in);

        // radius input
        int r = sc.nextInt();

        double area = 3.14 * r * r;

        System.out.println("Area of circle: " + area);
    }
}
