package dataTypesAndVariablesExercises;

import java.util.Scanner;

public class integerOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 4 integers
        // ((n1 + n2) / n3) * n4

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        System.out.println(((number1 + number2) / number3) * number4);

        // винаги когато дели,трябва да внимаваме какъв е типът на
        // числото защото, ако делим int на int, резултатът също
        // ще е int (получава се ено изрязване на резултата, остатъка
        // се губи
    }
}
