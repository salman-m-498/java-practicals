package com.salman;

import java.util.Scanner;

public class Prac1Q3 {
   public static int sumOtherDigit(int num) 
   {
      int sum = 0;
      boolean addDigit = true;

      for(; num > 0; num /= 10) {
         int digit = num % 10;
         if (addDigit) {
            sum += digit;
         }
         addDigit = !addDigit;
      }

      return sum;
   }

   public static int sumDoubleDigit(int num) 
   {
      int altSum = 0;

      for(boolean addDigit = false; num > 0; num /= 10) {
         int digit = num % 10;
         if (addDigit) {
            int doubledDigit = digit * 2;
            if (doubledDigit >= 10) {
               altSum += doubledDigit % 10 + doubledDigit / 10;
            } else {
               altSum += doubledDigit;
            }
         }
         addDigit = !addDigit;
      }

      return altSum;
   }

   public static int validChecksum(int num)
   {
      int partialNum = (num / 10) * 10;
      int total = sumOtherDigit(partialNum) + sumDoubleDigit(partialNum);
      int validChecksum = (10 - (total % 10)) % 10;


      return validChecksum;
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter your 8 digit card number: ");
      int cardNum = in.nextInt();
      System.out.println("Sum: " + sumOtherDigit(cardNum));
      System.out.println("Alt Sum: " + sumDoubleDigit(cardNum));
      if ((sumOtherDigit(cardNum) + sumDoubleDigit(cardNum)) % 10 == 0) {
         System.out.println("Card Number is Valid");
      } else {
         System.out.println("Card Number is Invalid!");
         System.out.println("The checksum digit should be: " + validChecksum(cardNum));
      }

      in.close();
   }
}
