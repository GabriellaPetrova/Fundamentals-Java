package dataTypesAndVariablesExercises;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. input --> model --> radius --> height
        // 2. volume per keg
        // 3. max volume

        int countKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE; // za da namerim nai-golemiq obem ispolzwane Min.Value
        String maxModel = "";
        for (int keg = 1; keg <= countKegs ; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            // proverka dali obelut e max

            if(volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);

    }
}
