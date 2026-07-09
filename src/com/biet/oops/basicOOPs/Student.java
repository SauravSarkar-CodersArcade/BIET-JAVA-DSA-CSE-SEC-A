package com.biet.oops.basicOOPs;
public class Student {
    String name;
    int age;
    String email;
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
    public static void main(String[] args) {
        // 2 objects = 8 lines
        // 200 objects = 800 lines
        // DRY => Don't Repeat Yourself
        Student s1 = new Student();
        s1.name = "Raushan";
        s1.age = 26;
        s1.email = "raushan@gmail.com";
        s1.display();
        Student s2 = new Student();
        s2.name = "Nirmal";
        s2.age = 27;
        s2.email = "nirmal@gmail.com";
        s2.display();
    }
}
