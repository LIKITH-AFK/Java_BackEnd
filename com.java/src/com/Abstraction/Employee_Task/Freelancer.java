package com.Abstraction.Employee_Task;

class Freelancer extends Employee {

    double projectPayment;

    Freelancer(String name, String employeeId,
               double projectPayment) {
        super(name, employeeId);
        this.projectPayment = projectPayment;
    }

    @Override
    void calculateSalary() {
        System.out.println("Calculating salary: Project payment = $"
                           + projectPayment);
    }
}
