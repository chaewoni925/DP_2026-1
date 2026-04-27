package ch05.A1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber()); 
            // 싱글턴 패턴을 쓰면 외부에서 new TicketMaker()를 못 하기 때문에, 반드시 getInstance()를 통해서만 기계에 접근할 수 있습니다.
        }
        System.out.println("End.");
    }
}
