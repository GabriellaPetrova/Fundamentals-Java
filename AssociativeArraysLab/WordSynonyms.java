package AssociativeArraysLab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
            }

        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            String currentWord = entry.getKey();
            ArrayList<String> synonymsForCurrentWord = entry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));

        }
    }
}
