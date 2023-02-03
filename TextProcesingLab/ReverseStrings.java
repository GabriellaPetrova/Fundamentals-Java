package TextProcesingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!"end".equals(text)) {
            String reverse = "";
            for (int i = text.length() - 1; i >= 0; i--) {

            reverse += text.charAt(i);
        }
            text = scanner.nextLine();
            System.out.printf("%s = %s%n", text, reverse);
        }
    }
}
