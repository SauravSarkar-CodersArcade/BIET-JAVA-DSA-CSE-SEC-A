package com.biet.dsa.dataStructures.collections.test;

import java.util.Stack;
public class ValidParentheses {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({[]})";
        String s1 = "({[})";
        String s2 = "({[})";
        System.out.println(s+ "=> " + (isValid(s) ? "Valid" : "Invalid"));
        System.out.println(s1 + "=> " + (isValid(s1) ? "Valid" : "Invalid"));
        System.out.println(s2 + "=> " + (isValid(s2) ? "Valid" : "Invalid"));
    }
}