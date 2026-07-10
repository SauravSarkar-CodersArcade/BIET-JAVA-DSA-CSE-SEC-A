package com.biet.dsa.arrays;
import java.util.Arrays;
public class Example2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        /*
        position = index + 1
        index = position - 1
         */
        System.out.println(arr[6]); // Accessing Data => O(1) indexing
        arr[1] = 100; // Time Complexity of Update Operation ? O(1) indexing
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String name = "BIET";
        System.out.println(name.length());
        // arr.length -> property name.length() -> method of the String class
        // Enhanced For Loop or For Each Loop
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        // Object class is the Parent Class of all classes in Java
        for (Object o : arr){
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    /*
    ☑ array.length is a property
    ☑ string.length() is a method
    ☑ Memory Management in arrays
    ️⭐Array object is stored in the heap memory
    ⭐  Variables are stored in the stack memory
    ⭐ Elements of array are stored in continuous memory blocks
    ✅ char[1][1][1][1] int[4][4][4][4] double[8][8][8][8]
     */
}
