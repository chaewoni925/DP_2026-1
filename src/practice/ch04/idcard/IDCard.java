package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        // 부모의 인자 없는 생성자를 호출함
        // super(); // 생략 가능
        
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() { //여기서 this = this.toString()
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    // Object 클래스의 toString() 메소드 오버라이드
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
