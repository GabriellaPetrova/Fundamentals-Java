package dataTypesAndVariablesExercises;

import java.util.Scanner;

public class sumOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // а всеки сумвол -> прочитаме -> сумираме инт стойността

        int n = Integer.parseInt(scanner.nextLine()); // broi na simvolite\
        int sum = 0; // sum of ascii codes

        for (int count = 1; count <= n ; count++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int)symbol;
        }

        System.out.println("The sum equals: " + sum);
    }
}
