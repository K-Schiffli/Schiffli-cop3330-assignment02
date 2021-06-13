package ex40;

import java.util.*;
import java.util.stream.Collectors;


public class EmployeeSearch {
    public static Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
        public int compare(Map<String, String> m1, Map<String, String> m2) {
            return m1.get("lastName").compareTo(m2.get("lastName"));
        }
    };

    public List<Map<String, String>> nameSearch(List<Map<String, String>> employees, String search) {

        List<Map<String, String>> foundEmployees = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++)
        {
            if (employees.get(i).get("firstName").startsWith(search) || employees.get(i).get("lastName").startsWith(search)){
                foundEmployees.add(employees.get(i));
            }
            //foundEmployees = employees.get(i).entrySet().stream().filter(e -> e.getKey().startsWith(search)).map(Map.Entry::getValue).collect(Collectors.toList());
        }

        return foundEmployees;
    }
}
