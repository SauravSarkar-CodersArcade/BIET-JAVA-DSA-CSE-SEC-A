package com.biet.dsa.algos.sorting;
import java.util.Arrays;
public class InsertionSort {
    static void insertionSort(int[] arr){
        for (int i=1; i< arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                // Shift Operation
                arr[j+1] = arr[j];
                j--; // Create an empty space [] by shifting
            }
            arr[j+1] = temp; // Fill the empty space [] with temp var
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,2,3,4,0,1,5};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
