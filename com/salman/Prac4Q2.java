package com.salman;

public class Prac4Q2 
{
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 5000.0);

        // Display salary before raise
        System.out.println("Salary before raise: $" + emp.getSalary());

        // Raise salary
        emp.raiseSalary(8);

        // Display salary after raise
        System.out.println("Salary after 8% raise: $" + emp.getSalary());
    }
}