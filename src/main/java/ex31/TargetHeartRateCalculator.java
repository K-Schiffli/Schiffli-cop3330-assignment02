/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex31;

public class TargetHeartRateCalculator {
    public double[] calcTargetHeartRate(int age, int restingHR) {

        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        double targetHeartRate;
        double[] targetHRArr = new double[9];
        int index = 0;

        for (double i = 0.55; i <= 1; i += 0.05)
        {
            targetHeartRate = (((220 - age) - restingHR) * i) + restingHR;
            targetHRArr[index] = Math.round(targetHeartRate);
            index++;
        }

        return targetHRArr;
    }
}
