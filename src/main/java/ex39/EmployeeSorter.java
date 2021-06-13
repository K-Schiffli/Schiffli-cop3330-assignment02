package ex39;

import java.util.*;

public class EmployeeSorter {
    public static Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
        public int compare(Map<String, String> m1, Map<String, String> m2) {
            return m1.get("lastName").compareTo(m2.get("lastName"));
        }
    };

    public List<Map<String, String>> lastNameSort(List<Map<String, String>> employees) {

        Collections.sort(employees, mapComparator);

        return employees;
    }
}
