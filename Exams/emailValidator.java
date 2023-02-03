package Exams;

import java.util.Scanner;

public class emailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "";
        String command = "";

        while(!command.equals("Complete")) {
            String[] commandArray = command.split(" ");

            switch(commandArray[0]) {
                case "Make Upper":
                        String emailUpper = email.toUpperCase();
                        System.out.print(emailUpper);
                    break;
                case "Make Lower":
                    String emailLower = email.toLowerCase();
                    System.out.print(emailLower);
                    break;
                case "GetDomain":
                    String number = commandArray[1];
                    break;
                case "GetUsername":
                case "Replace":
                case "Encrypt":
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
