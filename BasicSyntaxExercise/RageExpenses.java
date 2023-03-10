package BasicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesLose = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadsets = gamesLose / 2;
        int countMice = gamesLose / 3;
        int countKeyboards = gamesLose / 6;
        int countMonitors = gamesLose / 12;

        //разходи = (бр. слушалки * цена за 1 бр слушалки)
        // + (бр. мишки * цена за 1 бр мишка)
        // + (бр. клавиатури * цена за 1 бр клав)
        // + (бр. монитори * цена за 1 бр монитор)
        double expenses = (countHeadsets * headsetPrice)
                + (countMice * mousePrice)
                + (countKeyboards * keyboardPrice)
                + (countMonitors * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
