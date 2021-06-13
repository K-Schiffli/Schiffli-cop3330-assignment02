package ex39;

import java.util.*;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Employees em = new Employees();
        EmployeeSorter es = new EmployeeSorter();
        List<Map<String, String>> employees = em.getEmployees();

        List<Map<String, String>> sortedEmployees = es.lastNameSort(employees);

        printTable(sortedEmployees);

    }

    private static void printTable(List<Map<String, String>> sortedEmployees) {
        String firstName;
        String lastName;
        String department;
        String sepDate;

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (int i = 0; i < sortedEmployees.size(); i++)
        {
            firstName = sortedEmployees.get(i).get("firstName");
            lastName = sortedEmployees.get(i).get("lastName");
            department = sortedEmployees.get(i).get("department");
            sepDate = sortedEmployees.get(i).get("sepDate");

            System.out.println(String.format("%-20s| %-18s| %s", firstName + " " + lastName , department, sepDate));
        }

    }
}
