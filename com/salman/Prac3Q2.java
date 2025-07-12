package com.salman;

public class Prac3Q2 {

    public static int findSmallestElementIndex(int[] arr)
    {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 for empty or null arrays
        }

        int smallestIndex = 0; // Start with the first index
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i; // Update index if a smaller element is found
            }
        }
        return smallestIndex; // Return the index of the smallest element
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 4, 5, 10, 100, 2, -22};
        int smallestIndex = findSmallestElementIndex(arr);
        System.out.println("The smallest element is at index: " + smallestIndex);

    }
}