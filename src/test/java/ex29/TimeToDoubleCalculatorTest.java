package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeToDoubleCalculatorTest {

    @Test
    void calculateTTD_should_return_correctly_for_integers() {
        TimeToDoubleCalculator ttdc = new TimeToDoubleCalculator();
        assertEquals(18, ttdc.calculateTTD(4), 0.00001);
    }

    @Test
    void calculateTTD_should_return_correctly_for_doubles() {
        TimeToDoubleCalculator ttdc = new TimeToDoubleCalculator();
        assertEquals(20, ttdc.calculateTTD(3.576), 0.00001);
    }
}