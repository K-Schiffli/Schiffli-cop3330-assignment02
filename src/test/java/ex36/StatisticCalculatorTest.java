/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatisticCalculatorTest {
    StatisticCalculator sc = new StatisticCalculator();

    @Test
    void average_should_return_the_correct_average() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);

        assertEquals(400.0, sc.average(numbers),0.00001);
    }

    @Test
    void max_should_return_the_correct_maximum() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);

        assertEquals(1000.0, sc.max(numbers), 0.00001);
    }

    @Test
    void min_should_return_the_correct_min() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);

        assertEquals(100.0, sc.min(numbers), 0.00001);
    }

    @Test
    void std_should_return_the_correct_standard_deviation() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);

        assertEquals(353.5533, sc.std(numbers), 0.001);
    }
}