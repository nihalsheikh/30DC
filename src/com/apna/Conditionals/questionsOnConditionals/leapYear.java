package com.apna.Conditionals.questionsOnConditionals;
import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        // take a year as input and print whether if it is leap or not
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4 == 0) {
            if(year%100 == 0) {
                if(year%400 == 0) {
                    System.out.println("This is a leap year");
                }
            }
//            else {
//                System.out.println("This is not a leap year");
//            }
        }
        else {
            System.out.println("This is not a leap year");
        }
    }
}
