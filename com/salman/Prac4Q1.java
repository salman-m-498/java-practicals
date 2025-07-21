package com.salman;

public class Prac4Q1 
{
    public static void main(String[] args) 
    {
        // Create an instance of Student and set properties using setters
        StudentA student = new StudentA();
        student.setName("John Doe");
        student.setAge(16);
        
        // Display student details using the static method with getters
        StudentA.displayDetails(student.getName(), student.getAge());
        
        // Alternative: Display student details using the instance method
        System.out.println("\nUsing instance method:");
        student.displayDetails();
        
        // Demonstrate parameterized constructor
        System.out.println("\nUsing parameterized constructor:");
        StudentA student2 = new StudentA("Jane Smith", 18);
        student2.displayDetails();
    }
}