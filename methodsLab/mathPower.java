package methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        printNumberOfPower(number, power);
    }

    private static void printNumberOfPower(double number, double power) {
        double result = Math.pow(number, power);
        DecimalFormat format = new DecimalFormat("0.####");
        System.out.println(format.format(result));
    }
}

