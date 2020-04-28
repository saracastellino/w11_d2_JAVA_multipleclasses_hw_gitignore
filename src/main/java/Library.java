import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookStock;
    private int capacity;

    public Library(int capacity) {
        this.bookStock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getBookStockCount() {
       return this.bookStock.size();
    }

    public int getLibraryCapacity() {
        return this.capacity;
    }

    public void addBook(Book book) {
        if(this.bookStock.size() < capacity) {
            this.bookStock.add(book);
        }
    }

    public void removeBook(Book book) {
        this.bookStock.remove(book);
    }
}
