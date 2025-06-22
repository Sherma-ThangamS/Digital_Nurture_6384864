// Sorting Customer Orders by Total Price
// This program demonstrates sorting customer orders using Bubble Sort and Quick Sort.
// Purpose: Prioritize high-value orders in an e-commerce platform.

import java.util.Arrays;

public class SortCustomerOrders {

    // ----- BUBBLE SORT IMPLEMENTATION -----
    // Bubble Sort repeatedly steps through the list, compares adjacent elements and swaps them if needed.
    // Time Complexity: O(n^2) for worst and average cases
    // Best suited for very small datasets or educational purposes
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization: Stop if array is already sorted
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    // Swap
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // No swaps = sorted
        }
    }

    // ----- QUICK SORT IMPLEMENTATION -----
    // Quick Sort is a divide-and-conquer algorithm that picks a pivot and partitions the array.
    // Time Complexity: Best and Average O(n log n), Worst O(n^2)
    // Generally much faster than Bubble Sort due to efficient partitioning
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    // ----- MAIN METHOD -----
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 250.75),
                new Order(2, "Bob", 120.50),
                new Order(3, "Charlie", 320.40),
                new Order(4, "Diana", 80.00),
                new Order(5, "Evan", 499.99)
        };

        // Display original orders
        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        // ----- BUBBLE SORT -----
        System.out.println("\nSorted Orders by Bubble Sort:");
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        bubbleSort(bubbleSortedOrders);
        for (Order o : bubbleSortedOrders) System.out.println(o);

        // ----- QUICK SORT -----
        System.out.println("\nSorted Orders by Quick Sort:");
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        for (Order o : quickSortedOrders) System.out.println(o);

        // ----- PERFORMANCE ANALYSIS -----
        /*
        Analysis:
        - Bubble Sort: O(n^2)
            - Compares every pair of adjacent elements.
            - Inefficient for large data sets.
        - Quick Sort: O(n log n) average
            - More efficient due to divide-and-conquer.
            - Widely used in production systems.

        Why Quick Sort is Preferred:
        - Much faster on average due to fewer comparisons/swaps.
        - Suitable for large datasets.
        - Supported by in-place sorting (no extra memory required).
        */
    }
}
