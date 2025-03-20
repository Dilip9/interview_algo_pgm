package org.example.unittesting;

import org.example.java8.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static javafx.beans.binding.Bindings.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalPgmt {

    private JavaFunctionalPgm functionalPgm;

    @BeforeEach
    public void setup() {
        functionalPgm = new JavaFunctionalPgm();
    }

    @Test
    public void testGetEmployeeAgesAboveThreshold() {
        int ageThreshold = 55;
        List<Employee> employees = Arrays.asList(
                new Employee("John", 30, 3000, "IT", "Indian"),
                new Employee("Pratik", 22, 5200, "IT", "Indian"),
                new Employee("Devil", 60, 452300, "HR", "France"),
                new Employee("Gouri", 18, 30875600, "CS", "Germany")
        );
        List<Integer> result = functionalPgm.getEmployeeAgesAboveThreshold(employees, ageThreshold);
        assertEquals(1, result.size());

        // Write your test code here
    }
    @Test
    void testFilterUsersByAge() {
        List<User> users = Arrays.asList(
                new User("John", 30, "john@gmail.com"),
                new User("Alice", 22, "alice@gmail.com"),
                new User("Bob", 60, "bob@gmail.com")
        );

        List<Integer> validAges = Arrays.asList(30, 60);

        List<User> result = functionalPgm.filterUsersByAge(users, validAges);
        assertEquals(2, result.size());
        assertEquals("John", result.get(0).getName());
        assertEquals("Bob", result.get(1).getName());
    }

//    @Test
//    void testSumOfTwoNumbers() {
//        SumofTwoNumber sumofTwoNumber = mock(SumofTwoNumber.class);
//        when(sumofTwoNumber.sum(10, 20)).thenReturn(30);
//
//        int result = functionalPgm.sumOfTwoNumbers(10, 20, sumofTwoNumber);
//        assertEquals(30, result);
//
//        verify(sumofTwoNumber).sum(10, 20);
//    }

}
