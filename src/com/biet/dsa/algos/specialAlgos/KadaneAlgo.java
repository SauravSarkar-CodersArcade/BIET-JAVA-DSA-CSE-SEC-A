package com.biet.dsa.algos.specialAlgos;
public class KadaneAlgo {
    public static int kadaneAlgo(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];
        for (int i=1; i<arr.length; i++){
//            cMax = Math.max(arr[i], cMax + arr[i]);
//            gMax = Math.max(cMax, gMax);
            cMax = (arr[i] > cMax + arr[i] ? arr[i] : cMax + arr[i]);
            gMax = (cMax > gMax) ? cMax : gMax;
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[] arr1 = {5,-8,1,2,-1,4};
        System.out.println("MSA: arr1: " + kadaneAlgo(arr1));
        int[] arr2 = {-1,-2,-3,-4,-5,-6,0};
        System.out.println("MSA: arr2: " + kadaneAlgo(arr2));
    }
}
