package com.biet.dsa.arrays;
public class Example1 {
    public static void main(String[] args) {
        // Various ways to declare arrays
        int[] arr1; // Declaration
        arr1 = new int[5]; // Memory allocation of 20 bytes
        System.out.println(arr1[2]);
        // If we are not assigning elements - JVM follows
        // FALLBACK MECHANISM => ALL DEFAULT VALUES based on data type
        int[] arr2 = new int[5]; // Declaration + Allocation in the same line
        System.out.println(arr2[4]);
        int[] arr3 = {10,0,2,4,1,6};
        int[] arr4 = new int[]{1,2,3,4,5};
    }
}
