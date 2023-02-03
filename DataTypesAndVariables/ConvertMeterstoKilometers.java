package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMeterstoKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ако напишем програмата по следния начин:
        // int meters = Integer.parseInt(scanner.nextLine());
        //  double kilometers = meters делено на 1000;
        //  System.out.printf("%.2f", kilometers);
        // в резултата ще получим неточен резултат, и задачата няма
        //да е вярна

        // В Java когато делим int на  int резултата винаги е в интове.
        // например 1850 / 1000 = 1.0, и тези 850м метра се губят.
        // Друг вариант е да заменим интовете за метри с дабъл.


        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = 1.0 * meters / 1000;  //1.0 pri delenie na int-i ni reshavat zadachiata

        System.out.printf("%.2f", kilometers);

    }
}
