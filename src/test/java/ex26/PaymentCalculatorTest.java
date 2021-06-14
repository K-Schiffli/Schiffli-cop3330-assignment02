/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void Test_given_variables_for_known_answer() {
        PaymentCalculator pc = new PaymentCalculator();
        String expected = "70";
        assertEquals(expected, pc.calculateMonthsUntilPaidOff("5000", "12", "100"));
    }

    @Test
    void Test_other_variables_for_precalculated_answer() {
        PaymentCalculator pc = new PaymentCalculator();
        String expected = "32";
        assertEquals(expected, pc.calculateMonthsUntilPaidOff("8326.74", "6.5", "285.60"));
    }

    @Test
    void Test_other_variables_for_another_precalculated_answer() {
        PaymentCalculator pc = new PaymentCalculator();
        String expected = "12";
        assertEquals(expected, pc.calculateMonthsUntilPaidOff("548.73", "2.4", "50"));
    }

    @Test
    void Test_zero_APR() {
        PaymentCalculator pc = new PaymentCalculator();
        String expected = "-1";
        assertEquals(expected, pc.calculateMonthsUntilPaidOff("5000", "0", "100"));
    }

    @Test
    void Test_zero_balance() {
        PaymentCalculator pc = new PaymentCalculator();
        String expected = "-1";
        assertEquals(expected, pc.calculateMonthsUntilPaidOff("0", "12", "100"));
    }

    @Test
    void Test_zero_payment() {
        PaymentCalculator pc = new PaymentCalculator();
        String expected = "-1";
        assertEquals(expected, pc.calculateMonthsUntilPaidOff("5000", "12", "0"));
    }
}