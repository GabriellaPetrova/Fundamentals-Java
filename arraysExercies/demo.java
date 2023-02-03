package arraysExercies;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double cols = Math.floor((width-100)/70);
        double rows = Math.floor((length/120));
        double seats = rows * cols - 3;

        System.out.println(seats);
    }
}
