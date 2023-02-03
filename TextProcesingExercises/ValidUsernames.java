package TextProcesingExercises;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(", ");

        //дължина от 3 до 16 символа
        // да съдържа само букви, числа, тире и долна черна

        for (String word : words) {
            if(isValidWord(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean isValidWord(String word) {
        if(!(word.length() >= 3 && word.length() <=16)) {
            return false;
        }
        for (char symbol : word.toCharArray()) {
            if(!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }
        }
        return true;
    }
}
