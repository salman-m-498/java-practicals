package com.salman;

public class Prac2Q3 
{
    public static double inchToCentimeters(double in)
    {
        double convertedCm = in * 2.54;
        return convertedCm;
    }
    public static double centimeterToInch(double cm)
    {
        double convertedInch = cm/2.54;
        return convertedInch;
    }
    public static void main(String[] args) 
    {
        System.out.printf("%-6s    %-10s   %-6s    %-10s %n", "Inches", "Centimeters", "Centimeters", "Inches");
        for(double i = 1; i <= 10; i += 1) 
        {
            System.out.printf("%-6.1f    %-10s %n", i, inchToCentimeters(i));
        }
        for(double i = 5; i <= 50; i += 5) 
        {
            System.out.printf("%-6.1f    %-10s %n", i, centimeterToInch(i));
        }
    }
}
