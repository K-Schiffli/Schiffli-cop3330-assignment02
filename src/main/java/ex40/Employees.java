/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employees {
    public List<Map<String, String>> getEmployees() {


        List<Map<String, String>> employees = new ArrayList<Map<String, String>>();

        HashMap employee = new HashMap<String, String>();
        employee.put("firstName", "John");
        employee.put("lastName", "Johnson");
        employee.put("department", "Manager");
        employee.put("sepDate", "2016-12-31");

        employees.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Tou");
        employee.put("lastName", "Xiong");
        employee.put("department", "Software Engineer");
        employee.put("sepDate", "2016-10-05");

        employees.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Michaela");
        employee.put("lastName", "Michaelson");
        employee.put("department", "District Manager");
        employee.put("sepDate", "2015-12-19");

        employees.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Jake");
        employee.put("lastName", "Jacobson");
        employee.put("department", "Programmer");
        employee.put("sepDate", "");

        employees.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Jacquelyn");
        employee.put("lastName", "Jackson");
        employee.put("department", "DBA");
        employee.put("sepDate", "");

        employees.add(employee);

        employee = new HashMap<String, String>();
        employee.put("firstName", "Sally");
        employee.put("lastName", "Webber");
        employee.put("department", "Web Developer");
        employee.put("sepDate", "2015-12-18");

        employees.add(employee);

        return employees;
    }
}

