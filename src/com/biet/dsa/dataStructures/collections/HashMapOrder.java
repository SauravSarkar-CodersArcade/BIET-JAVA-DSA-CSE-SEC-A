package com.biet.dsa.dataStructures.collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapOrder {
    public static void main(String[] args) {
        Map<String, String> hm1 = new HashMap<>();
        hm1.put("bbbb", "1111");
        hm1.put("aaaa", "4444");
        hm1.put("dddd", "2222");
        hm1.put("cccc", "3333");
        for (Map.Entry<String, String> entry : hm1.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        Map<String, String> hm2 = new LinkedHashMap<>();
        hm2.put("bbbb", "1111");
        hm2.put("aaaa", "4444");
        hm2.put("dddd", "2222");
        hm2.put("cccc", "3333");
        for (Map.Entry<String, String> entry : hm2.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
