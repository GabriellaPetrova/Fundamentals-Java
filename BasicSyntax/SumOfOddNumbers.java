package BasicSyntax;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        // За да получим нечетно число трябва към всяко число
        // умнорено по две да извадим 1. Например 1*2 =2
        // 2 - 1 = 1, това ни е първото нечетно число.

        for (int i = 1; i <= n; i++) {
            int oddNum = 2 * i - 1;
            System.out.println(oddNum);
            sum += oddNum;


        }
        System.out.printf("Sum: %d", sum);

    }
}
