package org.example.interviewedpgm;

import org.example.java8.Employee;
import org.example.java8.FunctionalPgm;

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
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", "Developer", 70000),
                new Employee("Bob", "IT", "Developer", 80000),
                new Employee("Charlie", "IT", "Manager", 100000),
                new Employee("David", "HR", "Recruiter", 60000),
                new Employee("Eve", "HR", "Manager", 90000),
                new Employee("Frank", "Finance", "Analyst", 75000),
                new Employee("Eric", "Finance", "Analyst", 75000),
                new Employee("Grace", "Finance", "Manager", 110000)
        );

        // list of name group by nationality using Stream API.
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getNationality, Collectors.mapping(Employee::getName, Collectors.toList())))
                .entrySet().stream()
                .forEach((employee) ->System.out.println("Nationality of : "+employee.getKey()+" Names are : "+employee.getValue()));

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getDesignation)))
                .entrySet().stream().forEach((depart)-> System.out.println("Department: "+depart.getKey()+" Designation :"+depart.getValue()));
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getDesignation, Collectors.toList())))
                .entrySet().stream().forEach((depart)-> System.out.println("Department: "+depart.getKey()+" Designation :"+depart.getValue()));
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getDesignation, Collectors.summingDouble(Employee::getSalary)))).entrySet().stream().forEach(System.out::println);
    }

}
