package AssociativeArraysExersices;

import java.util.*;

public class countCharsInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. прочитам текст
        //2. обходим всички символи

        String text = scanner.nextLine();

        Map<Character, Integer> lettersCount = new LinkedHashMap<>();
        //символ -> брой на срещанията
        //0 до последния

        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            if(currentSymbol == ' ') {
                continue;
            }

            //проверка вече имам ли такъв символ
            //ако не съм го срещала

            if(!lettersCount.containsKey(currentSymbol)) {
                lettersCount.put(currentSymbol, 1);
            } else {
                //ако съм го срещала
                int currentCount = lettersCount.get(currentSymbol); //текущия брой
                lettersCount.put(currentSymbol, currentCount + 1);
            }

        }

        //lettersCount.keySet() -> всички ключове
        //lettersCount.values() -> всички стойности
        //lettersCount.entrySet() -> всички записи (ключ -> стойност)

        //всички записи: {char} -> {occurrences}
        //foreach

        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            //{char} -> {occurrences}
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            //stream
            //lettersCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        }
    }
}
