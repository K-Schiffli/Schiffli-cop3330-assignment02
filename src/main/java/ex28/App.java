package ex28;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ) {
        double[] numbers = getNumbers();

        NumberAdder na = new NumberAdder();
        double total = na.addNumbers(numbers);

        printOutput(total);
    }

    private static void printOutput(double total) {
        DecimalFormat decFormat = new DecimalFormat("#,###.########");
        String formattedTotal = decFormat.format(total);
        System.out.println("The total is " + formattedTotal);
    }

    private static double[] getNumbers() {

        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Please enter a number: ");
            try
            {
                double input = Double.parseDouble(in.nextLine());
                numbers[i] = input;
            }
            catch (NumberFormatException e)
            {
                numbers[i] = 0;
            }
        }
        return numbers;
    }


}