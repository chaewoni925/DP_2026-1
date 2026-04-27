package ch01.A1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf; // 밖에서 가져온 bookshelf를 this(자기 자신)의 bookshelf로 저장해둬
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } // else가 없어도 되는 이유는, hasNext()가 false일 때 예외가 발생하기 때문. 즉, 아래 코드는 hasNext()가 true일 때만 실행됨. (false면 메소드 아예 다 종료)
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
