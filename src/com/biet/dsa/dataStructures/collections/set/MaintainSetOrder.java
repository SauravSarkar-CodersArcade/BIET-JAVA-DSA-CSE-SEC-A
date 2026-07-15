package com.biet.dsa.dataStructures.collections.set;
import java.util.LinkedHashSet;
import java.util.Set;
public class MaintainSetOrder {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(100);
        numbers.add(10);
        numbers.add(1);
        numbers.add(4);
        numbers.add(11);
        numbers.add(100);
        System.out.println(numbers);
    }
}
