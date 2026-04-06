package practice.ch05;

// 싱글톤 패턴 적용하기
public class Singleton{

    //(3) Singleton 객체를 하나 만들어서 보관할 변수를 정의함

    private static Singleton singleton = new Singleton();
    
    // (1)생성자 private으로 함
    private Singleton(){
        System.out.println("Singleton 객체가 생성됩니다.");
    }

    // (2) Singleton 객체를 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance() {
        // 싱글톤 객체를 생성하고 반환
        return new Singleton();
    }
}
