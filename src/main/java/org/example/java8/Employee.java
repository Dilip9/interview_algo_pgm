package org.example.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;
    private String designation;
    private String nationality;
    private LocalDate createdAt;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    public String getNationality() {
        return nationality;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public LocalDate getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Employee(String name, int age, double salary, String department, String nationality) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.nationality = nationality;
    }

    public Employee(String name, String department, String designation, double salary) {
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }
    public Employee(String name, double salary, String department, LocalDate createdAt) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", nationality='" + nationality + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
