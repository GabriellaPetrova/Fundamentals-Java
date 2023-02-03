package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> keys = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {

            String[] line = input.split(">>>");
            String command = line[0];

            switch (command) {

                case "Slice":
                    int indexStart = Integer.parseInt(line[1]);
                    int indexEnd = Integer.parseInt(line[2]);

                    keys.subList(indexStart, indexEnd).clear();
                    System.out.println(String.join("", keys));

                    break;
                case "Flip":
                    int firstIndex = Integer.parseInt(line[2]);
                    int lastIndex = Integer.parseInt(line[3]);
                    if (line[1].equals("Upper")) {

                        for (int i = firstIndex; i < lastIndex; i++) {
                            String upper = keys.get(i).toUpperCase(Locale.ROOT);
                            keys.set(i, upper);
                        }
                        System.out.println(String.join("", keys));
                        break;
                    } else if (line[1].equals("Lower")) {

                        for (int i = firstIndex; i < lastIndex; i++) {
                            String lower = keys.get(i).toLowerCase(Locale.ROOT);
                            keys.set(i, lower);
                        }
                        System.out.println(String.join("", keys));
                        break;
                    }
                    break;
                case "Contains":
                    if (keys.contains(line[1])) {
                        System.out.printf("%s contains %s", keys, line[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", String.join("", keys));



    }
}
