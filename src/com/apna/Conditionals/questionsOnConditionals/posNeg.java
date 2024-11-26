package com.apna.Conditionals.questionsOnConditionals;
import java.util.*;

public class posNeg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        // Positive Negative nums
        if(num >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
