package hw.ch10;

/**
 * CyclicStrategy: 가위(0) → 바위(1) → 보(2) → 가위(0) → ... 순서로 순환하는 전략
 * study() 호출과 무관하게 항상 순서대로 손가락을 선택한다.
 */
public class CyclicStrategy implements Strategy {
    private int currentIndex = 0;

    // 순환 순서: 바위(1) → 가위(0) → 보(2) 순서로 출력되도록
    // 과제 예상 출력: 1번째=바위, 2번째=가위, 3번째=보 이므로
    // Hand 값: 바위=1, 가위=0, 보=2 순서
    private static final int[] CYCLE = { 0, 1, 2};  // 바위 → 가위 → 보

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(CYCLE[currentIndex]);
        currentIndex = (currentIndex + 1) % CYCLE.length;
        return hand;
    }

    @Override
    public void study(boolean win) {
        // CyclicStrategy는 승패와 무관하게 순환하므로 아무 동작도 하지 않음
    }
}