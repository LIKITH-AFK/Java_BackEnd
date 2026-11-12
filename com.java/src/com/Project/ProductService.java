package com.Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class ProductService {

    private ArrayList<Product> products;

    private HashMap<Integer, Product> productMap;

    private final String FILE_NAME = "products.dat";

    public ProductService() {

        products = new ArrayList<>();
        productMap = new HashMap<>();

        loadProducts();
    }

    @SuppressWarnings("unchecked")
    private void loadProducts() {

        Object data =
                FileManager.readData(FILE_NAME);

        if (data != null) {

            products =
                    (ArrayList<Product>) data;

            rebuildMap();
        }
    }

    private void rebuildMap() {

        productMap.clear();

        for (Product product : products) {

            productMap.put(
                    product.getProductId(),
                    product
            );
        }
    }

    private void saveProducts() {

        FileManager.saveData(
                FILE_NAME,
                products
        );
    }

    // ADD PRODUCT
    public void addProduct(Product product)
            throws InvalidInputException {

        if (product.getProductId() <= 0) {

            throw new InvalidInputException(
                    "Product ID must be positive."
            );
        }

        if (product.getProductName() == null
                ||
            product.getProductName()
                    .trim()
                    .isEmpty()) {

            throw new InvalidInputException(
                    "Product name cannot be empty."
            );
        }

        if (product.getPrice() <= 0) {

            throw new InvalidInputException(
                    "Price must be greater than zero."
            );
        }

        if (product.getQuantity() < 0) {

            throw new InvalidInputException(
                    "Quantity cannot be negative."
            );
        }

        if (productMap.containsKey(
                product.getProductId())) {

            throw new InvalidInputException(
                    "Product ID already exists."
            );
        }

        products.add(product);

        productMap.put(
                product.getProductId(),
                product
        );

        saveProducts();

        System.out.println(
                "Product added successfully."
        );
    }

    // VIEW PRODUCTS
    public void viewProducts() {

        if (products.isEmpty()) {

            System.out.println(
                    "No products available."
            );

            return;
        }

        System.out.println(
                "\n========== PRODUCT LIST =========="
        );

        for (Product product : products) {

            System.out.println(product);
        }
    }

    // SEARCH PRODUCT
    public Product searchProduct(
            int productId)
            throws ProductNotFoundException {

        Product product =
                productMap.get(productId);

        if (product == null) {

            throw new ProductNotFoundException(
                    "Product with ID "
                    + productId
                    + " was not found."
            );
        }

        return product;
    }

    // UPDATE PRODUCT
    public void updateProduct(
            int productId,
            String name,
            double price,
            String category,
            int quantity)
            throws InvalidInputException,
                   ProductNotFoundException {

        Product product;

        try {

            product =
                    searchProduct(productId);

        } catch (ProductNotFoundException e) {

            throw e;
        }

        if (name == null
                ||
            name.trim().isEmpty()) {

            throw new InvalidInputException(
                    "Product name cannot be empty."
            );
        }

        if (price <= 0) {

            throw new InvalidInputException(
                    "Price must be greater than zero."
            );
        }

        if (quantity < 0) {

            throw new InvalidInputException(
                    "Quantity cannot be negative."
            );
        }

        product.setProductName(name);
        product.setPrice(price);
        product.setCategory(category);
        product.setQuantity(quantity);

        saveProducts();

        System.out.println(
                "Product updated successfully."
        );
    }

    // DELETE PRODUCT
    public void deleteProduct(
            int productId)
            throws ProductNotFoundException {

        Iterator<Product> iterator =
                products.iterator();

        while (iterator.hasNext()) {

            Product product =
                    iterator.next();

            if (product.getProductId()
                    == productId) {

                iterator.remove();

                productMap.remove(
                        productId
                );

                saveProducts();

                System.out.println(
                        "Product deleted successfully."
                );

                return;
            }
        }

        throw new ProductNotFoundException(
                "Product not found."
        );
    }

    // SORT BY PRICE
    public void sortByPrice() {

        Collections.sort(
                products,
                new Comparator<Product>() {

                    @Override
                    public int compare(
                            Product p1,
                            Product p2) {

                        return Double.compare(
                                p1.getPrice(),
                                p2.getPrice()
                        );
                    }
                }
        );

        saveProducts();

        System.out.println(
                "Products sorted by price."
        );
    }

    // SORT BY NAME
    public void sortByName() {

        Collections.sort(
                products,
                new Comparator<Product>() {

                    @Override
                    public int compare(
                            Product p1,
                            Product p2) {

                        return p1.getProductName()
                                .compareToIgnoreCase(
                                        p2.getProductName()
                                );
                    }
                }
        );

        saveProducts();

        System.out.println(
                "Products sorted by name."
        );
    }

    public ArrayList<Product>
            getProducts() {

        return products;
    }

    public HashMap<Integer, Product>
            getProductMap() {

        return productMap;
    }
}