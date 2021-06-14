/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex25;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ) {
        String password = getPassword();
        PasswordTester pt = new PasswordTester();
        int passwordStrength = pt.testPassword(password);

        String output = createOutput(passwordStrength, password);
        printOutput(output);
    }

    public static String getPassword()
    {
        System.out.println( "Please enter your password: ");
        return in.nextLine();
    }

    public static String createOutput (int passwordStrength, String password)
    {
        String strengthRating = "VALIDATION_ERROR";

        switch (passwordStrength)
        {
            case 1: strengthRating = "very weak"; break;
            case 2: strengthRating = "weak"; break;
            case 3: strengthRating = "moderate"; break;
            case 4: strengthRating = "strong"; break;
            case 5: strengthRating = "very strong"; break;
        }


        return "The password \'" + password + "\' is a " + strengthRating + " password.";

    }

    public static void printOutput (String output)
    {
        System.out.println(output);
    }
}
