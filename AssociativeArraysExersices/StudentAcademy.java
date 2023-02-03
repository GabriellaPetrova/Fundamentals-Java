package AssociativeArraysExersices;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrades.containsKey(name)) {
                studentsGrades.put(name, new ArrayList<>());
            }
            studentsGrades.get(name).add(grade); //have to update it
        }

        double average;
        Map<String, Double> averageGrades = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
            average = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                average = average + entry.getValue().get(i);
            }
            average = average / entry.getValue().size();
            if (average >= 4.5) {
                averageGrades.put(entry.getKey(), average);
            }
        }
            //сортиране
            averageGrades.entrySet().stream().sorted((d1, d2) -> Double.compare(d2.getValue(), d1.getValue())).forEach(person -> {
                System.out.print(person.getKey() + " -> ");
                System.out.printf("%.2f%n", person.getValue());
            });
    }
}

