/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex32;

import java.util.Scanner;

public class GuessingGame {
    public int playGame(int number, Scanner in) {

        String result = "";
        int guesses = 1;

        if (number == -1) {
            System.out.println("I can't think of a number, I'm sorry"); System.exit(-1);
        }
        else System.out.print("I have my number. What's your guess? ");

        int guess;
        while (true)
        {
            guess = getGuess(in);
            guesses++;
            result = checkGuess(number, guess);
            if (result.equals("correct")) break;
            else System.out.print(result + " Guess again: ");

        }

        return guesses;
    }

    public String checkGuess(int number, int guess) {

        if (guess == number) return "correct";
        else if (guess > number) return "too high.";
        else if (guess < number) return "Too low.";
        else if (guess == -1) return "Invalid guess.";
        else return "LOGIC_ERROR";


    }

    private int getGuess(Scanner in) {
        String guess;
        guess = in.nextLine();
        try
        {
            return Integer.parseInt(guess);
        }
        catch (NumberFormatException e)
        {
            return -1;
        }
    }
}
