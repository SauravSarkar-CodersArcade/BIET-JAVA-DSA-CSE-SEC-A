package com.biet.dsa.algos.searching;
public class FirstLastTotal {
    static int firstOcc(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                // Store the ans and move to the extreme left
                // for the first occurrence [Sorted Array]
                ans = mid;
                e = mid -1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int lastOcc(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key){
                // Store the ans and move to the extreme right
                // for the last occurrence [Sorted Array]
                ans = mid;
                s = mid  + 1;
            } else if (arr[mid] < key) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int totalOcc(int[] arr, int key){
        int fo = firstOcc(arr, key);
        int lo = lastOcc(arr, key);
        return lo - fo + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5,6};
        int key = 3;
        System.out.println("First Occ: " + firstOcc(arr, key));
        System.out.println("Last Occ: " + lastOcc(arr, key));
        System.out.println("Total Occ: " + totalOcc(arr, key));
    }
}
