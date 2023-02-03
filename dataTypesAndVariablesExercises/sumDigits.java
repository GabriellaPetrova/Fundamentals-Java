package dataTypesAndVariablesExercises;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        // взимам псоледната цифра
        // добавям я към сумата и след като я  добавя
        // премахвам псоледната цифра

        // спирам да сумирам, когато нямам цифри (число = 0)
        // продължавам докато число !=0

        int sum = 0; // the sum of the numbers

        while (number != 0) {
            int lastDigit = number % 10; // the last digit
            sum += lastDigit;
            number = number / 10; // number /= 10;
        }

        System.out.println(sum);
    }
}
