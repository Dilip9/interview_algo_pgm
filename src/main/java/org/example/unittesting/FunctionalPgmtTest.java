package org.example.unittesting;

import static org.mockito.Mockito.when;
import org.example.java8.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class FunctionalPgmtTest {

    private JavaFunctionalPgm functionalPgm;

    @Mock
    private SumofTwoNumber sumofTwoNumber;

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

    @Test
    void testSumOfTwoNumbers() {
        SumofTwoNumber sumofTwoNumber = mock(SumofTwoNumber.class);
        when(sumofTwoNumber.sum(10, 20)).thenReturn(30);

        int result = functionalPgm.sumOfTwoNumbers(10, 20, sumofTwoNumber);
        assertEquals(30, result);

        verify(sumofTwoNumber).sum(10, 20);
    }

    @Test
    void testReduceSum() {
        // Given
        ReduceFunction<Integer> reduceFunctionMock = mock(ReduceFunction.class);
        when(reduceFunctionMock.apply(10, 20)).thenReturn(30);

        // When
        int result = functionalPgm.reduceSum(10, 20, reduceFunctionMock);

        // Then
        assertEquals(30, result);
        verify(reduceFunctionMock).apply(10, 20);
    }

    @Test
    public void testSortEmployeeBasedOnEmailAdDressLength() {
        List<User> employees = Arrays.asList(
                new User("John", 30, "demo@gmail.com"),
                new User("Pratik", 22, "JohnErih@gmail.com"),
                new User("Devil", 60, "ro@gmail.com"));
        //when(JavaFunctionalPgm.sortEmployeeBasedOnEmailAdDressLength(employees)).thenReturn(employees);
        List<User> result = JavaFunctionalPgm.sortEmployeeBasedOnEmailAdDressLength(employees);
        assertEquals(3, result.size());
        assertEquals("ro@gmail.com", result.get(0).getEmail());
        assertEquals("demo@gmail.com", result.get(1).getEmail());

    }

    // Another approach to test static method.
    @Test
    public void testSortEmployeeBasedOnEmailAdDressLengthUsingStatic() {
        List<User> employees = Arrays.asList(
                new User("John", 30, "demo@gmail.com"),
                new User("Pratik", 22, "JohnErih@gmail.com"),
                new User("Devil", 60, "ro@gmail.com"));
        try (MockedStatic<JavaFunctionalPgm> theMock = Mockito.mockStatic(JavaFunctionalPgm.class)) {
            theMock.when(() -> JavaFunctionalPgm.sortEmployeeBasedOnEmailAdDressLength(employees)).thenReturn(employees);
            List<User> result = JavaFunctionalPgm.sortEmployeeBasedOnEmailAdDressLength(employees);
            System.out.println(result);
            assertEquals(3, result.size());
            assertEquals("ro@gmail.com", result.get(0).getEmail());
            assertEquals("demo@gmail.com", result.get(1).getEmail());
            theMock.verify(() -> JavaFunctionalPgm.sortEmployeeBasedOnEmailAdDressLength(employees));

        }
    }

}
