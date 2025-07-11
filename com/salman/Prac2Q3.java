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
        double cm = 5;
        for(double in = 1; in <= 10; in += 1, cm += 5) 
        {
            System.out.printf("%-6.1f    %-10.2f    %-6.1f         %-10.2f %n", 
                in, inchToCentimeters(in), cm, centimeterToInch(cm));
        }
    }
}
