/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    public String generatePassword(int length, int numbers, int sChars) {

        Random rand = new Random();

        StringBuilder password = new StringBuilder();

        List<String> charactersList = new ArrayList<>();
        charactersList.add("a"); charactersList.add("b"); charactersList.add("c"); charactersList.add("d");
        charactersList.add("e"); charactersList.add("f"); charactersList.add("g"); charactersList.add("h");
        charactersList.add("i"); charactersList.add("j"); charactersList.add("k"); charactersList.add("l");
        charactersList.add("m"); charactersList.add("n"); charactersList.add("o"); charactersList.add("p");
        charactersList.add("q"); charactersList.add("r"); charactersList.add("s"); charactersList.add("t");
        charactersList.add("u"); charactersList.add("v"); charactersList.add("w"); charactersList.add("x");
        charactersList.add("y"); charactersList.add("z");

        List<String> numbersList = new ArrayList<>();
        numbersList.add("1"); numbersList.add("2"); numbersList.add("3"); numbersList.add("4"); numbersList.add("5");
        numbersList.add("6"); numbersList.add("7"); numbersList.add("8"); numbersList.add("9"); numbersList.add("0");

        List<String> sCharsList = new ArrayList<>();
        sCharsList.add("!"); sCharsList.add("@"); sCharsList.add("#"); sCharsList.add("$"); sCharsList.add("%");
        sCharsList.add("^"); sCharsList.add("&"); sCharsList.add("*"); sCharsList.add("?"); sCharsList.add("-");
        sCharsList.add("+"); sCharsList.add("=");

        int passwordLength = length + (numbers + sChars);
        int nextCharType;
        String nextChar;
        for (int i = 0; i < passwordLength; i++)
        {
            nextCharType = rand.nextInt(3);
            if (nextCharType == 2 && sChars > 0) {
                nextChar = sCharsList.get(rand.nextInt(12));
                sChars--;
            }
            else if (nextCharType == 1 && numbers> 0) {
                nextChar = numbersList.get(rand.nextInt(10));
                numbers--;
            }
            else {
                nextChar = charactersList.get(rand.nextInt(26));
            }

            password.append(nextChar);
        }
        while (numbers > 0)
        {
            nextChar = numbersList.get(rand.nextInt(10));
            numbers--;
            password.append(nextChar);
        }
        while (sChars > 0)
        {
            nextChar = sCharsList.get(rand.nextInt(12));
            sChars--;
            password.append(nextChar);
        }
        return password.toString();
    }
}
