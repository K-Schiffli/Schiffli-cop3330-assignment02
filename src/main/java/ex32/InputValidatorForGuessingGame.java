/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex32;

public class InputValidatorForGuessingGame {
    public boolean validateInput(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }

        if (Integer.parseInt(input) == 0 || Integer.parseInt(input) > 3) return false;
        else return true;
    }
}
