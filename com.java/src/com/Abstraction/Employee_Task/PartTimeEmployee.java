package com.Abstraction.Employee_Task;

class PartTimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, String employeeId,
                     double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        System.out.println("Calculating salary: Hours worked × rate = $"
                           + (hourlyRate * hoursWorked));
    }
}
