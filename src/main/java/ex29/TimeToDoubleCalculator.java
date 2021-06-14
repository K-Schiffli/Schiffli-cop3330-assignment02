/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex29;

public class TimeToDoubleCalculator {
    public Double calculateTTD(double rateOfReturn) {

        double timeToDouble = 72/rateOfReturn;

        timeToDouble = Math.round(timeToDouble);
        return timeToDouble;
    }
}
