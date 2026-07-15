package com.biet.dsa.dataStructures.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(1);
        numbers.add(21);
        numbers.add(11);
        numbers.add(5);
        numbers.add(51);
        numbers.add(3);
        System.out.println("Before: " + numbers);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer i = it.next(); // Store the next value
            if (i > 10){
                it.remove();
            }
        }
        System.out.println("After: " + numbers);
    }
}
