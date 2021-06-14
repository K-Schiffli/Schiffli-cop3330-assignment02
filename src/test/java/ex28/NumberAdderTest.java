/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAdderTest {
    @Test
    void Number_Adder_should_return_correct_answer_for_integers() {
        NumberAdder na = new NumberAdder();
        double[] numbers = {1,2,3,4,5};
        double expected = 15;
        assertEquals(expected, na.addNumbers(numbers),0.0001);
    }

    @Test
    void Number_Adder_should_return_correct_answer_for_doubles() {
        NumberAdder na = new NumberAdder();
        double[] numbers = {1.2,2.34,3.456,4.5678,5.678910};
        double expected = 17.2427;
        assertEquals(expected, na.addNumbers(numbers),0.0001);
    }

    @Test
    void Number_Adder_should_return_correct_answer_when_non_numbers_are_given() {
        NumberAdder na = new NumberAdder();
        double[] numbers = {1,2,0,0,5};
        double expected = 8;
        assertEquals(expected, na.addNumbers(numbers),0.0001);
    }

    @Test
    void Number_Adder_should_return_correct_answer_when_all_non_numbers_are_given() {
        NumberAdder na = new NumberAdder();
        double[] numbers = {0,0,0,0,0};
        double expected = 0;
        assertEquals(expected, na.addNumbers(numbers),0.0001);
    }

}