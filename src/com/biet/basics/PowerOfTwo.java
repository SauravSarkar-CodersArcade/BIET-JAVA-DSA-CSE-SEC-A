package com.biet.basics;
public class PowerOfTwo {
    static boolean isPowerOfTwo(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // PowerOfTwo obj = new PowerOfTwo();
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(15));
        System.out.println((2 & 1)==0 ?"EVEN" : "ODD");
        System.out.println((5 & 1)==0 ?"EVEN" : "ODD");
    }
}
