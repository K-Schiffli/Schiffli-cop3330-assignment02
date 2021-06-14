/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex30;

public class MultTableGen {
    public String[] generateMultTable() {

        String[] numbers = {"","","","","","","","","","","",""};
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                int result = (i + 1) * (j + 1);
                String resultString = Integer.toString(result);

                if (resultString.length() == 1) numbers[i] += ("    " + resultString);
                else if (resultString.length() == 2) numbers[i] += ("   " + resultString);
                else numbers[i] += ("  " + resultString);
            }
        }
        return numbers;
    }
}
