package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Тъй като дължината на масивите не може да се применя
        // Всеки път трябва да създавеме нов масив с нови стойности
        // докато масива не стане с дължина 1, т.е всеки път създавеме масив с дължина ->(дължината - 1)

        int [] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        while (numbers.length > 1) {
            int [] condensed = new int [numbers.length - 1];
            for (int i = 0; i < numbers.length - 1 ; i++) {
                condensed[i] = numbers[i] + numbers[i+ 1]; // тук събираме едно число + числото след него

            }
            numbers = condensed; // резултата накрая е само едно число
        }
        System.out.println(numbers[0]); // 0, защото е на индекс 0, стойността на резулатата
    }
}
