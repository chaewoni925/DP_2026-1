package hw.ch01.A1;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        if (last >= books.length) {
            
            Book[] newBooks = new Book[books.length * 2];
            System.arraycopy(books,0, newBooks, 0, books.length);
            books = newBooks;
        }
        books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
    public Iterator<Book> iteratorByGenre(String genre) {
        return new GenreIterator(books, last, genre);
    }

    public Iterator<Book> iteratorByYear() {
        return new YearDescIterator(books, last);
    }
}
