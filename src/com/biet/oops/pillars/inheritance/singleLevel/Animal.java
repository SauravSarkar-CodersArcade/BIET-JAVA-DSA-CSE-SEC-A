package com.biet.oops.pillars.inheritance.singleLevel;
// Parent | Super Class
public class Animal {
    void eat(){
        System.out.println("Animal eats some food!");
    }
    void sound(){
        System.out.println("Animal makes some sound!");
    }
}
// Child | Sub Class
class Cat extends Animal{
    void climb(){
        System.out.println("Cats can climb trees.");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
        cat.climb();
    }
}
