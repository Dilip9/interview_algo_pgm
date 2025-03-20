package org.example.java8;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;
    private String nationality;


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

    public Employee(String name, int age, double salary, String department, String nationality) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.nationality = nationality;
    }

}
