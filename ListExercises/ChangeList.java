package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            //"Delete {element}" -> split -> ["Delete", "5"]
            //"Insert {element} {position}" -> ["Insert", "5", "3"]

            String command = input.split("\\s+")[0]; //Delete or Insert
            int element = Integer.parseInt(input.split("\\s+")[1]);

            if(command.equals("Delete")) {
                numbers.removeAll(Arrays.asList(element)); //прмахва всички числа оито са равни на даденияе елемент
            } else if(command.equals("Insert")) {
                int index = Integer.parseInt(input.split("\\s+")[2]);
                numbers.add(index, element);
            }
            input = scanner.nextLine();

        }
        printList(numbers); // suzdawame metod za printirane na chislata
    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");

        }
    }
}


