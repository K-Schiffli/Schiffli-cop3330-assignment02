/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex25;

public class PasswordTester {
    public static int testPassword(String password) {

        char[] passwordArr = password.toCharArray();

        boolean foundLetter = false;
        boolean foundNumber = false;
        boolean foundSpecChar = false;

        for (char c : passwordArr) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                foundLetter = true;
            if ((c >= '0' && c <= '9'))
                foundNumber = true;
            if ((c >= '!' && c <= '/') || (c >= ':' && c <= '@'))
                foundSpecChar = true;
        }

            if (passwordArr.length < 8 && (!foundLetter && foundNumber && !foundSpecChar))
                return 1;
            else if ((passwordArr.length < 8 && (foundLetter && !foundNumber && !foundSpecChar)
                    || (!foundLetter && !foundNumber && foundSpecChar)))
                return 2;
            else if ((passwordArr.length < 8 && (foundLetter || foundNumber))
                    || ((!foundLetter || !foundNumber) && foundSpecChar))
                return 3;
            else if (passwordArr.length > 8 && (foundLetter && foundNumber && !foundSpecChar))
                return 4;
            else if (passwordArr.length > 8 && foundLetter && foundNumber)
                return 5;
            else return 0;
        }
}
