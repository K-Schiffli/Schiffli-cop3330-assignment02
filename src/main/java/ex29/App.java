package ex29;


import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ){

        TimeToDoubleCalculator ttdc = new TimeToDoubleCalculator();
        double rateOfReturn = getROR();
        double years = ttdc.calculateTTD(rateOfReturn);

        printOutput(years);
    }

    private static void printOutput(double years) {

        DecimalFormat decFormat = new DecimalFormat("#,###");
        String formattedYears = decFormat.format(years);
        System.out.println("It will take " + formattedYears + " years to double your initial investment");
    }

    private static double getROR() {
        InputValidator iv = new InputValidator();
        boolean validFlag = false;
        String input = "INPUT_FAILURE";
        while (!validFlag)
        {
            System.out.println("What is the rate of return? ");
            input = in.nextLine();
            validFlag = iv.validateInput(input);
            if (!validFlag) System.out.print("Sorry. That's not a valid input.\n");

        }
        return Double.parseDouble(input);
    }
}