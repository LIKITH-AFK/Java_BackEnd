package com.Abstraction.Employee_Task;

abstract class Employee {

    String name;
    String employeeId;

    Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract void calculateSalary();

    void applyLeave() {
        System.out.println("Leave applied successfully.");
    }

    void getDetails() {
        System.out.println("Employee Details: " + name +
                           ", ID: " + employeeId);
    }
}