/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    RandomNumberGenerator rng = new RandomNumberGenerator();
    GuessingGame gg = new GuessingGame();

    @Test
    void Random_Number_Generator_should_return_between_0_and_10_for_difficulty_1() {
        for(int i = 0; i < 10; i++) {
            int number = rng.generateNumber(1);
            assertTrue((number >= 0 && number <= 10));
        }
    }

    @Test
    void Random_Number_Generator_should_return_between_0_and_100_for_difficulty_2() {
        for(int i = 0; i < 100; i++) {
            int number = rng.generateNumber(2);
            assertTrue((number >= 0 && number <= 100));
        }
    }

    @Test
    void Random_Number_Generator_should_return_between_0_and_1000_for_difficulty_3() {
        for(int i = 0; i < 1000; i++) {
            int number = rng.generateNumber(3);
            assertTrue((number >= 0 && number <= 1000));
        }
    }
}