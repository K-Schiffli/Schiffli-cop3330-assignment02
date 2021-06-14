/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        StatisticCalculator sc = new StatisticCalculator();
        List<Double> numbers = getNumbers();

        double average = sc.average(numbers);
        double maximum = sc.max(numbers);
        double minimum = sc.min(numbers);
        double stdDeviation = sc.std(numbers);

        printOutput(numbers, average, maximum, minimum,stdDeviation);

    }

    private static void printOutput(List<Double> numbers, double average, double maximum, double minimum, double stdDeviation) {

        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.printf("%.0f ", numbers.get(i));
        }
        System.out.printf("\nThe average is %.2f\nThe minimum is %.0f\nThe maximum is %.0f\nThe standard deviation is %.2f",
                average, maximum, minimum, stdDeviation);
    }

    private static List<Double> getNumbers() {

        boolean inputFlag = true;
        List<Double> numbers = new ArrayList();
        while (inputFlag) {
            System.out.println("Enter a number: ");
            String input = in.nextLine();
            try {
                numbers.add(Double.parseDouble(input));
            } catch (NumberFormatException e) {
                if ("done".equals(input.toLowerCase(Locale.ROOT))) inputFlag = false;
                else System.out.println("Please enter a valid number, or 'done' to finish entering numbers");
            }
        }

        return numbers;
    }
}