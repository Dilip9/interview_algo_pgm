package org.example.interviewedpgm;

import org.example.java8.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TCS {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Dilip", 59, "India"),
                new Employee("Rohan", 18, "USA"),
                new Employee("Divya", 23, "Hong-Kong"),
                new Employee("Dilip", 30, "USA"),
                new Employee("Priyanka", 35, "India"),
                new Employee("Gouri", 5, "India"));
        // list of name group by nationality using Stream API.
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getNationality, Collectors.mapping(Employee::getName, Collectors.toList())))
                .entrySet().stream()
                .forEach((employee) ->System.out.println("Nationality of : "+employee.getKey()+" Names are : "+employee.getValue()));
    }

}
