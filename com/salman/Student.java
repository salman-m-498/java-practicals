package com.salman;

public class Student {
    // Data fields
    private int studentId;
    private String name;
    private int numberOfQuizzes;
    private int totalQuizScore;

    // No-arg constructor
    public Student() {
        this.studentId = 0;
        this.name = "";
        this.numberOfQuizzes = 0;
        this.totalQuizScore = 0;
    }

    // Constructor with 2 parameters
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.numberOfQuizzes = 0;
        this.totalQuizScore = 0;
    }

    // Accessors (getters)
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfQuizzes() {
        return numberOfQuizzes;
    }

    public int getTotalQuizScore() {
        return totalQuizScore;
    }

    // Mutators (setters)
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to add a quiz score
    public void addQuiz(int score) {
        if (score >= 0 && score <= 10) { // Each quiz is worth 10 marks
            this.totalQuizScore += score;
            this.numberOfQuizzes++;
        } else {
            System.out.println("Invalid score. Each quiz score must be between 0 and 10.");
        }
    }

    // Method to calculate the average score
    public double getAverageScore() {
        if (numberOfQuizzes == 0) {
            return 0.0; // Avoid division by zero
        }
        return (double) totalQuizScore / numberOfQuizzes;
    }
}