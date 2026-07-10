package com.biet.oops.pillars.encapsulation;
public class Employee {
    // private access modifier
    // for encapsulation
    private String name;
    private int salary;
    // setters => void
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    // getters => based on vars
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }

}
