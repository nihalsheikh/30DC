package com.apna.Loops;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // Square Pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Way 1
//        for(int lines = 0; lines < 4; lines++) {
//            System.out.println("* * * *");
//        }

        // Way 2
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
