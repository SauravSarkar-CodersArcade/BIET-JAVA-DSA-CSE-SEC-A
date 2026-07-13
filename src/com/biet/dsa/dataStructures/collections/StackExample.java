package com.biet.dsa.dataStructures.collections;

import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(11);
        numbers.push(21);
        numbers.push(14);
        numbers.push(17);
        System.out.println(numbers);
        System.out.println(numbers.peek());
        System.out.println(numbers.size());
        System.out.println(numbers.empty());
        System.out.println(numbers.pop());
    }
}
