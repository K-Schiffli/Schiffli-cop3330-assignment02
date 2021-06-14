/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex35;

import java.util.List;
import java.util.Random;

public class WinnerPicker {
    public String pickWinner(List<String> namesList) {

        Random rand = new Random();
        int winner = rand.nextInt((namesList.size()));

        return namesList.get(winner);

    }
}
