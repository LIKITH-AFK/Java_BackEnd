package com.Abstraction.Employee_Task;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 =
                new FullTimeEmployee(
                        "John Doe",
                        "12345",
                        50000,
                        10000);

        Employee e2 =
                new PartTimeEmployee(
                        "Jane Smith",
                        "67890",
                        20,
                        15);

        Employee e3 =
                new Freelancer(
                        "Alice Johnson",
                        "54321",
                        5000);

        e1.calculateSalary();
        e1.applyLeave();
        e1.getDetails();

        System.out.println();

        e2.calculateSalary();
        e2.applyLeave();
        e2.getDetails();

        System.out.println();

        e3.calculateSalary();
        e3.applyLeave();
        e3.getDetails();
    }
}
