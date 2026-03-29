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
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getOwners() {
        return database;
    }
}
