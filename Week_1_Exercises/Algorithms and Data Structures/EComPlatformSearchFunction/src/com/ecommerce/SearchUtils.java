package com.ecommerce;

public class SearchUtils {
    //Linear Search
    public static Product linearSearch(Product[] products, String searchTerm) {
        for (Product product : products) {
            if (product.getProductId().equals(searchTerm) || product.getProductName().equals(searchTerm)) {
                return product;
            }
        }
        return null; 
    }
}
