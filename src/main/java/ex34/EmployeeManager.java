package ex34;

import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    public List<String> removeEmployee(List<String> employeeList, String employee) {


        for (int i = 0; i < employeeList.size(); i++)
        {
            if (employee.equals(employeeList.get(i)))
            {
                employeeList.remove(i);
            }
        }

        return employeeList;
    }
}
