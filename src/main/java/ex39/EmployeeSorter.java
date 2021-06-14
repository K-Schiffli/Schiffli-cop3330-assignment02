/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex39;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class EmployeeSorter {
    public List<Map<String, String>> lastNameSort(List<Map<String, String>> employees) {

        employees.sort(Comparator.comparing(e -> e.get("lastName")));
        return employees;
    }
}
