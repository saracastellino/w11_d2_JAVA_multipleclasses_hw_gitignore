import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;

    @Before
    public void before() {
        book1 = new Book("Dr Zhivago", "Boris Pasternak");
    }

    @Test
    public void getName() {
        assertEquals("Dr Zhivago", book1.getName());
    }

    @Test
    public void getAuthor() {
        assertEquals("Boris Pasternak", book1.getAuthor());
    }
}
