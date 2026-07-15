package com.biet.dsa.dataStructures.collections.set;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array with duplicates: " +
                Arrays.toString(arr));
        Set<Integer> uniqueElements = new HashSet<>();
        for (int x : arr){
            uniqueElements.add(x);
        }
        System.out.println("Non-duplicates: " + uniqueElements);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4));
        Set<Integer> uniques = new HashSet<>();
        uniques.addAll(list);
        System.out.println(uniques);
    }
}
