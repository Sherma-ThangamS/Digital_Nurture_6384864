import java.util.HashMap;

// InventoryManager uses a HashMap for fast access to products by productId.
// HashMap provides O(1) average time for add, update, delete, and retrieve operations.

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    public void updateProduct(int productId, String name, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.productName = name;
            p.quantity = quantity;
            p.price = price;
        }
    }

    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    public Product getProduct(int productId) {
        return inventory.get(productId);
    }

    public void displayAll() {
        for (Product p : inventory.values()) {
            System.out.println(p.productId + ": " + p.productName + ", Qty: " + p.quantity + ", Price: $" + p.price);
        }
    }
}
