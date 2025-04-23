package org.example.java8;


import java.util.*;
import java.util.stream.Collectors;

public class CollectorsOperations {
    public static void main(String[] args) {
        // Example usage of collectors
        // You can add your own code here to demonstrate the use of collectors
        List<Employee> employees = Arrays.asList(new Employee("John", "HR","VP", 5000.00),
                new Employee("Jane", "Finance","Manager", 5789.00),
                new Employee("Jack", "HR", "Assistent", 2000.00),
                new Employee("Jill", "Finance","CEO", 10000.00),
                new Employee("Joe", "IT", "Manager", 6000.00),
                new Employee("Judy", "IT", "Assistent", 3000.00),
                new Employee("Jim", "IT", "VP", 7000.00),
                new Employee("Jake", "Civil", "Intern", 1000.00));


       // employees.stream().sorted((age1, age2) -> age2.getName().length() - age1.getName().length()).collect(Collectors.toList()).forEach(System.out::println);
        //employees.stream().sorted(Comparator.comparingDouble(employees -> employees.getSalary())).collect(Collectors.toSet()).forEach(System.out::println);
        //employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);


        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new,
                        Collectors.mapping(Employee::toString, Collectors.toList())))
                .forEach((k, v) -> {
                            System.out.println("Department: "+k);
                            v.forEach(System.out::println);
                            System.out.println();
                        });

















    }


}
