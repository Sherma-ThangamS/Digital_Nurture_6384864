/*

    O(n): Linear time – common in loops or linear searches.

    O(log n): Logarithmic time – used in binary search, trees.

    O(1): Constant time – like direct array access.

    Binary search is faster than linear search for large sorted arrays.

    Use binary search when:

    Products are sorted by name.

    Search is frequent (as in real-world e-commerce).

    You can afford to sort once and search many times.

 */



import java.util.Arrays;

public class ECommerceSearch {

    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shoes", "Fashion"),
                new Product(3, "Camera", "Electronics"),
                new Product(4, "Watch", "Accessories"),
                new Product(5, "Phone", "Electronics")
        };
        System.out.println("Linear Search:");
        Product found1 = linearSearch(products, "Camera");
        System.out.println(found1 != null ? found1 : "Product not found");

        System.out.println("Binary Search (after sorting):");
        Arrays.sort(products);
        Product found2 = binarySearch(products, "Camera");
        System.out.println(found2 != null ? found2 : "Product not found");
    }

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
