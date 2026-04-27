package ch05.Sample;

public class Singleton {
    private static Singleton singleton = new Singleton(); // 인스턴스
    // 변수 선언 = (대입(저장)) 인스턴스 생성

    private Singleton() { //생성자 (객체를 만들 때 쓰는 조립법)
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() { // 일반 메소드(객체 배달)
        return singleton;
    }
}

//변수 선언으로 이름을 붙이고, 생성자로 객체를 딱 한 번 탄생시켜서
//인스턴스로 저장해둔 뒤, getInstance로 그 객체를 안전하게 빌려와서 사용한다
// 인스턴스는 객체가 메모리에 저장된 상태