package com.salman;

import java.util.Scanner;

public class Prac1Q2 {
   public Prac1Q2() {
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int DAYS_IN_YEAR = 365;
      int SECONDS_IN_DAY = 31536000;
      System.out.println("Enter your age (years): ");
      int age = in.nextInt();
      System.out.println("Age in years: " + age);
      System.out.println("Age in days: " + age * DAYS_IN_YEAR);
      System.out.println("Age in seconds: " + age * SECONDS_IN_DAY);
      in.close();
   }
}
