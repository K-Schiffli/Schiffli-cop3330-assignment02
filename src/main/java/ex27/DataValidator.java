package ex27;

public class DataValidator {
    public String[] validateInput(String firstName, String lastName, String zipCode, String employeeID) {

        String validations[] = new String[4];
        validations[0] = validateName(firstName, "first");
        validations[1] = validateName(lastName, "last");
        validations[2] = validateZIP(zipCode);
        validations[3] = validateID(employeeID);

        return validations;
    }


    private String validateName(String name, String number) {

        if (name.length() == 0) return "The " + number +" name must be filled in";
        else if (name.length() < 2) {
            return "\"" + name + "\" is not a valid " + number + " name. It is too short.";
        }
        else return "Valid";
    }

    private String validateZIP(String zip) {

        if (zip.length() == 0) return "The ZIP code must be filled in.";
        else if(zip.length() != 5) return "The ZIP code must be a 5-digit number.";

        try
        {
            Integer.parseInt(zip);
            return "Valid";
        }
        catch (NumberFormatException e)
        {
            return "The ZIP code must be numeric.";
        }
    }

    private String validateID(String employeeID) {

        if (employeeID.length() == 0) return "The employee ID must be filled in.";
        else if (employeeID.length() != 7) return employeeID + " is not a valid ID.";
        char[] empIDArr = employeeID.toCharArray();

        if (Character.isLetter(empIDArr[0]) && Character.isLetter(empIDArr[1]) && empIDArr[2] == '-'
                && Character.isDigit(empIDArr[3]) && Character.isDigit(empIDArr[4]) && Character.isDigit(empIDArr[5])
                && Character.isDigit(empIDArr[6])){

            return "Valid";
        }
        return employeeID + " is not a valid ID.";

    }
}
