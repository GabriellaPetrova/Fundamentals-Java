package AssociativeArraysExersices;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while(!input.equals("end")) {
            //"{име на курс} : {име на човек}" -> split (" : ") -> ["{courseName}", "{personName}"]
            String courseName = input.split(" : ")[0];
            String personName = input.split(" : ")[1];

            //прверка имам ли такъв курс
            //ако нямам такъв курс
            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }

            //ако курсът е нов -> връща празен списък
            //ако курсът е стар -> връща моментния списък с хора
            courses.get(courseName).add(personName);

            input = scanner.nextLine();
        }

        //courseName -> List<String>  По-трудната част е сортирането
        // и принтирането на резултата

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                    //ascending order / нарастващ ред
                });
    }
}
