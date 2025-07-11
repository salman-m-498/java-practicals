package com.salman;

public class Average {

    // Method to average two integers
    public int calculateAverage(int a, int b) {
        return (a + b)/2;
    }

    // Method to average three integers (different number of parameters)
    public int calculateAverage(int a, int b, int c) {
        return (a + b + c)/3;
    }

    // Method to average two doubles (different data types of parameters)
    public double calculateAverage(double a, double b) {
        return (a + b)/2;
    }

    // Method to average three doubles (different number of parameters)
    public double calculateAverage(double a, double b, double c) {
        return (a + b + c)/3;
    }
}

