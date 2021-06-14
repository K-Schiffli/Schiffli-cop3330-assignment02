/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateCalculatorTest {

    @Test
    void calcTargetHeartRate_should_return_correctly_for_known_test_data() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        double[] expectedArray = {138,145,151,158,165,171,178,185,191};
        assertArrayEquals(expectedArray, thrc.calcTargetHeartRate(22, 65));
    }

    @Test
    void calcTargetHeartRate_should_return_correctly_for_other_known_test_data() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        double[] expectedArray = {122,126,129,133,137,140,144,148,151};
        assertArrayEquals(expectedArray, thrc.calcTargetHeartRate(65, 82));
    }

    @Test
    void calcTargetHeartRate_should_return_correctly_for_more_known_test_data() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        double[] expectedArray = {129,135,142,148,155,161,168,174,181};
        assertArrayEquals(expectedArray, thrc.calcTargetHeartRate(33, 58));
    }

    @Test
    void calcTargetHeartRate_should_return_correctly_for_even_more_known_test_data() {
        TargetHeartRateCalculator thrc = new TargetHeartRateCalculator();
        double[] expectedArray = {120,125,130,135,140,145,150,155,160};
        assertArrayEquals(expectedArray, thrc.calcTargetHeartRate(55, 65));
    }
}