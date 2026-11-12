package com.Project;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private int orderId;
    private int userId;

    private ArrayList<CartItem> items;

    private double totalAmount;

    private LocalDateTime orderDate;

    public Order(
            int orderId,
            int userId,
            ArrayList<CartItem> items,
            double totalAmount) {

        this.orderId = orderId;
        this.userId = userId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.orderDate =
                LocalDateTime.now();
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {

        return "Order ID: " + orderId
                + " | User ID: " + userId
                + " | Total: ₹" + totalAmount
                + " | Date: " + orderDate;
    }
}