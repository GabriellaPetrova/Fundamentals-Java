package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Тъй като имаме множител.който нараства със всяко следващо
        //умножение, използване for-цикъл ili while за да решим задачата.

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = 1;

        while(multiplier <=10) {
            int result = number * multiplier;
            System.out.printf("%d X %d = %d%n", number,multiplier, result);
            multiplier++;
        }

        // Важно е да не забравяме да дададем като
        // функция след всяко изпълнение на цикъла
        // следващото действие да минава на нов ред. %n в трая на принта.

    }
}
