package com.biet.oops.pillars.abstraction.abstractClasses;
abstract class Animal {
    // There are two types of methods in a class
    // 1. Normal Method => Bodies can be defined
    void eat(){
        System.out.println("Animal eats something.");
    }
    // 2. Abstract Method => Empty bodies [used in child classes]
    abstract void run();
    // If a class has even one normal method, it is not 100% abstract
    // If a class has only abstract methods, it is 100% abstract
}
class Cat extends Animal{
    @Override
    public void run(){
        System.out.println("Cats run very fast.");
    }
}
class Sloth extends Animal {
    @Override
    public void run(){
        System.out.println("Sloths run very very slow.");
    }
}
class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Sloth sloth = new Sloth();
        cat.eat();
        cat.run();
        sloth.eat();
        sloth.run();
    }
}

