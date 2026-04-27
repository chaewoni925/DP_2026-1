package ch05.A3b;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    //synchronized 키워드는 여러 스레드가 동시에 이 메소드에 들어오지 못하게 막는 '잠금(Lock) 장치' 역할을 합니다. (동기화==질서유지)
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
