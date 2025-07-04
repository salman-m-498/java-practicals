package com.salman;

import java.util.Scanner;

public class Prac2Q2 
{
public static double sqrt(int num)
{
    double REQUIRED_PRECISION = 1e-8;
        
        // Handle special cases
        if (num == 0) return 0;
        if (num == 1) return 1;
        
        if (num > 1) {
            double min = 1;
            double max = num;
            double mid;
            double midSquare;
            double precision;
            
            // Loop until we reach required precision
            do 
            {
                mid = (max + min) / 2;
                midSquare = mid * mid;
                precision = (max - min)/min;
                
                // Adjust search bounds based on whether mid^2 is too big or too small
                if (midSquare > num) 
                {
                    max = mid;  // Search in lower half
                } else 
                {
                    min = mid;  // Search in upper half
                }
                
            } while (precision > REQUIRED_PRECISION);
            
            return mid;
        }
        // For numbers between 0 and 1
        else 
        {
            double min = 0;
            double max = 1;
            double mid;
            double midSquare;
            double precision;
            
            do 
            {
                mid = (max + min) / 2;
                midSquare = mid * mid;
                precision = (max - min)/min;
                
                if (midSquare > num) {
                    max = mid;
                } else {
                    min = mid;
                }
                
            } while (precision > REQUIRED_PRECISION);
            
            return mid;
        }
}

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = in.nextInt();
        if (num<0) 
        {
            System.err.println("CANNOT CALCULATE SQRT FOR NEGATIVE NUMBER");
            System.exit(1);
        }
        System.out.println(sqrt(num));
        in.close();
    }
}
