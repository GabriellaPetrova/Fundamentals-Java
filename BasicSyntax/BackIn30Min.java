package BasicSyntax;

import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int sumMinutes = hours * 60 + minutes;
        int timeIn30Min = sumMinutes + 30;
        int hoursAfter30 = timeIn30Min / 60;
        int minutesAfter30 = timeIn30Min %60;

        if (hoursAfter30 > 23) {
            hoursAfter30 = 0;
        }
        if(minutesAfter30 < 10) {
            System.out.printf("%d:0%d", hoursAfter30, minutesAfter30);
        } else {
            System.out.println(hoursAfter30 + ":" + minutesAfter30);
        }
    }
}
