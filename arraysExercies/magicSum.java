package arraysExercies;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scanner.nextLine());
        for (int index = 0; index <= numbers.length - 1 ; index++) { //обходи всички числа
            //взетото число от масива
            int number = numbers[index];
            for (int i = index + 1; i <= numbers.length - 1; i++) { //обходи всички числа след моето

                int number2 = numbers[i];
                if(number + number2 == sum) {
                    System.out.printf("%d %d%n", number, number2);
                }
            }
        }
    }
}
