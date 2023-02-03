package BasicSyntax;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // за намиране на абсолютни стойности на дадено
        // число използваме функцията Math abs ()
        // пример: create variables
        // int a = -35;
        // long b = -141224423;
        // double c = -9.6777777;
        // float d = -7.7;
        // get the absolute value
        // System.out.println(Math.abs(a)); 35
        // System.out.println(Math.abs(b)); 141224423
        // System.out.println(Math.abs(c)); 9.6777777
        // System.out.println(Math.abs(d));.7.7

        // Трябва да се създаде цикъл, който да се върти докато
        // те се въведе четно число. Тогава цикълът се прекратява.


        int n = Integer.parseInt(scanner.nextLine());

        while (n % 2 != 0) {
                System.out.println("Please write an even number.");
                n = scanner.nextInt();
            }
            System.out.printf("The number is: %d", Math.abs(n));
    }
}
