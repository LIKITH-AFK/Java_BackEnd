package com.Project;

import java.util.ArrayList;

public class OrderService {

    private ArrayList<Order> orders;

    private final String FILE_NAME =
            "orders.dat";

    private int nextOrderId;

    public OrderService() {

        orders =
                new ArrayList<>();

        loadOrders();

        nextOrderId =
                calculateNextOrderId();
    }

    @SuppressWarnings("unchecked")
    private void loadOrders() {

        Object data =
                FileManager.readData(
                        FILE_NAME
                );

        if (data != null) {

            orders =
                    (ArrayList<Order>) data;
        }
    }

    private int calculateNextOrderId() {

        if (orders.isEmpty()) {

            return 1;
        }

        int highestId = 0;

        for (Order order :
                orders) {

            if (order.getOrderId()
                    > highestId) {

                highestId =
                        order.getOrderId();
            }
        }

        return highestId + 1;
    }

    private void saveOrders() {

        FileManager.saveData(
                FILE_NAME,
                orders
        );
    }

    public Order placeOrder(
            User user,
            CartService cartService,
            ProductService productService)
            throws InsufficientStockException {

        if (cartService.getCartItems()
                .isEmpty()) {

            System.out.println(
                    "Your cart is empty."
            );

            return null;
        }

        // Check stock before processing
        for (CartItem item :
                cartService.getCartItems()) {

            Product product =
                    item.getProduct();

            if (item.getQuantity()
                    > product.getQuantity()) {

                throw new InsufficientStockException(
                        "Insufficient stock for "
                        + product.getProductName()
                );
            }
        }

        double total =
                cartService.getCartTotal();

        ArrayList<CartItem> orderItems =
                new ArrayList<>(
                        cartService.getCartItems()
                );

        // Reduce stock
        for (CartItem item :
                orderItems) {

            Product product =
                    item.getProduct();

            int newStock =
                    product.getQuantity()
                    - item.getQuantity();

            product.setQuantity(
                    newStock
            );
        }

        Order order =
                new Order(
                        nextOrderId,
                        user.getUserId(),
                        orderItems,
                        total
                );

        nextOrderId++;

        orders.add(order);

        saveOrders();

        FileManager.saveData(
                "products.dat",
                productService.getProducts()
        );

        cartService.clearCart();

        System.out.println(
                "\n================================"
        );

        System.out.println(
                "     ORDER PLACED SUCCESSFULLY"
        );

        System.out.println(
                "================================"
        );

        System.out.println(
                "Order ID: "
                + order.getOrderId()
        );

        System.out.println(
                "Total Amount: ₹"
                + order.getTotalAmount()
        );

        return order;
    }

    public void viewAllOrders() {

        if (orders.isEmpty()) {

            System.out.println(
                    "No orders available."
            );

            return;
        }

        System.out.println(
                "\n========== ALL ORDERS =========="
        );

        for (Order order :
                orders) {

            System.out.println(order);
        }
    }

    public void viewUserOrders(
            int userId) {

        boolean found = false;

        System.out.println(
                "\n========== MY ORDERS =========="
        );

        for (Order order :
                orders) {

            if (order.getUserId()
                    == userId) {

                System.out.println(order);

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No orders found."
            );
        }
    }

    public ArrayList<Order>
            getOrders() {

        return orders;
    }
}