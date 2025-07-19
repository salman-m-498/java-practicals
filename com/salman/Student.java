package com.salman;

public class Student
{
    private String name;
    private int age;
    
    // Default constructor
    public Student() {
        this.name = "";
        this.age = 0;
    }
    
    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    
    public static void displayDetails(String studentName, int studentAge) 
    {
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }
    
    // Instance method to display student details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}