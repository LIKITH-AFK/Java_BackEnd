package com.Abstraction.Employee_Task;

class FullTimeEmployee extends Employee {

    double basePay;
    double benefits;

    FullTimeEmployee(String name, String employeeId,
                     double basePay, double benefits) {
        super(name, employeeId);
        this.basePay = basePay;
        this.benefits = benefits;
    }

    @Override
    void calculateSalary() {
        System.out.println("Calculating salary: Base pay + benefits = $"
                           + (basePay + benefits));
    }
}