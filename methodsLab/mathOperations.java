package methodsLab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double number2 = Double.parseDouble(scanner.nextLine());
        calculatetheresult(number1,operator,number2);

    }
    private static double calculatetheresult(double number1, String operator, double number2) {
        double result = 0.0;
        DecimalFormat format = new DecimalFormat("0.###");

        switch (operator) {
            case "+" :
                result = number1 + number2;
                System.out.println(format.format(result));
                break;
            case "-" :
                result = number1 - number2;
                System.out.println(format.format(result));
                break;
            case "*":
                result = number1 * number2;
                System.out.println(format.format(result));
                break;
            case "/" :
                result = number1 / number2;
                System.out.println(format.format(result));
                break;
        }
        return result;
    }
}
