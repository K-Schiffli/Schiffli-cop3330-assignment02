/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSorterTest {

    @Test
    void lastNameSort_should_return_names_in_the_correct_order() {


        List<Map<String, String>> expectedMapList = new ArrayList<Map<String, String>>();

        HashMap employee = new HashMap<String, String>();
        employee.put("firstName", "Jacquelyn");
        employee.put("lastName", "Jackson");
        employee.put("department", "DBA");
        employee.put("sepDate", "");

        expectedMapList.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Jake");
        employee.put("lastName", "Jacobson");
        employee.put("department", "Programmer");
        employee.put("sepDate", "");

        expectedMapList.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "John");
        employee.put("lastName", "Johnson");
        employee.put("department", "Manager");
        employee.put("sepDate", "2016-12-31");

        expectedMapList.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Michaela");
        employee.put("lastName", "Michaelson");
        employee.put("department", "District Manager");
        employee.put("sepDate", "2015-12-19");

        expectedMapList.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Sally");
        employee.put("lastName", "Webber");
        employee.put("department", "Web Developer");
        employee.put("sepDate", "2015-12-18");

        expectedMapList.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Tou");
        employee.put("lastName", "Xiong");
        employee.put("department", "Software Engineer");
        employee.put("sepDate", "2016-10-05");

        expectedMapList.add(employee);

        Employees em = new Employees();
        EmployeeSorter es = new EmployeeSorter();
        List<Map<String, String>> employees = em.getEmployees();

        List<Map<String, String>> sortedEmployees = es.lastNameSort(employees);


        for (int i = 0; i < sortedEmployees.size(); i++)
        {
            assertEquals(expectedMapList.get(i).get("lastName"), sortedEmployees.get(i).get("lastName"));
        }
    }
}