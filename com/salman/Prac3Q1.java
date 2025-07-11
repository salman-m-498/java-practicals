package com.salman;
import java.util.Scanner;

public class Prac3Q1 
{
    public static void main(String[] args) 
{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of quiz scores to process: ");
        int n = input.nextInt();
        int scores[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }
        //System.out.println(Arrays.toString(scores) + " is the array of scores");

        // Calculate the sum of scores
        int sum = 0;
        for (int score : scores) { // loop for summing
            sum += score;
        }

        double avg = (double) sum / n; // Calculate average
        int over = 0, under = 0; // Counters for scores above and below average

        System.out.printf("Average is: %.1f%n", avg);

        for (int score : scores) { // loop for comparison
            if (score >= avg) {
                over++;
            } else {
                under++;
            }
        }

        System.out.println("Number of scores above or equal to average: " + over);
        System.out.println("Number of scores below the average: " + under);

        input.close();
    }    
}

