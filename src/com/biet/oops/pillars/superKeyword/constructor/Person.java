package com.biet.oops.pillars.superKeyword.constructor;
public class Person {
    Person(String name){
        System.out.println("Name: " + name);
    }
}
class Student extends Person {
    Student(){
        super("Rahul"); // Parent Class Constructor
        System.out.println("Course : CSE");
    }
    public static void main(String[] args) {
        // Order of Execution : Parent Class -> Child Class
        Student student = new Student();
    }
}
