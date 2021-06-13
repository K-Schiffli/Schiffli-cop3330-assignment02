package ex26;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class PaymentCalculator {
    public String calculateMonthsUntilPaidOff(String balance, String APR, String payment) {

        double balanceNum = Double.parseDouble(balance);
        double paymentNum = Double.parseDouble(payment);
        balanceNum = roundToNearestCent(balanceNum);
        paymentNum = roundToNearestCent(paymentNum);
        double dailyRateNum = (Double.parseDouble(APR)/100.0)/365.0;

        double denominator =  Math.log(1.0 + dailyRateNum );
        double numerator = Math.log(1.0 + balanceNum/paymentNum * (1.0 - Math.pow((1.0 + dailyRateNum), 30.0)));
        double months = -(1.0/30.0) * numerator/ denominator;

        months = Math.ceil(months);

        DecimalFormat decFormat = new DecimalFormat("#,###");
        String formattedMonths = decFormat.format(months);
        formattedMonths = checkForProblems(formattedMonths);
        return formattedMonths;
    }

    public double roundToNearestCent(double number) {
        number = number * 100;
        return Math.ceil(number);
    }

    private static String checkForProblems(String numberStr) {
        if (numberStr.equals("NaN") || numberStr.equals("0") || numberStr.equals("-0")) return "-1";

        else return numberStr;
    }
}
