import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int getBorrowedBooksCount() {
        return borrowedBooks.size();
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }
}


