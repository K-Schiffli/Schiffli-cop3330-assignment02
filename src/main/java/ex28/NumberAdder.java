/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex28;

public class NumberAdder {
    public double addNumbers(double[] numbers) {

        double total = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            total += numbers[i];
        }
        return total;
    }
}
