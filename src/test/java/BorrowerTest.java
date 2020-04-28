import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower1;
    Book book1;

    @Before
    public void before() {
        borrower1 = new Borrower();
        book1 = new Book("Dr Zhivago", "Boris Pasternak");
    }

    @Test
    public void getBorrowedBooksCount() {
        assertEquals(0, borrower1.getBorrowedBooksCount());
    }

    @Test
    public void addBookToBorrowed() {
        borrower1.addBook(book1);
        assertEquals(1, borrower1.getBorrowedBooksCount());
    }
}
