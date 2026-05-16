package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number; // 현재 생성된 수
    private int end;    // 종료값 (이 값은 포함하지 않음)

    // 생성자: start부터 end 미만까지
    public EvenNumberGenerator(int start, int end) {
        // 요구사항: start는 짝수여야 함 (간단한 검증 혹은 그대로 할당)
        this.number = start;
        this.end = end;
    }

    // 현재 수를 취득한다
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성하고 통보한다
    @Override
    public void execute() {
        while (number < end) {
            notifyObservers(); // 등록된 관찰자들에게 통지
            number += 2;       // 짝수이므로 항상 2씩 증가
        }
    }
}