package org.example.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFunctionalPgm {
    public List<Integer> getEmployeeAgesAboveThreshold(List<Employee> employees, int ageThreshold) {
        return employees.stream()
                .filter(emp -> emp.getAge() > ageThreshold)
                .map(Employee::getAge)
                .collect(Collectors.toList());
    }

    // Extract filtering logic for Users
    public List<User> filterUsersByAge(List<User> users, List<Integer> validAges) {
        return users.stream()
                .filter(user -> validAges.contains(user.getAge()))
                .collect(Collectors.toList());
    }

    // Extract sum function for testing
    public int sumOfTwoNumbers(int a, int b, SumofTwoNumber sumofTwoNumber) {
        return sumofTwoNumber.sum(a, b);
    }

    // Extract reduce method
    public int reduceSum(int a, int b, ReduceFunction<Integer> reduceFunction) {
        return reduceFunction.apply(a, b);
    }

    public static List<User> sortEmployeeBasedOnEmailAdDressLength(List<User> employees){
        return employees.stream()
                .sorted(Comparator.comparingInt(emp -> emp.getEmail().length()))
                .collect(Collectors.toList());
    }

//    public  ArrayList<String> anagramGroups(List<String> words){
//        Collection<List<String>> result  = words.stream().collect(Collectors.groupingBy(word -> words.stream().sorted().collect(Collectors.joining()))).values());
//        return result;
//    }

}
