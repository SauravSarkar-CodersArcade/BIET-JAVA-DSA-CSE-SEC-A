package com.biet.dsa.algos.sorting;
import java.util.Arrays;
public class CountSortAlgorithm {
    public static void countSort(int[] arr){
        // Step 1: Find the max
        int k = arr[0]; // Assume that first element is max
        for (int i=1; i< arr.length; i++){
            if (arr[i] > k){
                k = arr[i];
            }
        }
        // Step: 2 Create a count array of [0 to max]
        int[] count = new int[k+1];
        // Step: 3 Calculate the frequency of all the array elements
        for (int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        // Step: 4 Cumulative Frequency [curr = curr + prev]
        // Start from index 1 because 0 has no prev index
        for (int i=1; i<=k; i++){
            count[i] += count[i-1];
        }
        // Step 5: Create the output array
        int[] output = new int[arr.length];
        // Step 6: Start from Right to Left [End of array]
        for (int i= arr.length-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // Copy the output back to the input
        System.arraycopy(output, 0, arr, 0,
                arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4,1,6,4,3};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
