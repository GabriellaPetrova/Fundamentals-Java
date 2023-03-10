package arraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class equalsArrays06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().
                split(" ")).mapToInt(e -> Integer.parseInt(e))
                .toArray();
        
        // вторият масив можем да си го направим
        // по стария начин с цикъл, като за това
        // първo си правим един Стринг( String secondArray)  като
        // го сплитваме, което директно ще ни даде масив от стрингове

        String[] secondInput = scanner.nextLine().split(" ");
        int[] secondArray = new int[secondInput.length];

        for (int i = 0; i < secondInput.length; i++) {
            secondArray[i] = Integer.parseInt(secondInput[i]);

        }
        int sum = 0;
        boolean areIdentical= true;

        for (int i = 0; i < secondArray.length ; i++) {
            sum += secondArray[i];
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
        }
            // here
            if(areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}

