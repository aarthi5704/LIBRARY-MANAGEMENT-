import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = FileHandler.loadBooks();
        if (books == null) {
            books = new ArrayList<>();
        }
    }

    public void addBook(Book book) {
        // prevent duplicate ISBNs
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("A book with this ISBN already exists.");
                return;
            }
        }
        books.add(book);
        FileHandler.saveBooks(books);
        System.out.println("Book added successfully.");
    }

    public void issueBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isIssued()) {
                book.setIssued(true);
                FileHandler.saveBooks(books);
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not found or already issued.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isIssued()) {
                book.setIssued(false);
                FileHandler.saveBooks(books);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
