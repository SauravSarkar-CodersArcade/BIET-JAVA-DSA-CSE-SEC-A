package com.biet.oops.pillars.superKeyword.variables;
public class Employee { // Parent
    String company = "Tripillar Solutions";
}
class Manager extends Employee { // Child
    String company = "Coders Arcade";
    void show(){
        System.out.println("Current Company: " + this.company); // child - current
        System.out.println("Previous Company: " + super.company); // parent
    }
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.show();
    }
}
