/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex37;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        PasswordGenerator pg = new PasswordGenerator();
        int length = getData("What's the minimum length? ");
        int numbers = getData("How many numbers? ");
        int sChars = getData("How many special characters? ");

        String password = pg.generatePassword(length, numbers, sChars);

        printOutput(password);
    }

    private static void printOutput(String password) {
        System.out.print("Your password is " + password);
    }

    private static int getData(String question) {
        System.out.print(question);
        String input = in.nextLine();
        boolean inputFlag = true;
        while (inputFlag) {
            try {
                Integer.parseInt(input);
                inputFlag = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer: ");
                input = in.nextLine();
            }
        }
        return Integer.parseInt(input);
    }

}