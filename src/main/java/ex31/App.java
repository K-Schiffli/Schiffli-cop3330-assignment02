/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex31;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int age = getNumericInput("age");
        int restingHR = getNumericInput("resting heart rate");

        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        double[] targetHRArr = thrc.calcTargetHeartRate(age, restingHR);

        printTable(targetHRArr, age, restingHR);
    }

    private static void printTable(double[] targetHRArr, int age, int restingHR) {
        int index = 0;
        DecimalFormat decFormat = new DecimalFormat("#,###");
        String targetHR;

        System.out.print("\nResting Pulse: " + restingHR + "\tAge: " + age + "\n");
        System.out.print("\nIntensity\t| Rate\n");
        System.out.print("------------|--------\n");
        for (int i = 55; i <= 95; i += 5)
        {
            targetHR = decFormat.format(targetHRArr[index]);
            System.out.print(i + "%\t\t\t| " + targetHR + " BPM\n");
            index++;
        }
    }

    private static int getNumericInput(String prompt) {
        InputValidator iv = new InputValidator();
        boolean validFlag = false;
        String input = "INPUT_FAILURE";
        while (!validFlag) {
            System.out.println("What is your " + prompt + "? ");
            input = in.nextLine();
            validFlag = iv.validateInput(input);
            if (!validFlag) System.out.print("Sorry. That's not a valid number.\n");

        }
        return Integer.parseInt(input);

    }
}
