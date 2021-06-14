/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex29;

public class InputValidator {
    public boolean validateInput(String input) {
        try
        {
            Double.parseDouble(input);
        }
        catch (NumberFormatException e)
        {
            return false;
        }

        if (Double.parseDouble(input) == 0) return false;

        return true;
    }
}
