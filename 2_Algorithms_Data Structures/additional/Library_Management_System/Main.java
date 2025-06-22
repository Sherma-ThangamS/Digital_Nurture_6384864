/*
    Linear Search:
        Iterate each element in the list one by one. To find the required element.
        Time Complexity: O(n)
        If the data size is less and it is not in order then linear search is applied.

    Binary Search:
        Works on sorted list, split the array into two parts and search for the element
        Time Complexity: O(log(n))
        If the data size is large and it is in order then binary search is applied.
 */


public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(new Book(1, "Java Programming", "User 1"));
        library.addBook(new Book(2, "Effective Java", "User 2"));
        library.addBook(new Book(3, "Clean Code", "User 3"));
        library.addBook(new Book(4, "Design Patterns", "User 4"));

        System.out.println("All Books:");
        library.displayBooks();

        System.out.println("Searching (Linear) for 'Clean Code':");
        Book foundLinear = library.linearSearchByTitle("Clean Code");
        System.out.println(foundLinear != null ? foundLinear : "Book not found.");

        System.out.println("Searching (Binary) for 'Effective Java':");
        Book foundBinary = library.binarySearchByTitle("Effective Java");
        System.out.println(foundBinary != null ? foundBinary : "Book not found.");
    }
}
