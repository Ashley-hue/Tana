package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = sc.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualIR = sc.nextDouble();
        System.out.print("Period (Years): ");
        int period = sc.nextInt();

        double monthlyIR = (annualIR / 100) / 12;
        int months = period * 12;

        double numerator = monthlyIR * Math.pow((1 + monthlyIR), months);
        double denominator = Math.pow((1 + monthlyIR), months) - 1;
        double result = principal * (numerator/denominator);
        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(result));
    }
}