package Exams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GoShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] list = input.split("[->,-]");
        Map <String, String> shopping = new LinkedHashMap<>();

        while(!input.equals("Go Shopping")) {

           if(list[0].equals("Add")) {
               String shop = list[1];
               String products = list[2];
               

           }

            input = scanner.nextLine();

        }


    }
}
