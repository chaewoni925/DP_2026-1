package ch05.A3a;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown();
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // 슬로우 다운 때문에 A가 먼저 인스턴스를 생성하는 경우가 많지만,
            //  B나 C가 먼저 인스턴스를 생성하는 경우도 있다.
        } catch (InterruptedException e) {
        }
    }
}
