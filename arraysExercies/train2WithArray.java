package arraysExercies;

import java.util.Scanner;

public class train2WithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // брой на вагоните
        int[] peopleInWagon = new int[n]; // искаме колкото е броя на хората във
                                           // толкова да е броя на

        // искаме всеки път да използваме като масив броя на хората във вагоните
        // обхождаме всички издекси последователно

        for (int index = 0; index <= peopleInWagon.length - 1; index++) {
            peopleInWagon[index] = Integer.parseInt(scanner.nextLine());
        }

        // всеки елемент от масияа -> принтирам -> сумирам
        // използаме цикъл форийч
        int sumPeople = 0;
        for (int countPeople : peopleInWagon) {
            System.out.print(countPeople + " ");
            sumPeople += countPeople;
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
