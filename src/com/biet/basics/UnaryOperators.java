package com.biet.basics;
public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(--a + --b);
        System.out.println(a + ", " + b);
        for (int i=0; i<5; i++){
            System.out.println(i); // 0 to 4
        }
        for (int i=0; i<5; ++i){
            System.out.println(i); // 0 to 4
        }

    }
}
