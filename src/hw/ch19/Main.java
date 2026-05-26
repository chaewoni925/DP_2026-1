package hw.ch19;

public class Main {
    public static void main(String[] args) {
        System.out.println("20240841 이채원");
        // GUI 생성
        SafeFrame frame = new SafeFrame("금고 경비 시스템");

        // 시계 역할 구현
        // 1초마다 현재 시간을 얻어서 safeFrame의 setClock()에 전달한다.
        // Thread.sleep(1000):
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1000); // 1초 기다림
                    
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
