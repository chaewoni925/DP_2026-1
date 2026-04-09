package practice.ch06.framework;



// shift alt 화살표 아래 복제기능
public interface Product extends Cloneable {
    public abstract void use(String s); // 심부름(전달하라는거전달만)만 하니까 void 사용
    public abstract Product createCopy(); // 복제 메서드
}
