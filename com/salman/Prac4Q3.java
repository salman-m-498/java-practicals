package com.salman;

public class Prac4Q3 {
    public static void main(String[] args) {
        // Test no-arg constructor
        Student student1 = new Student();
        System.out.println("Testing no-arg constructor:");
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Number of Quizzes: " + student1.getNumberOfQuizzes());
        System.out.println("Total Quiz Score: " + student1.getTotalQuizScore());
        System.out.println("Average Score: " + student1.getAverageScore());
        System.out.println();

        // Test parameterized constructor
        Student student2 = new Student(101, "Alice");
        System.out.println("Testing parameterized constructor:");
        System.out.println("Student ID: " + student2.getStudentId());
        System.out.println("Name: " + student2.getName());
        System.out.println("Number of Quizzes: " + student2.getNumberOfQuizzes());
        System.out.println("Total Quiz Score: " + student2.getTotalQuizScore());
        System.out.println("Average Score: " + student2.getAverageScore());
        System.out.println();

        // Test mutators
        System.out.println("Testing mutators:");
        student2.setStudentId(102);
        student2.setName("Bob");
        System.out.println("Updated Student ID: " + student2.getStudentId());
        System.out.println("Updated Name: " + student2.getName());
        System.out.println();

        // Test addQuiz and getAverageScore
        System.out.println("Testing addQuiz and getAverageScore:");
        student2.addQuiz(8);
        student2.addQuiz(10);
        student2.addQuiz(7);
        System.out.println("Number of Quizzes: " + student2.getNumberOfQuizzes());
        System.out.println("Total Quiz Score: " + student2.getTotalQuizScore());
        System.out.println("Average Score: " + student2.getAverageScore());
        System.out.println();

        // Test invalid quiz score
        System.out.println("Testing invalid quiz score:");
        student2.addQuiz(15); // Invalid score
        System.out.println("Number of Quizzes: " + student2.getNumberOfQuizzes());
        System.out.println("Total Quiz Score: " + student2.getTotalQuizScore());
        System.out.println("Average Score: " + student2.getAverageScore());
    }
}