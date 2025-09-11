package com.gla.oops;

public class Employee {
    private String name;
    private Department dept;

    public Employee(String name, Department dept) {
        this.name = name;
        this.dept = dept;
    }

    public void display() {
        System.out.println("Employee: " + name + 
                           " | Department: " + dept.getDeptName() +
                           " | Company: " + dept.getCompany().getName());
    }
}
