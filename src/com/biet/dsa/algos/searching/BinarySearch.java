package com.biet.dsa.algos.searching;
public class BinarySearch {
    static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                s = mid + 1; // move to the right
            }else {
                e = mid - 1; // move to the left
            }
        }
        return -1; // Invalid index [Key Not Found]
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9,10,15};
        System.out.println(binarySearch(arr, 10));
        System.out.println(binarySearch(arr, 1));
    }
}
