package dataTypesAndVariablesExercises;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // the function Math.ceil се използва
        // за закръгляне

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        //разделяме  броя на хората на капацитета искаме
        //да получим цяло число, и да закръглим към по-голямото

        // 17 * 1.0 = 17.0
        // 17.0 / 3 = ..... double rezultat

        double courses = Math.ceil(people * 1.0 / capacity);
        System.out.printf("%.0f", courses);

    }
}
