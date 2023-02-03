package methodsLab;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        printStrings(input,count);
    }

    private static String printStrings(String input, int count) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        for (int i = 1; i <= count; i++) {
            System.out.print(input + "");

        }
        return result;
    }
}

