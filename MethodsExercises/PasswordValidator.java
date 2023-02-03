package MethodsExercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        // проверка за дължина -> [6,10]
        boolean isPasswordValidLength = isValidLength(password); //true -> valid; false ->invalid
        if (!isPasswordValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        // проверка за съдържанието -> само букви и цифри
        boolean isValidPasswordContent = isValidContent(password); // true- valid; false-invalid
        if (!isValidPasswordContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        // проверка за брой на цифрите
        boolean isPasswordCountDigits = isValidCountDigits(password);
        if (!isPasswordCountDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        //валидна парола ако и трите условия са изпълнени
        if (isPasswordValidLength && isValidPasswordContent && isPasswordCountDigits)
            System.out.println("Password is valid");

    }

    //метод за валидиранена дължината -> true (валидна); false(невалидна)
    private static boolean isValidLength(String password) {
        //валидна -> дължина >= 6 и дължина <= 10
         /*if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }*/

        return password.length() >= 6 && password.length() <= 10;
    }


    // метод за валидиране на съдържанието
    private static boolean isValidContent(String password) {
        //всички символи да са буква или цифра -> "T@st1234"
        //обхождаме всички символи
        //ако даден символ не е буква или цифра -> false

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    //метод за валидиране на брой на цифрите -> валидна парола: брой >= 2
    private static boolean isValidCountDigits(String password) {
        //true -> count >= 2
        //false -> count < 2
        int count = 0; //брой на цифрите
        //обхождам всеки един символ -> проверка дали е цифра -> увеличавам броя
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        //знам броя на цифрите
        /*if (count >= 2) {
            return true;
        } else {
            return false;
        }*/
        return count >= 2;
    }
}