package com.biet.dsa.algos.searching;
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr,
                                            int key, int s, int e){
        if (s > e) return -1; // key Not Found
        int mid = s + (e-s)/2;
        if(arr[mid] == key) return mid;
        if (arr[mid] < key){
            return recursiveBinarySearch(arr, key, mid+1, e);
        }else {
            return recursiveBinarySearch(arr, key, s, mid-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,11,13,15,17};
        int key = 170;
        int result = recursiveBinarySearch(arr, key, 0, arr.length-1);
        System.out.println("Element: " + key + " found at index: " + result);
    }
}
