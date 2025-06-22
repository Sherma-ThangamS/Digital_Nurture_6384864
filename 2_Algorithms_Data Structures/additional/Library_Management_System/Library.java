import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size >= books.length) {
            System.out.println("Library is full.");
            return;
        }
        books[size++] = book;
    }

    public void displayBooks() {
        if (size == 0) {
            System.out.println("No books available.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, size, Comparator.comparing(b -> b.title.toLowerCase()));

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = title.compareToIgnoreCase(books[mid].title);
            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }
}
