package com.biet.oops.pillars.encapsulation;

public class EncapDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Saurav");
        employee.setSalary(10000);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
