package com.salman;

import java.lang.Math;

public class Prac2Q1 
{
    public static void main(String[] args) 
    {
        System.out.printf("%-6s    %-10s %n", "Number", "SquareRoot");
        for(int i = 0; i <= 20; i += 2) 
        {
            System.out.printf("%-6d    %-11.4f %n", i, Math.sqrt(i));
        }
    }
}