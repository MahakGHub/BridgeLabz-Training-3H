class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    private String name, designation;
    private final int id;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployee() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 1, "Developer");
        Employee e2 = new Employee("Neha", 2, "Manager");

        e1.displayEmployee();
        e2.displayEmployee();
        Employee.displayTotalEmployees();
    }
}
