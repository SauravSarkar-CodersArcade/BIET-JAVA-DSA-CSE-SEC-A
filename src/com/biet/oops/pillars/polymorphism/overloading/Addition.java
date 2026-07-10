package com.biet.oops.pillars.polymorphism.overloading;
public class Addition {
    static void add(int a, int b){
        System.out.println(a + b);
    }
    static void add(int a, int b, int c){
        System.out.println(a + b);
    }
    static void add(float a, float b){
        System.out.println("Float");
        System.out.println(a + b);
    }
    static void add(double a, double b){
        System.out.println("Double");
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1.24f, 2.56f);
        add(12.3456, 14.9876);
        // ℹ All decimal values are double by default
        // ❌ They are not float :
        // ✅ For float we use f or F  ️
    }
}
