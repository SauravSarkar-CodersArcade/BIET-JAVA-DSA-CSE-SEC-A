package com.biet.oops.constructorChaining;
public class Employee {
    // Attributes | Fields | Instance Variables | Properties |  Variables
    int id;
    String name;
    double salary;
    static String company = "TCS";
    Employee(){
        this(0, "Not Assigned", 0.0); // Dummy Employee
    }
    Employee(int id, String name){
        this(id, name, 30000);
    }
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary + " " + company);
    }
    public static void main(String[] args) {
        Employee e0 = new Employee();
        e0.display();
        Employee e1 = new Employee(101, "Rahul", 45000);
        e1.display();
        Employee e2 = new Employee(102, "Raman");
        e2.display();
    }
}
