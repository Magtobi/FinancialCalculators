package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number calculator you want to use");
        int calculator = myScanner.nextInt();
        if (calculator == 1);{
            MortgageCalculator();
        }
        if (calculator == 2) ;
            FutureValueCalculator();

        if (calculator == 3);
            AnnuityCalculator();
        }

    // Mortgage Calculator
        public static void MortgageCalculator() {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter principal amount: ");
            double principal = myScanner.nextDouble();

            System.out.print("Enter annual interest rate (in percentage): ");
            double annualInterestRate = myScanner.nextDouble() / 100.0;

            System.out.print("Enter loan term (in years): ");
            int years = myScanner.nextInt();
            double monthlyInterestRate = annualInterestRate / 12.0;
            int numberOfPayments = years * 12;
            double monthlyPayments = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

            System.out.println("Monthly mortgage payment: $" + monthlyPayments);
            myScanner.close();
        }
        // Future Value Calculator
        public static void FutureValueCalculator() {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter your deposit amount: ");
            double deposit = myScanner.nextDouble();
            System.out.println(deposit);

            System.out.println("Your interest: ");
            double interest = myScanner.nextDouble();
            System.out.println(interest);

            System.out.println("Number of years: ");
            double years = myScanner.nextDouble();
            System.out.println(years);

            interest /= 100;
            double total = deposit * Math.pow(interest + 1, years);

            double totalinterest = total - deposit;
            System.out.printf("Your total is: %.2f", total);
            System.out.println();
            System.out.printf("Your total interest is: %.2f", totalinterest);
            myScanner.close();
        }


    // Annuity Calculator
        public static void AnnuityCalculator() {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("What is the monthly payout?: ");
            double payout = myScanner.nextDouble();
            System.out.println(payout);

            System.out.println("What is the interest?: ");
            double interest = myScanner.nextDouble();
            System.out.println(interest);

            System.out.println("How many years?: ");
            double years = myScanner.nextDouble();
            System.out.println(years);

            interest /= 1200;
            double totalPayout = payout * ((1 - Math.pow((1 + interest), (-1 * years * 12))) / interest);
            System.out.printf("Total payout is: %.2f", totalPayout);


        }

    }