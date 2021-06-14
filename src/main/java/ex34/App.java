/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex34;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        EmployeeManager em = new EmployeeManager();
        List<String> employeeList = getEmployees();
        printEmployees(employeeList);
        String employee = getEmployee();
        System.out.print("\n");

        employeeList = em.removeEmployee(employeeList, employee);

        printEmployees(employeeList);
    }

    private static String getEmployee() {
        System.out.print("\nEnter an employee name to remove: ");
        return in.nextLine();
    }

    private static void printEmployees(List<String> employees) {

        System.out.print("There are " + employees.size() + " employees: \n");

        for (String employee : employees) {
            System.out.print(employee + "\n");
        }
    }

    private static List<String> getEmployees() {
        List<String> employeeList = new ArrayList<>();

        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");

        return employeeList;
    }
}
