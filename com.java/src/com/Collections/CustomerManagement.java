package com.Collections;
import java.util.ArrayList;

class Customer {

    private int customerId;
    private String customerName;
    private String city;
    private String phoneNumber;

    public Customer(int customerId, String customerName, String city, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class CustomerManagement {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(101, "Rahul", "Hyderabad", "9876543210"));
        customers.add(new Customer(102, "Priya", "Chennai", "9876543211"));
        customers.add(new Customer(103, "Kiran", "Bangalore", "9876543212"));
        customers.add(new Customer(104, "Anjali", "Delhi", "9876543213"));
        customers.add(new Customer(105, "Vijay", "Mumbai", "9876543214"));

        customers.add(2, new Customer(106, "Rakesh", "Pune", "9999999999"));

        customers.set(3, new Customer(107, "Sneha", "Kolkata", "8888888888"));

        customers.remove(1);

        System.out.println("Customer Details");

        for (int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);

            System.out.println(
                    c.getCustomerId() + " "
                            + c.getCustomerName() + " "
                            + c.getCity() + " "
                            + c.getPhoneNumber());
        }

        System.out.println("Total Customers: " + customers.size());

        customers.clear();

        System.out.println("Is Empty: " + customers.isEmpty());
    }
}