package com.biet.dsa.algos.searching;
public class SquareRoot {
    static int squareRoot(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            }
            if (square > n){
                e = mid -1; // Too large value, move to the left for the ans
            }else {
                // Store the ans & move to the right [For the integral value]
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRoot(36));
        System.out.println(squareRoot(24));
    }
}
