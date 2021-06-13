package ex32;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        RandomNumberGenerator rng = new RandomNumberGenerator();
        GuessingGame gg = new GuessingGame();

        boolean playAgain = true;
        int difficulty;
        int number;
        int result;

        System.out.print("Let's play Guess the Number!\n");

        while (playAgain) {
            difficulty = getDifficulty();
            number = rng.generateNumber(difficulty);
            result = gg.playGame(number, in);
            System.out.print("You got it in " + result + " guesses!\n\n");
            playAgain = askToContinue();
        }
    }

    private static boolean askToContinue() {
        boolean validFlag = true;
        String choice;
        while (validFlag) {
            System.out.print("Do you wish to play again (Y/N)?");

                choice = in.nextLine();
                if (choice.equals("Y") || choice.equals("y")) return true;
                else if (choice.equals("N") || choice.equals("n")) return false;
                else System.out.print("I'm sorry, I didn't understand that.\n");
        }
        return false;
    }

    private static int getDifficulty() {

        InputValidatorForGuessingGame ivfgg = new InputValidatorForGuessingGame();
        boolean validFlag = false;
        String input = "INPUT_FAILURE";
        while (!validFlag) {
            System.out.print("\nEnter the difficulty level (1, 2, or 3) ");;
            input = in.nextLine();
            validFlag = ivfgg.validateInput(input);
            if (!validFlag) System.out.print("Please input a valid number.\n");
        }
        return Integer.parseInt(input);
    }

}