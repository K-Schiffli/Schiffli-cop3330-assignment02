/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        WinnerPicker wp = new WinnerPicker();
        List<String> namesList = getNames();

        String winner = wp.pickWinner(namesList);

        printOutput(winner);
    }

    private static void printOutput(String winner) {
        System.out.print("The winner is... " + winner);
    }

    private static List<String> getNames() {
        List<String> namesList = new ArrayList<>();
        boolean validFlag = true;
        String input;
        while (validFlag)
        {
            System.out.print("Enter a name: ");
            input = in.nextLine();
            if (input.equals("")) break;
            else namesList.add(input);
        }

        return namesList;
    }
}