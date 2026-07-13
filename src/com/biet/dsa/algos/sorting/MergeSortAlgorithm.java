package com.biet.dsa.algos.sorting;
import java.util.Arrays;
public class MergeSortAlgorithm {
    public static void mergeSort(int[] arr){
        // Edge case | Corner Case | Boundary Condition
        if (arr.length < 2){
            return;
            // If the length of the array is 1, we stop dividing
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left); // Break down the left array using recursion
        mergeSort(right); // Break down the right array using recursion
        merge(arr, left, right); // Merge the two sorted arrays into one
    }
    public static void merge(int[] arr, int[] left, int[] right){
        int i=0, j=0, k=0;
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        // For remaining elements (if any) [JUST COPY PASTE]
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,-1,-5,5,2,7,6,4};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
