package MethodsExercises;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacters(text);
    }

    private static void printMiddleCharacters(String text) {
        //дължината да е нечетна
        if (text.length() % 2 == 1){
            int indexOfMiddleCharacters = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacters));
        }
        //дължината да е четна
        else {
            // 2 sredni symbols
            int indexFirstMiddleChar = text.length() / 2-1;
            int indexSecondMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexFirstMiddleChar) + "" + text.charAt(indexSecondMiddleChar));
        }
    }
}
