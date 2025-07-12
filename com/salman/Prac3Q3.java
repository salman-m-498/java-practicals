package com.salman;

import java.util.Scanner;

public class Prac3Q3 
{
    public static void main(String[] args) 
    {
        int[] denom = {100,50,20,10,5,1};
        int[] qty = new int[denom.length];
        
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the quantity of each denomination: ");
        for(int i = 0; i < denom.length; i++) 
        {
            System.out.print("Quantity of " + denom[i] + "'s : ");
            qty[i] = in.nextInt();
        }

        System.out.printf("%-6s     %-10s    %n", "Denominations", "Quantity");

        for(int i = 0; i < denom.length; i++) 
        {
            System.out.printf("         %3d         %-10d    %n", 
                denom[i], qty[i]);
        }

        System.out.printf("%-6s     %-10s      %-10s %n", "Denominations", "Quantity", "Value (RM)");

        int total = 0;
        for(int i = 0; i < denom.length; i++) 
        {
            if (qty[i] == 0) 
            {
                continue; // Skip denominations with zero quantity
            }
            else 
            {
               System.out.printf("         %3d         %-10d  %10d%n", 
                denom[i], qty[i], denom[i] * qty[i]);
            }
            
            total += denom[i] * qty[i];
        }
        System.out.println("Total = RM " + total);

        in.close();
    }
}
