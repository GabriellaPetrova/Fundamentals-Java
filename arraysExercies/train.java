package arraysExercies;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Решение на задачата без масив.

        int n = Integer.parseInt(scanner.nextLine()); // broi na vagonite
        int sumPeople= 0;
        for (int wagon = 0; wagon <= n; wagon++) {

            //  прочитам броя на хората, които се качват
            // печатам броя на хората
            int people = Integer.parseInt(scanner.nextLine());
            System.out.println(people + " ");
            sumPeople += people;
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
