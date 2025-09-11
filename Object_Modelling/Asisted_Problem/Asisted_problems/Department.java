package com.gla.oops;

public class Department {
    private String deptName;
    private Company company;

    public Department(String deptName, Company company) {
        this.deptName = deptName;
        this.company = company;
    }

    public String getDeptName() {
        return deptName;
    }

    public Company getCompany() {
        return company;
    }
}
