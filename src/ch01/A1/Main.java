package ch01.A1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4); // 책 4권이 들어갈만한 공간 준비해둬
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator(); 
        // <> 는 제네릭으로, 여기서는 Book만 순서대로 꺼내주는 도구!(타입 명시)
        // 책꽂이에서 책을 한 권씩 꺼내 줄 전담 도우미를 고용하는 것
        while (it.hasNext()) {
            Book book = it.next(); // it은 반복자(iterator), 웨이터 같은 존재
            // Book book은 타입(클래스명) 변수명
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법
        for (Book book: bookShelf) {
            // bookshelf 안에(:) 있는 데이터들을 하나씩 book이라는 이름의 Book 타입 변수에 담아서 반복해!
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
