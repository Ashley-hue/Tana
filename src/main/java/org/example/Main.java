package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = 0;
        double annualIR = 0;
        int period = 0;
        while(principal < 1000 || principal > 1000000){
            System.out.print("Enter Principal (Ksh 1K - 1M): ");
            principal = sc.nextInt();
        }
        while(annualIR == 0 || annualIR > 30){
            System.out.print("Annual Interest Rate (1 - 30): ");
            annualIR = sc.nextDouble();
        }

        while(period < 1 || period > 30){
            System.out.print("Period (Years) (1 - 30): ");
            period = sc.nextInt();
        }

        double monthlyIR = (annualIR / 100) / 12;
        int months = period * 12;

        double numerator = monthlyIR * Math.pow((1 + monthlyIR), months);
        double denominator = Math.pow((1 + monthlyIR), months) - 1;
        double result = principal * (numerator/denominator);
        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(result));
    }
}