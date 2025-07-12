package com.salman;

public class Prac4Q1 
{
    public static void main(String[] args) 
    {
        // Create an instance of Student and set properties
        Student student = new Student();
        student.name = "John Doe";
        student.age = 16;
        // Display student details using the static method
        Student.displayDetails(student.name, student.age);
    }
}