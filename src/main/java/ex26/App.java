/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex26;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ) {

        PaymentCalculator pc = new PaymentCalculator();
        String balance = getData("your balance? ");
        String APR = getData("the APR on the card (as a percent)? ");
        String payment = getData ("the monthly payment you can make? ");

        String months = pc.calculateMonthsUntilPaidOff(balance,APR,payment);
        printOutput(months);

    }

    private static String getData(String question) {
        System.out.println( "What is " + question);
        return in.nextLine();
    }

    private static void printOutput(String months) {
        if (months.equals("-1"))
        {
            System.out.println("Calculation Failed");
        }
        else System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
