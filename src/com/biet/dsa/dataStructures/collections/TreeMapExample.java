package com.biet.dsa.dataStructures.collections;
import java.util.TreeMap;
public class TreeMapExample {
    public static void main(String[] args) {
        /*
        ℹ️K-V Pairs + Sorted Order => TreeMap
         */
        TreeMap<Integer, Character> status = new TreeMap<>();
        status.put(3, 'C');
        status.put(1, 'B');
        status.put(2, 'D');
        status.put(4, 'A');
        System.out.println(status);
    }
}
