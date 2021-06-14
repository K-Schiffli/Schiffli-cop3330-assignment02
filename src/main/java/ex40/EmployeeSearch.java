/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex40;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeSearch {

    public List<Map<String, String>> nameSearch(List<Map<String, String>> employees, String search) {

        List<Map<String, String>> foundEmployees = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).get("firstName").startsWith(search) || employees.get(i).get("lastName").startsWith(search)) {
                foundEmployees.add(employees.get(i));
            }
        }
        return foundEmployees;
    }
}
