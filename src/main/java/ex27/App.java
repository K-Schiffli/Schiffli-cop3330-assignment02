package ex27;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ) {
        DataValidator dv = new DataValidator();

        String firstName = getName("first");
        String lastName = getName("last");
        String zipCode = getZIP();
        String employeeID = getID();

        String[] validations = dv.validateInput(firstName, lastName, zipCode, employeeID);
        printOutputs(validations);
    }

    private static void printOutputs(String[] validations) {
        boolean allValid = true;
        for (int i = 0; i < 4; i++)
        {
            if (!"Valid".equals(validations[i]))
            {
                allValid = false;
            }
        }

        if(allValid) System.out.println("There were no errors found.");
        else
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.print(validations[i]);
            }
        }

    }

    public static String getName(String nameSelector)
    {
        System.out.println("Please enter your " + nameSelector + " name: ");
        return in.nextLine();
    }

    public static String getZIP()
    {
        System.out.println("Please enter your ZIP code");
        return in.nextLine();
    }

    public static String getID()
    {
        System.out.println("Please enter your employee ID");
        return in.nextLine();
    }


}
