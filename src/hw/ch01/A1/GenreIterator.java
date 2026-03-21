package hw.ch01.A1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreIterator implements Iterator<Book> {
    private Book[] books;
    private int maxIndex;
    private String targetGenre;
    private int index;

    public GenreIterator(Book[] books, int maxIndex, String targetGenre) {
        this.books = books;
        this.maxIndex = maxIndex;
        this.targetGenre = targetGenre;
        this.index = 0;
        advanceToNext(); // 첫 번째 유효한 위치로 이동
    }

    private void advanceToNext() {
        while (index < maxIndex &&
               (books[index].getGenre() == null ||
                !books[index].getGenre().equals(targetGenre))) {
            index++;
        }
    }

    @Override
    public boolean hasNext() {
        return index < maxIndex;
    }

    @Override
    public Book next() {
        if (!hasNext()) throw new NoSuchElementException();
        Book book = books[index];
        index++;
        advanceToNext(); // 다음 유효한 위치로 이동
        return book;
    }
}