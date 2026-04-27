package ch04.A2.idcard;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import java.util.HashMap;
import java.util.Map;


public class IDCardFactory extends Factory {
    private int serial = 100; // 정수 기본 데이터 타입
    private Map<Integer, String> database = new HashMap<>(); // 정수 객체

    protected synchronized Product createProduct(String owner) {
        IDCard card = new IDCard(owner, serial++);
        database.put(card.getSerial(), card.getOwner());
        return card;
    }

    @Override
    protected void registerProduct(Product product) {
        // product는 Product 타입이지만, createProduct에서 IDCard 타입으로 만들어졌기 때문에, IDCard로 형변환이 가능하다.
        //product를 부르니 toString()이 호출되고, IDCard의 toString()이 호출된다.
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getOwners() {
        return database;
    }
}
