package hw.ch04;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private Map<Integer, String> database = new HashMap<>();
    private String baseDate;  // 필드는 있었는데 생성자가 없었음

    public IDCardFactory(String baseDate) {  // 생성자 추가
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {  // 시그니처 수정 (파라미터 1개)
        IDCard card = new IDCard(owner, serial++, baseDate);  // issuedDate 인자 추가
        database.put(card.getSerial(), card.getOwner());
        return card;
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getOwners() { return database; }
}