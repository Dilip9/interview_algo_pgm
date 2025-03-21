package org.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalPgm {

    public static void main(String[] args) {
        // HCL Interview question for second and final round.
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 3000, "IT", "Indian"));
        employees.add(new Employee("Pratik", 22, 5200, "IT", "Indian"));
        employees.add(new Employee("John", 30, 50200, "IT", "Indian"));
        employees.add(new Employee("Devil", 60, 452300, "HR", "France"));
        employees.add(new Employee("Gouri", 18, 30875600, "CS", "Germany"));
        employees.add(new Employee("Erick", 34, 3023400, "Operation", "USA"));
        employees.add(new Employee("Rohan", 20, 70250, "DELIVERY", "Indian"));
        employees.add(new Employee("Rashmi", 56, 30200, "MEDICAL", "Indian"));
        employees.add(new Employee("Hemalatha", 67, 30200, "IT", "Indian"));
        employees.add(new Employee("Devyani", 23, 30200, "HR", "France"));
        employees.add(new Employee("Hanshika", 32, 30200, "CS", "USA"));
        employees.add(new Employee("Dimple", 43, 10200, "MECHANICAL", "ITALY"));

        List<User> users = new ArrayList<>();
        users.add(new User("Swamy", 30, "pratik@gmail.com"));
        users.add(new User("John", 56, "ram@gmail.com"));
        users.add(new User("John", 72, "rohan3454@gmail.com"));
        users.add(new User("Meekashi", 50, "dimple3231@gmail.com"));
        users.add(new User("John", 56, "Gouri24@gmail.com"));
        users.add(new User("Joel Joy", 23, "Rashmanique@gmail.com"));
        users.add(new User("Rohini", 30, "hemalatha576@gmail.com"));
        users.add(new User("Hanshika Roy", 67, "devyani658@yahoo.com"));
        users.add(new User("Supritha Arti", 30, "hanshika7894@zoho.com"));

        List<Integer> employeess = employees.stream().filter(emp -> emp.getAge()>33).map(employee -> employee.getAge()).collect(Collectors.toList());
        users.stream().filter(user -> employeess.contains(user.getAge())).forEach(user -> System.out.println("Name: " + user.getName() + ", Age: " + user.getAge() + ", Nationality: " + user.getEmail()));

        //BiFunctionalInterface biFunctionalInterface = (a, b) -> a + b;
        int num1=20,num2=30;
        int[] number = {678,345,756,890,2345,7543678,8690112,5467};
        SumofTwoNumber sumofTwoNumber = (a, b) -> a + b;
        System.out.println("Sum of two numbers: "+sumofTwoNumber.sum(num1,num2));

        //Reduce functional interface
        Arrays.stream(number).reduce(Integer::sum).ifPresent(System.out::println);
        Arrays.stream(number).reduce(Integer::max).ifPresent(System.out::println);
        Arrays.stream(number).reduce(Integer::min).ifPresent(System.out::println);
        //custom functional interface and reduce method.
        ReduceFunction<Integer> reduceFunction = Integer::sum;
        System.out.println("Sum of two numbers: "+reduceFunction.apply(num1, num2));
        System.out.println("Sum of two numbers: "+JavaFunctionalPgm.sortEmployeeBasedOnEmailAdDressLength(users));
        List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "java");
        JavaFunctionalPgm javaFunctionalPgm = new JavaFunctionalPgm();
        //System.out.println(" Anagram of words: "+javaFunctionalPgm.anagramGroups(words));
        words.stream()
                .collect(Collectors.groupingBy(word -> word.chars()
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString())).forEach((k, v) -> System.out.println( "key "+k+"Value " +v));


    }
}


