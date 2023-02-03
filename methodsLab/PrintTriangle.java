package methodsLab;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        printTriangle(height);
    }

    private static void printTriangle(int height) {
        Scanner scanner = new Scanner(System.in);
        printTopHalf(height);
        printBottomHalf(height);
    }

    private static void printTopHalf(int height) {
            for (int i = 1; i < height; i++) {
                // i = 1  / 1
                // i = 2 / 2
                // i = 3 / 3 ...
                printSigleLine(i); // принтираме на всеки нов ред пислата
                // от едно до макс.дължина на пирамидата
                // в скобите постяваме i защото принтираме стойностите на i
            }
        }
        private static void printSigleLine(int length) {
            // tuk samo printirame red o piramidata sys sоutwevtnata dyljina
            for (int i = 1; i <= length; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // za da slezem na nov red
        }

    private static void printBottomHalf(int height) {
        for (int i = height; i >= 1 ; i--) {
            printSigleLine(i);

        }
    }
}



