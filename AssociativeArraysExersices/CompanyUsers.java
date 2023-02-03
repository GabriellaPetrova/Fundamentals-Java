package AssociativeArraysExersices;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> information = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String employerId = tokens[1];

            if (!information.containsKey(companyName)) {
                information.put(companyName, new ArrayList<>());
            }
            if (information.containsKey(companyName) && !information.get(companyName).contains(employerId)) {
                information.get(companyName).add(employerId);
            }

            input = scanner.nextLine();
        }

        for (var entry : information.entrySet()) {
            System.out.println(entry.getKey());
            for (String ids : entry.getValue()) {
                System.out.println("-- "+ ids);
            }
        }
    }
}


