package com.ecommerce;

public class Main {
    public static void main(String[] args) {
        // Create orders
        Order[] orders = {
            new Order("001", "Alice", 250.50),
            new Order("002", "Bob", 150.75),
            new Order("003", "Charlie", 300.00),
            new Order("004", "David", 120.25)
        };

        // Test Bubble Sort
        System.out.println("Bubble Sort:");
        BubbleSortUtils.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Create orders again for Quick Sort
        Order[] ordersForQuickSort = {
            new Order("001", "Alice", 250.50),
            new Order("002", "Bob", 150.75),
            new Order("003", "Charlie", 300.00),
            new Order("004", "David", 120.25)
        };

        // Test Quick Sort
        System.out.println("\nQuick Sort:");
        QuickSortUtils.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}
