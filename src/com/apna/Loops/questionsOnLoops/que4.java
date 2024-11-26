package com.apna.Loops.questionsOnLoops;

import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        // Table of a num
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int table = 0;

        for(int i = 1; i <= 10; i++) {
            table += num;
            System.out.println(num +" x "+i+ " = " + table);
        }
    }
}
