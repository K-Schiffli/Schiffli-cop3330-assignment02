/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        StringSplitter ss = new StringSplitter();
        String numbers = getNumbers();

        ArrayList<String> result = ss.filterEvenNumbers(numbers);

        printOutput(result);

    }

    private static void printOutput(ArrayList<String> result) {
        System.out.print("The even numbers are ");
        for(int i = 0; i < result.size(); i++)
        {
            System.out.print(result.get(i) + " ");
        }
    }

    private static String getNumbers() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        return in.nextLine();
    }
}