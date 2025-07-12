package com.salman;

public class Employee 
{
    private String name;
    private double salary;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }


    Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
}