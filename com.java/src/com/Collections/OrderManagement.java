package com.Collections;

import java.util.ArrayList;

class Order {

    private int orderId;
    private String productName;
    private int quantity;
    private double price;

    public Order(int orderId, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class OrderManagement {
    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(101, "Laptop", 1, 55000));
        orders.add(new Order(102, "Mouse", 2, 1000));
        orders.add(new Order(103, "Keyboard", 1, 2000));
        orders.add(new Order(104, "Monitor", 1, 15000));
        orders.add(new Order(105, "Printer", 1, 12000));
        orders.add(new Order(106, "Speaker", 2, 3000));

        orders.add(4, new Order(107, "Webcam", 1, 2500));

        orders.set(2, new Order(108, "SSD", 1, 5000));

        orders.remove(orders.size() - 1);

        Order o = orders.get(3);

        System.out.println("Order at index 3");
        System.out.println(o.getOrderId() + " "
                + o.getProductName() + " "
                + o.getQuantity() + " "
                + o.getPrice());

        System.out.println("\nAll Orders");

        for (Order order : orders) {
            System.out.println(order.getOrderId() + " "
                    + order.getProductName() + " "
                    + order.getQuantity() + " "
                    + order.getPrice());
        }

        System.out.println("Total Orders: " + orders.size());

        orders.clear();

        System.out.println("Is Empty: " + orders.isEmpty());
    }
}