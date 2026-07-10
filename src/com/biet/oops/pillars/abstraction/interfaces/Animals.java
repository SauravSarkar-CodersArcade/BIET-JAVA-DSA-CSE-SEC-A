package com.biet.oops.pillars.abstraction.interfaces;
public interface Animals {
    // Interfaces allow only abstract methods
    // Therefore it is 100% abstraction
    // interfaces can now have default methods with bodies
    default void display(){
        System.out.println("This is an Animal Class Prototype");
    }
    void eat();
    void run();
}
class Cheetah implements Animals{
    @Override
    public void eat() {
        System.out.println("Cheetah eats meat.");
    }
    @Override
    public void run() {
        System.out.println("Cheetah runs very fast.");
    }
    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        cheetah.display();
        cheetah.eat();
        cheetah.run();
    }
}
