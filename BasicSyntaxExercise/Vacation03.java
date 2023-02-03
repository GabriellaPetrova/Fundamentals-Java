package BasicSyntaxExercise;
import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //за решението на тази задача ще използваме вложени цикли
        // по конкретно switch-case във switch-case.

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;
        double discount = 0;

        if(group.equals("Students") &&
                day.equals("Friday") &&
                numberOfPeople < 30) {
            totalPrice = numberOfPeople * 8.45;

        } else if (group.equals("Students") &&
                day.equals("Friday") &&
                numberOfPeople >=30) {
            discount = numberOfPeople*8.45 * 0.15;
            totalPrice = numberOfPeople * 8.45 - discount ;

        } else if (group.equals("Students") &&
                day.equals("Saturday") &&
                numberOfPeople < 30) {
            totalPrice = numberOfPeople * 9.80;

        } else if (group.equals("Students") &&
                day.equals("Saturday") &&
                numberOfPeople >= 30) {
            discount = numberOfPeople * 9.8 * 0.15;
            totalPrice = numberOfPeople * 9.80 - discount;

        } else if (group.equals("Students") &&
                day.equals("Sunday") &&
                numberOfPeople < 30) {
            totalPrice = numberOfPeople * 10.46;

        } else if (group.equals("Students") &&
                day.equals("Sunday") &&
                numberOfPeople >= 30) {
            discount = numberOfPeople * 10.46 * 0.15;
            totalPrice = numberOfPeople * 10.46 - discount;

        } else if (group.equals("Business") &&
                day.equals("Friday") &&
                numberOfPeople < 100) {
            totalPrice = numberOfPeople * 10.90;

        } else if(group.equals("Business") &&
                day.equals("Friday") &&
                numberOfPeople >= 100) {
            numberOfPeople -= 10;
            totalPrice = numberOfPeople * 10.90;

        } else if (group.equals("Business") &&
                day.equals("Saturday") &&
                numberOfPeople < 100) {
            totalPrice = numberOfPeople * 15.60;

        } else if (group.equals("Business") &&
                day.equals("Saturday") &&
                numberOfPeople >= 100) {
            numberOfPeople -= 10;
            totalPrice = numberOfPeople * 15.60;

        } else if (group.equals("Business") &&
                day.equals("Sunday") &&
                numberOfPeople < 100) {
            totalPrice = numberOfPeople * 16;

        } else if (group.equals("Business") &&
                day.equals("Sunday") &&
                numberOfPeople >= 100) {
            numberOfPeople -= 10;
            totalPrice = numberOfPeople * 16;

        } else if (group.equals("Regular") &&
                day.equals("Friday") &&
                numberOfPeople >= 10 && numberOfPeople <= 20) {
            discount = numberOfPeople * 15 * 0.05;
            totalPrice = numberOfPeople * 15 - discount;

        } else if (group.equals("Regular") &&
                day.equals("Friday")) {
                totalPrice = numberOfPeople * 15;

        } else if (group.equals("Regular") &&
                day.equals("Saturday") &&
                numberOfPeople >= 10 && numberOfPeople <=20) {
            discount = numberOfPeople * 20 * 0.05;
            totalPrice = numberOfPeople * 20 - discount;

        } else if (group.equals("Regular") &&
                day.equals("Saturday")) {
            totalPrice = numberOfPeople * 20;

        } else if (group.equals("Regular") &&
                day.equals("Sunday") &&
                numberOfPeople >= 10 && numberOfPeople <= 20) {
            discount = numberOfPeople * 22.5 * 0.05;
            totalPrice = numberOfPeople * 22.5 - discount;

        } else if (group.equals("Regular") &&
            day.equals("Sunday")) {
            totalPrice = numberOfPeople * 22.5;

        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
