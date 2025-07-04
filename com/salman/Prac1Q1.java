package com.salman;

import java.util.Scanner;

public class Prac1Q1 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("What is your name?");
      String name = in.nextLine();
      System.out.println("What is your current year of study?");
      int year = in.nextInt();
      System.out.println("What is your target GPA this semester?");
      float gpa = in.nextFloat();
      System.out.println("Hello " + name + "!");
      System.out.println("Work hard to achieve your target GPA of " + gpa + " this semester of your year " + year);
      in.close();
   }
}
