package org.example.unittesting;

import org.example.java8.Employee;
import org.example.java8.FunctionalPgm;
import org.example.java8.JavaFunctionalPgm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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
}
