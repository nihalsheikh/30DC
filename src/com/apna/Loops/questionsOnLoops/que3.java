package com.apna.Loops.questionsOnLoops;
import java.util.*;

public class que3 {
    public static void main(String[] args) {
        // factorial of a num
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
