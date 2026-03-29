package practice.ch04;

import practice.ch04.framework.Product;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // (1)  IDCard를 직접 생성
        //IdCard c1 = new IdCard("이채원");
        //c1,use();

        // (2)  IDCardFactory를 이용하여 IDCard 생성
        IDCardFactory factory = new IDCardFactory();
        Product c2 = factory.create("이채원");
        c2.use();
    }
}
