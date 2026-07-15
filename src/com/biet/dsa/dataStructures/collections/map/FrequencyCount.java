package com.biet.dsa.dataStructures.collections.map;
import java.util.HashMap;
import java.util.Map;
public class FrequencyCount {
    public static void main(String[] args) {
        // No Of Occurrence [Frequency] [HashMap]
        int[] arr = {1,2,3,4,5,1,6,7,8,1,9,2,3,4,1,10};
        Map<Integer, Integer> feqMap = new HashMap<>();
        for (int x : arr){
            feqMap.put(x, feqMap.getOrDefault(x, 0) + 1);
        }
        System.out.println(feqMap);
        // Show me how many times 1 is present
        System.out.println("Count of 1's: " + feqMap.get(1));
        char[] letters = {'B','h','a','g','y','a'};
        Map<Character, Integer> charMap = new HashMap<>();
        for (char letter : letters){
            charMap.put(letter, charMap.getOrDefault(letter, 0) + 1);
        }
        System.out.println("Number of a's: " + charMap.get('a'));
    }
}
