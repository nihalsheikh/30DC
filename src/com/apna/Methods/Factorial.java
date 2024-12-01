package com.apna.Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        int fact = 1;
        for(int i=1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {
        int nFact = fact(n);
        int rFact = fact(r);
        int nrFact = fact(n-r);

        int bCoeff = nFact / (rFact * nrFact);
        return bCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int factrl = fact(n); // Factorial
        int bcoeff = binCoeff(n, r); // Binomial Coefficient

        System.out.println("Binomial Coefficient = " + bcoeff);
    }
}
