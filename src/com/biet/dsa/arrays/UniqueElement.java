package com.biet.dsa.arrays;
public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,3,2,1};
        int result = 0;
        for(int i=0; i< arr.length; i++){
            result = result ^ arr[i];
        }
        System.out.println("The unique element is: " + result);
        char[] letters = {'G','n','a','n','e','s','h','w','a','r','i'};
        // String name = letters.toString(); // Gnaneshwari
        String name = new String(letters);
        System.out.println(name);
    }
}
