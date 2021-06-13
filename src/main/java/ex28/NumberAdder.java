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
