package hw.ch03;

public class NumberDisplay extends AbstractDisplay {

     private int number;  // 표시할 숫자

    public NumberDisplay(int number) {
        super(5);  // 기본값 5회
        this.number = number;
    }

    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount);  // 반복 횟수 지정
        this.number = number;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(number);
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }
}
   