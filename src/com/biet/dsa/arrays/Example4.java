package com.biet.dsa.arrays;

import java.util.Arrays;

// Pass Arrays to Methods
public class Example4 {
    public static void printArray(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] createArray(){
        return new int[]{1,2,3,4,5};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
        int[] result = createArray();
        System.out.println(Arrays.toString(result));
        printArray(new int[]{10,20,30}); // Anonymous Array -> Deleted after call
    }
}
