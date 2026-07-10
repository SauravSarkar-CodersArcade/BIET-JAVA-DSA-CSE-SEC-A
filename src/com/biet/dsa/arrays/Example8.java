package com.biet.dsa.arrays;
class Student {
    String name;
    int USN;
}
class Intern {
    String name;
    int id;
    Intern(String name, int id){
        this.name = name;
        this.id = id;
    }
}
public class Example8 {
    public static void main(String[] args) {
        // Array of students
        Student[] students = new Student[3]; // Fixed memory
        // students[0], students[1], students[2]
        students[0] = new Student();
        students[0].name = "Aziz";
        students[0].USN = 101;
        students[1] = new Student();
        students[1].name = "Aman";
        students[1].USN = 102;
        students[2] = new Student();
        students[2].name = "Ajith";
        students[2].USN = 103;
        System.out.println(students[0].name + ", " + students[0].USN);
        Intern[] interns = new Intern[]{
            new Intern("Nomita", 100),
            new Intern("Anusha", 200),
            new Intern("Arjun", 300)
        };
        for (Intern i : interns){
            System.out.println(i.name + "," + i.id);
        }
        for (Student s : students){
            System.out.println(s.name + ", " + s.USN);
        }
    }
}
