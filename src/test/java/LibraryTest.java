import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library centralLibrary;
    Book book1;
    Borrower borrower1;

    @Before
    public void before(){
        centralLibrary = new Library(1000);
        book1 = new Book("Dr Zhivago", "Boris Pasternak");
        borrower1 = new Borrower();
    }

    @Test
    public void getBookStockCount() {
        assertEquals(0, centralLibrary.getBookStockCount());
    }

    @Test
    public void getLibraryCapacity() {
        assertEquals(1000, centralLibrary.getLibraryCapacity());
    }

    @Test
    public void canAddBook() {
        centralLibrary.addBook(book1);
        assertEquals(1, centralLibrary.getBookStockCount());
    }

    @Test
    public void canLendBook() {
        centralLibrary.addBook(book1);
        centralLibrary.removeBook(book1);
        borrower1.addBook(book1);
        assertEquals(0, centralLibrary.getBookStockCount());
        assertEquals(1, borrower1.getBorrowedBooksCount());
    }

}
