package practice.ch20;

public class Main {
    public static void main(String[] args) {
        BigCharFactory factory = BigCharFactory.getInstance();

        BigChar char3 = factory.getBigChar('1');
        char3.print();

        BigChar char4 = factory.getBigChar('1');
        char4.print();

        if(char3 == char4) {
            System.out.println(" char 3과 char4는 같은 BigChar 인스턴스입니다.");
        }else {
            System.out.println(" char 3과 char4는 다른 BigChar 인스턴스입니다.");
        }

    }
    
}
