package methodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int multiple = getMultipleOfEvenAndOdds(Math.abs(input));
        System.out.println(multiple);

        // за да можем да вземем взеки един от елементите на дадения инпут
        // трябва да разделим първо числото на 10, за да премахнем последното число
        // и така докато не остане само едно число,като междувременно проверяваме
        // дали то е четно или нечетно, като го делим на 2
        // всичко това правим в един while цикъл
    }

    private static int getMultipleOfEvenAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return evenSum * oddSum;
    }

    private static int getSumOfOddDigits(int number) {
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                oddSum += digit;
            }
            number = number / 10; // това го правим за да намалим числото с едно
        }
        return oddSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number = number / 10;
        }
        return evenSum;
    }
}

