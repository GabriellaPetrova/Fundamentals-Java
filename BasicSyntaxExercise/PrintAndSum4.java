package BasicSyntaxExercise;

import java.util.Scanner;

public class PrintAndSum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //start
        //end
        //1. отпечатам числата в диапазона [start; end]
        //2. сумирам -> отпечатвам сумата

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int number = startNum; number <= endNum ; number++) {
            System.out.print(number + " ");
            sum += number;
        }

        System.out.println();
        System.out.println("Sum: " + sum);

    }
}
