package com.management;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Add employees
        manager.addEmployee(new Employee(1, "Alice", "Developer", 70000));
        manager.addEmployee(new Employee(2, "Bob", "Manager", 85000));
        manager.addEmployee(new Employee(3, "Charlie", "Analyst", 65000));

        // Display all employees
        System.out.println("All Employees:");
        manager.displayAllEmployees();

        // Search for an employee
        System.out.println("\nSearching for employee with ID 2:");
        Employee employee = manager.searchEmployeeById(2);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDeleting employee with ID 1.");
        manager.deleteEmployeeById(1);

        // Display all employees after deletion
        System.out.println("\nAll Employees after deletion:");
        manager.displayAllEmployees();
    }
}
