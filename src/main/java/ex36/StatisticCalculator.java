/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex36;

import java.util.List;

public class StatisticCalculator {
    public double average(List<Double> numbers) {
        double total = 0;
        int i;
        for (i = 0; i < numbers.size(); i++)
        {
            total += numbers.get(i);
        }
        return (total / i);
    }

    public double max(List<Double> numbers) {
        double maximum = 0;
        int i;
        for (i = 0; i < numbers.size(); i++)
        {
            if (numbers.get(i) > maximum)
            {
                maximum = numbers.get(i);
            }
        }
        return maximum;
    }

    public double min(List<Double> numbers) {
        double minimum = Double.MAX_VALUE;
        int i;
        for (i = 0; i < numbers.size(); i++)
        {
            if (numbers.get(i) < minimum)
            {
                minimum = numbers.get(i);
            }
        }
        return minimum;
    }

    public double std(List<Double> numbers) {
        double sumOne = 0;
        double sumTwo = 0;
        double stdDev = 0;
        int i;
        for (i = 0; i < numbers.size(); i++) {
            sumOne += numbers.get(i);
            sumTwo += Math.pow(numbers.get(i), 2);
        }
        stdDev = Math.sqrt(i * sumTwo - Math.pow(sumOne, 2))/i;
        return stdDev;
    }
}

