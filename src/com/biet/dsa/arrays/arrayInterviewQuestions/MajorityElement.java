package com.biet.dsa.arrays.arrayInterviewQuestions;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,2,2,2};
        int candidate = 0;
        int count = 0;
        for (int i=0; i< arr.length; i++){
            if(count == 0){
                candidate = arr[i];
            }
            if(arr[i] == candidate){
                count++;
            }else {
                count--;
            }
        }
        int c = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == candidate){
                c++;
            }
        }
        if(c > arr.length / 2) {
            System.out.println(candidate + " occurs: " + c + " times.");
            System.out.println("Majority element: " + candidate);
        }else {
            System.out.println("No majority element found!");
        }
    }
}
