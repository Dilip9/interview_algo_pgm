package org.example.java8;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;
    private String designation;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", Nationality' " + nationality + '\'';
    }

}
