package com.biet.oops.constructor;
public class Student {
    String name;
    int age;
    String email;
    public Student(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
    }
    public static void main(String[] args) {
        // 2 objects = 2 lines
        // 200 objects = 200 lines
        // DRY => Don't Repeat Yourself
        Student s1 = new Student("Raushan", 26, "raushan@gmail.com");
        s1.display();
        Student s2 = new Student("Nirmal", 27, "nirmal@gmail.com");
        s2.display();
    }
}
