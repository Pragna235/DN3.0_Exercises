package com.ecommerce;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product[] products = {
            new Product("003", "Smartphone", "Electronics"),
            new Product("001", "Laptop", "Electronics"),
            new Product("002", "Headphones", "Accessories")
        };

        // Test Linear Search
        System.out.println("Linear Search:");
        Product result = SearchUtils.linearSearch(products, "002");
        System.out.println(result);

        // Sort products for binary search
        BinarySearchUtils.sortProducts(products);

        // Test Binary Search
        System.out.println("\nBinary Search:");
        Product resultBinary = BinarySearchUtils.binarySearch(products, "003");
        System.out.println(resultBinary);
    }
}
