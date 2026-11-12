package com.Project;

import java.util.Scanner;

public class Main {

    private static Scanner scanner =
            new Scanner(System.in);

    private static InputHelper input =
            new InputHelper(scanner);

    private static UserService userService =
            new UserService();

    private static ProductService productService =
            new ProductService();

    private static CartService cartService =
            new CartService(productService);

    private static OrderService orderService =
            new OrderService();

    private static PaymentService paymentService =
            new PaymentService(input);

    private static ReportService reportService =
            new ReportService();

    public static void main(String[] args) {

        while (true) {

            showMainMenu();

            int choice =
                    input.readInt(
                            "Enter your choice: "
                    );

            switch (choice) {

                case 1:

                    registerUser();

                    break;

                case 2:

                    userLogin();

                    break;

                case 3:

                    adminLogin();

                    break;

                case 4:

                    System.out.println(
                            "\nThank you for using "
                            + "E-Commerce Shopping Cart System."
                    );

                    scanner.close();

                    return;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }
        }
    }

    private static void showMainMenu() {

        System.out.println(
                "\n========================================"
        );

        System.out.println(
                "      E-COMMERCE SHOPPING CART SYSTEM"
        );

        System.out.println(
                "========================================"
        );

        System.out.println(
                "1. User Registration"
        );

        System.out.println(
                "2. User Login"
        );

        System.out.println(
                "3. Admin Login"
        );

        System.out.println(
                "4. Exit"
        );
    }

    // ==============================
    // USER REGISTRATION
    // ==============================

    private static void registerUser() {

        System.out.println(
                "\n========== USER REGISTRATION =========="
        );

        int id =
                input.readInt(
                        "Enter User ID: "
                );

        String username =
                input.readString(
                        "Enter Username: "
                );

        String password =
                input.readString(
                        "Enter Password: "
                );

        String contact =
                input.readString(
                        "Enter Contact Number: "
                );

        User user =
                new User(
                        id,
                        username,
                        password,
                        contact
                );

        userService.registerUser(user);
    }

    // ==============================
    // USER LOGIN
    // ==============================

    private static void userLogin() {

        System.out.println(
                "\n========== USER LOGIN =========="
        );

        String username =
                input.readString(
                        "Enter Username: "
                );

        String password =
                input.readString(
                        "Enter Password: "
                );

        User user =
                userService.login(
                        username,
                        password
                );

        if (user != null) {

            userMenu(user);
        }
    }

    // ==============================
    // USER MENU
    // ==============================

    private static void userMenu(
            User user) {

        while (true) {

            System.out.println(
                    "\n================================"
            );

            System.out.println(
                    "           USER MENU"
            );

            System.out.println(
                    "================================"
            );

            System.out.println(
                    "Welcome, "
                    + user.getUsername()
            );

            System.out.println(
                    "1. View Products"
            );

            System.out.println(
                    "2. Search Product"
            );

            System.out.println(
                    "3. Sort Products by Price"
            );

            System.out.println(
                    "4. Sort Products by Name"
            );

            System.out.println(
                    "5. Add Product to Cart"
            );

            System.out.println(
                    "6. View Cart"
            );

            System.out.println(
                    "7. Update Cart"
            );

            System.out.println(
                    "8. Remove Product from Cart"
            );

            System.out.println(
                    "9. Checkout"
            );

            System.out.println(
                    "10. View Order History"
            );

            System.out.println(
                    "11. Logout"
            );

            int choice =
                    input.readInt(
                            "Enter your choice: "
                    );

            switch (choice) {

                case 1:

                    productService.viewProducts();

                    break;

                case 2:

                    searchProduct();

                    break;

                case 3:

                    productService.sortByPrice();

                    productService.viewProducts();

                    break;

                case 4:

                    productService.sortByName();

                    productService.viewProducts();

                    break;

                case 5:

                    addToCart();

                    break;

                case 6:

                    cartService.viewCart();

                    break;

                case 7:

                    updateCart();

                    break;

                case 8:

                    removeFromCart();

                    break;

                case 9:

                    checkout(user);

                    break;

                case 10:

                    orderService.viewUserOrders(
                            user.getUserId()
                    );

                    break;

                case 11:

                    System.out.println(
                            "Logged out successfully."
                    );

                    return;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }
        }
    }
    // ==============================
    // SEARCH PRODUCT
    // ==============================

    private static void searchProduct() {

        int id =
                input.readInt(
                        "Enter Product ID: "
                );

        try {

            Product product =
                    productService.searchProduct(id);

            System.out.println(
                    "\nProduct Found:"
            );

            System.out.println(product);

        } catch (ProductNotFoundException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage()
            );
        }
    }

    // ==============================
    // ADD TO CART
    // ==============================

    private static void addToCart() {

        int productId =
                input.readInt(
                        "Enter Product ID: "
                );

        int quantity =
                input.readInt(
                        "Enter Quantity: "
                );

        try {

            cartService.addToCart(
                    productId,
                    quantity
            );

        } catch (
                ProductNotFoundException |
                InvalidInputException |
                InsufficientStockException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage()
            );
        }
    }

    // ==============================
    // UPDATE CART
    // ==============================

    private static void updateCart() {

        int productId =
                input.readInt(
                        "Enter Product ID: "
                );

        int quantity =
                input.readInt(
                        "Enter New Quantity: "
                );

        try {

            cartService.updateCart(
                    productId,
                    quantity
            );

        } catch (
                ProductNotFoundException |
                InvalidInputException |
                InsufficientStockException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage()
            );
        }
    }

    // ==============================
    // REMOVE FROM CART
    // ==============================

    private static void removeFromCart() {

        int productId =
                input.readInt(
                        "Enter Product ID: "
                );

        try {

            cartService.removeFromCart(
                    productId
            );

        } catch (ProductNotFoundException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage()
            );
        }
    }

    // ==============================
    // CHECKOUT
    // ==============================

    private static void checkout(
            User user) {

        if (cartService.getCartItems()
                .isEmpty()) {

            System.out.println(
                    "Your cart is empty."
            );

            return;
        }

        cartService.viewCart();

        String confirmation =
                input.readString(
                        "Proceed to checkout? (yes/no): "
                );

        if (!confirmation
                .equalsIgnoreCase("yes")) {

            System.out.println(
                    "Checkout cancelled."
            );

            return;
        }

        double amount =
                cartService.getCartTotal();

        boolean paymentSuccess =
                paymentService.processPayment(
                        amount
                );

        if (!paymentSuccess) {

            return;
        }

        try {

            orderService.placeOrder(
                    user,
                    cartService,
                    productService
            );

        } catch (
                InsufficientStockException e) {

            System.out.println(
                    "Order failed: "
                    + e.getMessage()
            );
        }
    }
    // ==============================
    // ADMIN LOGIN
    // ==============================

    private static void adminLogin() {

        System.out.println(
                "\n========== ADMIN LOGIN =========="
        );

        String username =
                input.readString(
                        "Enter Admin Username: "
                );

        String password =
                input.readString(
                        "Enter Admin Password: "
                );

        if (username.equals("admin")
                &&
            password.equals("admin123")) {

            System.out.println(
                    "Admin login successful."
            );

            adminMenu();

        } else {

            System.out.println(
                    "Invalid admin credentials."
            );
        }
    }

    // ==============================
    // ADMIN MENU
    // ==============================

    private static void adminMenu() {

        while (true) {

            System.out.println(
                    "\n================================"
            );

            System.out.println(
                    "          ADMIN MENU"
            );

            System.out.println(
                    "================================"
            );

            System.out.println(
                    "1. Add Product"
            );

            System.out.println(
                    "2. View Products"
            );

            System.out.println(
                    "3. Search Product"
            );

            System.out.println(
                    "4. Update Product"
            );

            System.out.println(
                    "5. Delete Product"
            );

            System.out.println(
                    "6. Sort Products by Price"
            );

            System.out.println(
                    "7. Sort Products by Name"
            );

            System.out.println(
                    "8. View Users"
            );

            System.out.println(
                    "9. View Orders"
            );

            System.out.println(
                    "10. Generate Report"
            );

            System.out.println(
                    "11. Logout"
            );

            int choice =
                    input.readInt(
                            "Enter your choice: "
                    );

            switch (choice) {

                case 1:

                    addProduct();

                    break;

                case 2:

                    productService.viewProducts();

                    break;

                case 3:

                    searchProduct();

                    break;

                case 4:

                    updateProduct();

                    break;

                case 5:

                    deleteProduct();

                    break;

                case 6:

                    productService.sortByPrice();

                    productService.viewProducts();

                    break;

                case 7:

                    productService.sortByName();

                    productService.viewProducts();

                    break;

                case 8:

                    userService.viewUsers();

                    break;

                case 9:

                    orderService.viewAllOrders();

                    break;

                case 10:

                    reportService.generateReport(
                            userService.getUsers(),
                            productService.getProducts(),
                            orderService.getOrders()
                    );

                    break;

                case 11:

                    System.out.println(
                            "Admin logged out."
                    );

                    return;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }
        }
    }

    // ==============================
    // ADD PRODUCT
    // ==============================

    private static void addProduct() {

        System.out.println(
                "\n========== ADD PRODUCT =========="
        );

        int id =
                input.readInt(
                        "Enter Product ID: "
                );

        String name =
                input.readString(
                        "Enter Product Name: "
                );

        double price =
                input.readDouble(
                        "Enter Price: "
                );

        String category =
                input.readString(
                        "Enter Category: "
                );

        int quantity =
                input.readInt(
                        "Enter Quantity: "
                );

        Product product =
                new Product(
                        id,
                        name,
                        price,
                        category,
                        quantity
                );

        try {

            productService.addProduct(
                    product
            );

        } catch (InvalidInputException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage()
            );
        }
    }

    // ==============================
    // UPDATE PRODUCT
    // ==============================

    private static void updateProduct() {

        int id =
                input.readInt(
                        "Enter Product ID: "
                );

        String name =
                input.readString(
                        "Enter New Product Name: "
                );

        double price =
                input.readDouble(
                        "Enter New Price: "
                );

        String category =
                input.readString(
                        "Enter New Category: "
                );

        int quantity =
                input.readInt(
                        "Enter New Quantity: "
                );

        try {

            productService.updateProduct(
                    id,
                    name,
                    price,
                    category,
                    quantity
            );

        } catch (
                InvalidInputException |
                ProductNotFoundException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage()
            );
        }
    }

    // ==============================
    // DELETE PRODUCT
    // ==============================

    private static void deleteProduct() {

        int id =
                input.readInt(
                        "Enter Product ID: "
                );

        try {

            productService.deleteProduct(id);

        } catch (ProductNotFoundException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage()
            );
        }
    }
}
