/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex38;

import java.util.ArrayList;

public class StringSplitter {
    public ArrayList<String> filterEvenNumbers(String numbers) {

        String[] numberArr = numbers.split(" ", 10);
        ArrayList<String> evensList = new ArrayList<>();

        for (int i = 0; i < numberArr.length; i++)
        {
            if (Double.parseDouble(numberArr[i]) % 2 == 0)
            {
                evensList.add(numberArr[i]);
            }
        }

        return evensList;
    }
}
