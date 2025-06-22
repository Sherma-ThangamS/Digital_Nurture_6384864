// Inventory Management System
// This project demonstrates how to efficiently manage warehouse inventory using proper data structures.
// It focuses on fast data access, modification, and scalability for large-scale product lists.

public class Main {
    public static void main(String[] args) {

        InventoryManager inventory = new InventoryManager();

        inventory.addProduct(new Product(101, "Laptop", 50, 1200.0));
        inventory.addProduct(new Product(102, "Mouse", 150, 25.0));
        inventory.addProduct(new Product(103, "Keyboard", 100, 45.5));


        inventory.displayAll();

        // Fast update by productId using HashMap (O(1) average time)
        inventory.updateProduct(102, "Wireless Mouse", 140, 30.0);

        // HashMap provides constant time removal by key (O(1) average)
        inventory.deleteProduct(103);

        Product retrieved = inventory.getProduct(101);
        if (retrieved != null) {
            System.out.println(retrieved.productId + ": " + retrieved.productName + ", Qty: " + retrieved.quantity + ", Price: $" + retrieved.price);
        }


        inventory.displayAll();

    }
}
