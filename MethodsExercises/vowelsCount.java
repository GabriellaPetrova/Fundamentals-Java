package MethodsExercises;

import java.util.Locale;
import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        // method who print the vowels letters

        printVowelsCount(text);

    }

    private static void printVowelsCount(String text) {
        // трябва да обходим вичски букви в стринга  ->
        // проверка дали е гласна -> увеличаваме броя на гласните букви
        // сладни букви: a,o,u,e,i

        int count = 0; // the numbers of vowels
        for (int index = 0; index <= text.length() - 1; index ++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == 'a' || currentSymbol =='o' ||
            currentSymbol == 'u' || currentSymbol == 'e' || currentSymbol== 'i') {
                count ++;
            }
        }
        System.out.println(count);
    }
}
