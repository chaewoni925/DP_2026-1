package midexam.ch05.Sample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        TicketMaker obj1 = TicketMaker.getInstance();
        TicketMaker obj2 = TicketMaker.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("obj1과 obj2는 같은 인스턴스가 아닙니다.");
        }
        System.out.println("End.");
    }
}
