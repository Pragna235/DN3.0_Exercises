package com.ecommerce;

import java.util.Arrays;

public class BinarySearchUtils {
    // Binary Search
    public static Product binarySearch(Product[] products, String searchTerm) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            if (midProduct.getProductId().equals(searchTerm) || midProduct.getProductName().equals(searchTerm)) {
                return midProduct;
            }

            if (searchTerm.compareTo(midProduct.getProductId()) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // Product not found
    }

    
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
    }
}
