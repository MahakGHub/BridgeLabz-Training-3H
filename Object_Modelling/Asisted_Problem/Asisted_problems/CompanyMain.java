package com.gla.oops;

public class CompanyMain {
    public static void main(String[] args) {
        Company comp = new Company("Google");
        Department d1 = new Department("IT", comp);
        Department d2 = new Department("HR", comp);

        Employee e1 = new Employee("Mahak", d1);
        Employee e2 = new Employee("Aman", d2);

        e1.display();
        e2.display();
    }
}
