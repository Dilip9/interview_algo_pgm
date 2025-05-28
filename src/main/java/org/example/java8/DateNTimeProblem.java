package org.example.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DateNTimeProblem {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Alice", 19990.90, "HR", LocalDate.of(2022, 12, 10)),
                new Employee("Bob", 789823.90, "IT", LocalDate.of(2025, 1, 15)),
                new Employee("Charlie",45678.09, "IT", LocalDate.of(2025, 3, 1)),
                new Employee("Diana",234567.98, "HR", LocalDate.of(2023, 11, 20)),
                new Employee("Eve",5467324.23, "IT", LocalDate.of(2025, 5, 5))
        );
        LocalDate currentDate = LocalDate.now();
        LocalDate sixMonthsAgo = currentDate.minusMonths(6);
        employees.stream().filter(e -> e.getCreatedAt().isBefore(sixMonthsAgo))
                .forEach(e -> System.out.println("Employee: " + e.getName() + ", Salary: " + e.getSalary() + ", Department: " + e.getDepartment() + ", Created At: " + e.getCreatedAt()));

        List<LocalDate> holidays = Arrays.asList(
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 12, 31)
        );
        LocalDate startDate = LocalDate.of(2025, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 12, 31);
        long result= startDate.datesUntil(endDate.plusDays(1))
                .filter(d -> !(d.getDayOfWeek() == DayOfWeek.SATURDAY || d.getDayOfWeek()== DayOfWeek.SUNDAY || holidays.contains(d))).count();
        System.out.println("Number of working days between " + startDate + " and " + endDate + ": " + result);
        IntStream.rangeClosed(1, 12).mapToObj(month -> YearMonth.of(2025, month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY))).collect(Collectors.toList()).forEach(System.out::println);
    }
}
