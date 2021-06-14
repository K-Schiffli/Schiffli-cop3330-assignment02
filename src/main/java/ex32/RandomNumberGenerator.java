/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex32;

import java.util.Random;

public class RandomNumberGenerator {
    public int generateNumber(int difficulty) {

        Random rand = new Random();

        int number = -1;
        if (difficulty == 1) number = rand.nextInt(11);
        else if (difficulty == 2) number = rand.nextInt(101);
        else if (difficulty == 3) number = rand.nextInt(1001);

        return number;
    }
}
