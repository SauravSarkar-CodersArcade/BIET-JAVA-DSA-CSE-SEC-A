package com.biet.dsa.algos.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        // n - 1 iterations [Comparing 1 less element]
        for (int i=0; i< arr.length-1; i++){
            // Assume that the current element is the least
            int minIndex = i;
            for (int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j; // Our assumption is wrong
                }
            }
            if(minIndex != i){ // It means we need to swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,2,3,4,0,1,5};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
