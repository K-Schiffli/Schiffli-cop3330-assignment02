/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex40;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSearchTest {

    @Test
    void nameSearch_should_return_all_matching_names() {

        List<Map<String, String>> expectedMapList = new ArrayList<Map<String, String>>();

        HashMap employee = new HashMap<String, String>();
        employee.put("firstName", "Jake");
        employee.put("lastName", "Jacobson");
        employee.put("department", "Programmer");
        employee.put("sepDate", "");

        expectedMapList.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Jacquelyn");
        employee.put("lastName", "Jackson");
        employee.put("department", "DBA");
        employee.put("sepDate", "");

        expectedMapList.add(employee);


        Employees em = new Employees();
        EmployeeSearch es = new EmployeeSearch();
        List<Map<String, String>> employees = em.getEmployees();

        List<Map<String, String>> searchedEmployees = es.nameSearch(employees, "Jac");

        for (int i = 0; i < searchedEmployees.size(); i++)
        {
            assertEquals(expectedMapList.get(i).get("firstName"), searchedEmployees.get(i).get("firstName"));
        }

    }

    @Test
    void nameSearch_should_return_empty_for_no_matches() {

        List<Map<String, String>> expectedMapList = new ArrayList<Map<String, String>>();

        HashMap employee = new HashMap<String, String>();


        Employees em = new Employees();
        EmployeeSearch es = new EmployeeSearch();
        List<Map<String, String>> employees = em.getEmployees();

        List<Map<String, String>> searchedEmployees = es.nameSearch(employees, "Nothing matches this");

        for (int i = 0; i < searchedEmployees.size(); i++)
        {
            assertEquals(expectedMapList.get(i).get("firstName"), searchedEmployees.get(i).get("firstName"));
        }

    }

    @Test
    void nameSearch_should_return_all_matches_for_other_searches() {

        List<Map<String, String>> expectedMapList = new ArrayList<Map<String, String>>();

        HashMap employee = new HashMap<String, String>();
        employee.put("firstName", "Tou");
        employee.put("lastName", "Xiong");
        employee.put("department", "Software Engineer");
        employee.put("sepDate", "2016-10-05");

        expectedMapList.add(employee);



        Employees em = new Employees();
        EmployeeSearch es = new EmployeeSearch();
        List<Map<String, String>> employees = em.getEmployees();

        List<Map<String, String>> searchedEmployees = es.nameSearch(employees, "To");

        for (int i = 0; i < searchedEmployees.size(); i++)
        {
            assertEquals(expectedMapList.get(i).get("firstName"), searchedEmployees.get(i).get("firstName"));
        }

    }
}