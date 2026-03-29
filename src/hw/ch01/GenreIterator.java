package hw.ch01;

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

    //override는 부모 클래스의 메서드를 자식 클래스에서 재정의할 때 사용하는 어노테이션이다. 
    //(이름만 같고 알맹이는 다름, 매개변수랑 반환타입도 같아야 한다.) 
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