package hw.ch01.A1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearDescIterator implements Iterator<Book> {
    private Book[] sortedBooks;
    private int index;

    public YearDescIterator(Book[] books, int maxIndex) {
        // 출판연도 내림차순 정렬 (최신 → 오래된 순)
        this.sortedBooks = Arrays.copyOfRange(books, 0, maxIndex);
        Arrays.sort(this.sortedBooks, Comparator.comparingInt(Book::getYear).reversed());
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) throw new NoSuchElementException();
        return sortedBooks[index++];
    }
}