/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

    @Test
    void removeEmployee_should_remove_valid_employees() {
        EmployeeManager em = new EmployeeManager();
        List<String> inputList = new ArrayList<>();

        inputList.add("John Smith");
        inputList.add("Jackie Jackson");
        inputList.add("Chris Jones");
        inputList.add("Amanda Cullen");
        inputList.add("Jeremy Goodwin");

        List<String> resultList = em.removeEmployee(inputList, "Chris Jones");

        List<String> outputList = new ArrayList<>();

        outputList.add("John Smith");
        outputList.add("Jackie Jackson");
        outputList.add("Amanda Cullen");
        outputList.add("Jeremy Goodwin");

        assertArrayEquals(outputList.toArray(), resultList.toArray());
    }

    @Test
    void removeEmployee_shouldnt_remove_invalid_employees() {
        EmployeeManager em = new EmployeeManager();
        List<String> inputList = new ArrayList<>();

        inputList.add("John Smith");
        inputList.add("Jackie Jackson");
        inputList.add("Chris Jones");
        inputList.add("Amanda Cullen");
        inputList.add("Jeremy Goodwin");

        List<String> resultList = em.removeEmployee(inputList, "John Doe");

        List<String> outputList = new ArrayList<>();

        outputList.add("John Smith");
        outputList.add("Jackie Jackson");
        outputList.add("Chris Jones");
        outputList.add("Amanda Cullen");
        outputList.add("Jeremy Goodwin");

        assertArrayEquals(outputList.toArray(), resultList.toArray());
    }

    @Test
    void removeEmployee_should_remove_the_last_item_in_the_list() {
        EmployeeManager em = new EmployeeManager();
        List<String> inputList = new ArrayList<>();

        inputList.add("John Smith");
        inputList.add("Jackie Jackson");
        inputList.add("Chris Jones");
        inputList.add("Amanda Cullen");
        inputList.add("Jeremy Goodwin");

        List<String> resultList = em.removeEmployee(inputList, "Jeremy Goodwin");

        List<String> outputList = new ArrayList<>();

        outputList.add("John Smith");
        outputList.add("Jackie Jackson");
        outputList.add("Chris Jones");
        outputList.add("Amanda Cullen");


        assertArrayEquals(outputList.toArray(), resultList.toArray());
    }
}