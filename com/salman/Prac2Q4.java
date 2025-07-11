package com.salman;

public class Prac2Q4 
{
    public static void main(String[] args) 
    {
            Average avg = new Average();
            System.out.println("Average of two integers: " + avg.calculateAverage(5, 10));
            System.out.println("Average of three integers: " + avg.calculateAverage(1, 2, 3));
            System.out.println("Average of two doubles: " + avg.calculateAverage(2.5, 3.5));
            System.out.println("Average of three doubles: " + avg.calculateAverage(1.1, 2.2, 3.3));
            System.out.println("Average of two floats: " + avg.calculateAverage(4.5f, 5.5f));
            System.out.println("Average of three floats: " + avg.calculateAverage(1.0f, 2.0f, 3.0f));
    }   
}
                                                