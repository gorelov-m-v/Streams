import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

class Book {
    private String title;
    private String isbn;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static Book releaseBook(Book book, String isbn) {
        if (Objects.isNull(book.isbn)) {
            book.setIsbn(isbn);
        }
        return book;
    }

    public String getTitleAndIsbnWithSeparator(String separator) {
        return title + separator + isbn;
    }

    public static void main(String[] args) {
        Book book = new Book("Brave New World");
        Book.releaseBook(book, "978-3-8438-4825-1");

        BiFunction<Book, String, Book> test1 = Book::releaseBook;

        Function<String, String> test2 = book::getTitleAndIsbnWithSeparator;

        Function<Book, String> test3 = Book::getIsbn;

        Function<String, Book> test4 = Book::new;
    }
}

