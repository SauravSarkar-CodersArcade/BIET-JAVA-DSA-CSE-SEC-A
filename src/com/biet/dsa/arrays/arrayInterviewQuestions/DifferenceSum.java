package com.biet.dsa.arrays.arrayInterviewQuestions;
import java.util.Arrays;
public class DifferenceSum {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n];
        int l = 1;
        int r = 3;
        int val = 10;
        diff[l] += val;
        // Boundary Check for eliminating the extra added value
        if(r+1 < n){
            diff[r+1] -= val;
        }
        int[] result = new int[n];
        for (int i=1; i<n; i++){
            result[i] = result[i-1] + diff[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
