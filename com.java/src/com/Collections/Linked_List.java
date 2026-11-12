package com.Collections;

import java.util.LinkedList;

public class Linked_List {

    static class Customer {
        private int customerId;
        private String customerName;
        private String city;

        public Customer(int customerId, String customerName, String city) {
            this.customerId = customerId;
            this.customerName = customerName;
            this.city = city;
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

        @Override
        public String toString() {
            return "Customer ID : " + customerId +
                    ", Name : " + customerName +
                    ", City : " + city;
        }
    }

    static class Order {
        private int orderId;
        private String customerName;
        private double amount;

        public Order(int orderId, String customerName, double amount) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.amount = amount;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Order ID : " + orderId +
                    ", Customer : " + customerName +
                    ", Amount : " + amount;
        }
    }

    public static void main(String[] args) {

        // Assignment 1 : Train Coach Management
        System.out.println("========== Assignment 1 ==========");

        LinkedList<String> train = new LinkedList<>();

        train.add("S1");
        train.add("S2");
        train.add("S3");

        train.addFirst("Engine");
        train.addLast("Guard");

        System.out.println("First Coach : " + train.getFirst());
        System.out.println("Last Coach : " + train.getLast());

        train.removeFirst();
        train.removeLast();

        System.out.println("Final Coach List : " + train);

        // Assignment 2 : Browser History
        System.out.println("\n========== Assignment 2 ==========");

        LinkedList<String> history = new LinkedList<>();

        history.add("google.com");
        history.add("youtube.com");
        history.add("github.com");
        history.add("linkedin.com");
        history.add("chatgpt.com");

        history.addFirst("wikipedia.org");
        history.addLast("amazon.com");

        System.out.println("First Website : " + history.getFirst());
        System.out.println("Last Website : " + history.getLast());

        history.removeLast();

        System.out.println("Updated History : " + history);

        // Assignment 3 : Movie Playlist
        System.out.println("\n========== Assignment 3 ==========");

        LinkedList<String> movies = new LinkedList<>();

        movies.add("Bahubali");
        movies.add("RRR");
        movies.add("Pushpa");
        movies.add("Salaar");
        movies.add("KGF");
        movies.add("Kalki");

        movies.add(2, "Leo");
        movies.set(4, "Animal");
        movies.remove(1);

        System.out.println("Movie List :");

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }

        System.out.println("Total Movies : " + movies.size());

        // Assignment 4 : Queue of Customers
        System.out.println("\n========== Assignment 4 ==========");

        LinkedList<String> customers = new LinkedList<>();

        customers.add("Ravi");
        customers.add("Suresh");
        customers.add("Mahesh");
        customers.add("Priya");
        customers.add("Anjali");
        customers.add("Kiran");

        customers.addFirst("VIP Customer");
        customers.addLast("New Customer");

        customers.removeFirst();

        System.out.println("Next Customer : " + customers.getFirst());

        System.out.println("Remaining Customers :");

        for (String c : customers) {
            System.out.println(c);
        }

        // Assignment 5 : Integer Operations
        System.out.println("\n========== Assignment 5 ==========");

        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.addFirst(100);
        numbers.addLast(500);

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("First Element : " + numbers.getFirst());
        System.out.println("Last Element : " + numbers.getLast());
        System.out.println("Size : " + numbers.size());

        // Assignment 6 : Customer Management
        System.out.println("\n========== Assignment 6 ==========");

        LinkedList<Customer> customerList = new LinkedList<>();

        customerList.add(new Customer(101, "Ravi", "Hyderabad"));
        customerList.add(new Customer(102, "Anjali", "Chennai"));
        customerList.add(new Customer(103, "Kiran", "Delhi"));
        customerList.add(new Customer(104, "Priya", "Mumbai"));
        customerList.add(new Customer(105, "Suresh", "Pune"));

        customerList.addFirst(new Customer(100, "VIP Customer", "Bangalore"));
        customerList.addLast(new Customer(106, "New Customer", "Vizag"));

        System.out.println("First Customer");
        System.out.println(customerList.getFirst());

        System.out.println("Last Customer");
        System.out.println(customerList.getLast());

        customerList.removeFirst();
        customerList.removeLast();

        System.out.println("Remaining Customers");

        for (Customer c : customerList) {
            System.out.println(c);
        }

        // Assignment 7 : Online Food Delivery
        System.out.println("\n========== Assignment 7 ==========");

        LinkedList<Order> orders = new LinkedList<>();

        orders.add(new Order(1, "Ravi", 350));
        orders.add(new Order(2, "Priya", 420));
        orders.add(new Order(3, "Kiran", 550));
        orders.add(new Order(4, "Suresh", 290));
        orders.add(new Order(5, "Anjali", 760));

        orders.addFirst(new Order(100, "Urgent Customer", 999));
        orders.addLast(new Order(101, "Normal Customer", 180));

        orders.set(3, new Order(200, "Replacement Customer", 450));

        orders.removeFirst();
        orders.removeLast();

        System.out.println("Orders");

        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }

        System.out.println("Total Orders : " + orders.size());
    }
}