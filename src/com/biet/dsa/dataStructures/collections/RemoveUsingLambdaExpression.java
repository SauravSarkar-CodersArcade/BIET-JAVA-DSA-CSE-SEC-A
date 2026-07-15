package com.biet.dsa.dataStructures.collections;
import java.util.ArrayList;
public class RemoveUsingLambdaExpression {
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
        // Predicate -> Variable [a-z]
        // Filter -> Condition
        numbers.removeIf(x -> x > 10);
        System.out.println("After: " + numbers);
    }
}
