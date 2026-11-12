package com.Project;

import java.util.ArrayList;
import java.util.Iterator;

public class CartService {

    private ArrayList<CartItem> cartItems;

    private ProductService productService;

    public CartService(
            ProductService productService) {

        this.productService =
                productService;

        cartItems =
                new ArrayList<>();
    }

    // ADD TO CART
    public void addToCart(
            int productId,
            int quantity)
            throws ProductNotFoundException,
                   InvalidInputException,
                   InsufficientStockException {

        if (quantity <= 0) {

            throw new InvalidInputException(
                    "Quantity must be greater than zero."
            );
        }

        Product product =
                productService.searchProduct(
                        productId
                );

        if (product.getQuantity()
                < quantity) {

            throw new InsufficientStockException(
                    "Insufficient stock. Available: "
                    + product.getQuantity()
            );
        }

        // Check if product already exists
        for (CartItem item : cartItems) {

            if (item.getProduct()
                    .getProductId()
                    == productId) {

                int newQuantity =
                        item.getQuantity()
                        + quantity;

                if (newQuantity
                        > product.getQuantity()) {

                    throw new InsufficientStockException(
                            "Requested quantity exceeds available stock."
                    );
                }

                item.setQuantity(
                        newQuantity
                );

                System.out.println(
                        "Cart quantity updated."
                );

                return;
            }
        }

        CartItem cartItem =
                new CartItem(
                        product,
                        quantity
                );

        cartItems.add(cartItem);

        System.out.println(
                "Product added to cart."
        );
    }

    // VIEW CART
    public void viewCart() {

        if (cartItems.isEmpty()) {

            System.out.println(
                    "Your cart is empty."
            );

            return;
        }

        double total = 0;

        System.out.println(
                "\n========== SHOPPING CART =========="
        );

        for (CartItem item :
                cartItems) {

            System.out.println(item);

            total +=
                    item.getTotalPrice();
        }

        System.out.println(
                "------------------------------------"
        );

        System.out.println(
                "Total Amount: ₹"
                + total
        );
    }

    // UPDATE CART
    public void updateCart(
            int productId,
            int quantity)
            throws ProductNotFoundException,
                   InvalidInputException,
                   InsufficientStockException {

        if (quantity <= 0) {

            throw new InvalidInputException(
                    "Quantity must be greater than zero."
            );
        }

        for (CartItem item :
                cartItems) {

            if (item.getProduct()
                    .getProductId()
                    == productId) {

                Product product =
                        item.getProduct();

                if (quantity
                        > product.getQuantity()) {

                    throw new InsufficientStockException(
                            "Insufficient stock."
                    );
                }

                item.setQuantity(quantity);

                System.out.println(
                        "Cart updated successfully."
                );

                return;
            }
        }

        throw new ProductNotFoundException(
                "Product is not present in cart."
        );
    }

    // REMOVE FROM CART
    public void removeFromCart(
            int productId)
            throws ProductNotFoundException {

        Iterator<CartItem> iterator =
                cartItems.iterator();

        while (iterator.hasNext()) {

            CartItem item =
                    iterator.next();

            if (item.getProduct()
                    .getProductId()
                    == productId) {

                iterator.remove();

                System.out.println(
                        "Product removed from cart."
                );

                return;
            }
        }

        throw new ProductNotFoundException(
                "Product is not present in cart."
        );
    }

    // CART TOTAL
    public double getCartTotal() {

        double total = 0;

        for (CartItem item :
                cartItems) {

            total +=
                    item.getTotalPrice();
        }

        return total;
    }

    public ArrayList<CartItem>
            getCartItems() {

        return cartItems;
    }

    public void clearCart() {

        cartItems.clear();
    }
}