package ch06.A1a.framework;
//추상클래스로 바뀜
public abstract class Product implements Cloneable {  // template method 사용
    public abstract void use(String s); // 자식이 채워야할 세부 내용

    public Product createCopy() { // 공통로직 원래는 이게 messagebox, underlinepen에 오버라이딩해 있었는데 이걸 product로 옮겨서 공통로직으로 만들어버림
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
