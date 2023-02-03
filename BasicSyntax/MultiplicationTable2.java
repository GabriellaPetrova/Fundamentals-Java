package BasicSyntax;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Тъй като имаме множител.който нараства със всяко следващо
        // умножение, използване for-цикъл ili while за да решим задачата.
        // Има два входа, разликата от предната задача е че започавме
        // да умножаванме от числото което ни е зададено като втори вход
        // и можем да използваме числа по големи от 10 за умножение.

        // За улеснение ще използваме  Do-While конструкция за
        // решението. За разлика от обикновения while цикъл, с този
        // можем да и=умножаваме и с числа по-големи от 10, тъй като
        // първо извършваме действието и след това правим проверката.

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        do{
            int result = number * multiplier;
            System.out.printf("%d X %d = %d%n", number,multiplier, result);
            multiplier++;
        }while (multiplier <=10);

        // Важно е да не забравяме да дададем като
        // функция след всяко изпълнение на цикъла
        // следващото действие да минава на нов ред. %n в трая на принта.

    }
}




