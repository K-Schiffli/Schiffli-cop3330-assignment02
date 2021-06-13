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
