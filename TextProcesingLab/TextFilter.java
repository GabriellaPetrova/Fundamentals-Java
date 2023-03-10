package TextProcesingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] forbiddenWords= scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            String wordOfStars = convertWordOfStars(forbiddenWord);
            text = text.replace(forbiddenWord, wordOfStars);
        }
        System.out.println(text);
    }
    private static String convertWordOfStars(String forbiddenWord) {
        String wordOfStars = "";
        for (int i = 0; i < forbiddenWord.length(); i++) {
            wordOfStars += "*";
        }
        return  wordOfStars;
    }
}