/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void validateInput_should_accept_valid_integers() {
        InputValidator iv = new InputValidator();
        assertTrue(iv.validateInput("4"));
    }

    @Test
    void validateInput_should_accept_valid_doubles() {
        InputValidator iv = new InputValidator();
        assertTrue(iv.validateInput("3.576"));
    }

    @Test
    void validateInput_should_reject_invalid_numbers() {
        InputValidator iv = new InputValidator();
        assertFalse(iv.validateInput("5g"));
    }

    @Test
    void validateInput_should_reject_zero() {
        InputValidator iv = new InputValidator();
        assertFalse(iv.validateInput("0"));
    }
}