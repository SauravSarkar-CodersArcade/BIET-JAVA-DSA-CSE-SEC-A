package com.biet.dsa.dataStructures.collections;
import java.util.Hashtable;
import java.util.Map;
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Aman");
        ht.put(117, "Amith");
        ht.put(128, "Aziz");
        ht.put(96, "Dhanya");
        ht.put(99, "Bhagya");
        ht.put(102, "Divya");
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() +", " + entry.getValue());
        }
    }
}
