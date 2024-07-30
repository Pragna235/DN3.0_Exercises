package com.management;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add tasks
        manager.addTask(new Task(1, "Finish report", "Pending"));
        manager.addTask(new Task(2, "Submit assignment", "Completed"));
        manager.addTask(new Task(3, "Prepare presentation", "In Progress"));

        // Display all tasks
        System.out.println("All Tasks:");
        manager.displayAllTasks();

        // Search for a task
        System.out.println("\nSearching for task with ID 2:");
        Task task = manager.searchTaskById(2);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDeleting task with ID 1.");
        manager.deleteTaskById(1);

        // Display all tasks after deletion
        System.out.println("\nAll Tasks after deletion:");
        manager.displayAllTasks();
    }
}
