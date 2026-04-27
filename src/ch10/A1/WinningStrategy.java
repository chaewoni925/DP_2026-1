package ch10.A1;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;// 난수 생성기, null로 초기화
    private boolean won = false; // 생략해도 문제 x
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        Random random;// 로컬변수라, 초기화x
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
