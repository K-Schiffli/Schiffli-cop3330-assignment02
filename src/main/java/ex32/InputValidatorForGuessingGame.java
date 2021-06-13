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
