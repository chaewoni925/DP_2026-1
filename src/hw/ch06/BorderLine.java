package hw.ch06;

import hw.ch06.framework.Product;

public class BorderLine implements Product {
    private char borderChar;

    //1. 생성자: 경계 문자를 인자로 받음
    public BorderLine(char borderChar) {
        this.borderChar = borderChar;
    }

    @Override
    public void use(String s) {
        //위쪽 라인 출력(s.length()만큼)
        //본문 출력(텍스트 그대로)
        //아래쪽 라인 출력(s.length() 만큼)
        int len = s.length();
        for (int i = 0; i < len; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
        System.out.println(s);
        for (int i = 0; i < len; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}