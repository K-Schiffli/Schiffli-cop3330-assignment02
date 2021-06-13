package ex29;

public class TimeToDoubleCalculator {
    public Double calculateTTD(double rateOfReturn) {

        double timeToDouble = 72/rateOfReturn;

        timeToDouble = Math.round(timeToDouble);
        return timeToDouble;
    }
}
