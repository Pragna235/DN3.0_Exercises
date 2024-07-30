package com.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    
    public void updateProduct(String productId, Product newProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, newProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
