package com.apna.Loops.questionsOnLoops;
import java.util.*;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter nums: ");
            a = sc.nextInt();

            if(a % 2 == 0) {
                evenSum += a;
                System.out.println("even");
            }
            else {
                oddSum += a;
                System.out.println("odd");
            }
            break;
        } while (true);

    }
}
