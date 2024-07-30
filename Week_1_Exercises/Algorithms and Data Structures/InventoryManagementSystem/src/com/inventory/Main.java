package com.inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Create products
        Product p1 = new Product("101", "Laptop", 10, 799.99);
        Product p2 = new Product("102", "Mouse", 50, 25.99);
        
        // Add products
        manager.addProduct(p1);
        manager.addProduct(p2);

        // Display products
        System.out.println("Inventory:");
        manager.displayProducts();

        // Update product
        Product p1Updated = new Product("101", "Laptop", 8, 749.99);
        manager.updateProduct("101", p1Updated);

        // Display products after update
        System.out.println("\nInventory after update:");
        manager.displayProducts();

        // Delete a product
        manager.deleteProduct("102");

        // Display products after deletion
        System.out.println("\nInventory after deletion:");
        manager.displayProducts();
    }
}
