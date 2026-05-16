package hw.ch17;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("20240841 이채원");
        
        
        // 요구사항대로 EvenNumberGenerator(0, 30) 객체 생성
        NumberGenerator generator = new EvenNumberGenerator(0, 30);
        
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new RangeObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        
        // 숫자 생성 및 관찰자 통지 시작
        generator.execute();
    }
}