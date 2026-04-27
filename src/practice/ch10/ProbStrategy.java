package practice.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0; // 이전에 냈던 손익 값
    private int currentHandValue = 0; // 바로 직전에 낸 손익 값
    private int[][] history = { // 행은 직전에 냈던 손, 열은 그 다음에 낼 손
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        // 랜덤 객체 생성
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() { 
        int bet = random.nextInt(getSum(currentHandValue)); // 0부터 (현재 상황의 점수 합계 - 1) 사이의 값
        int handvalue = 0; // 이번에 낼 손익 값
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i]; // 행 번호는 고정, 열 번호가 0, 1, 2로 바뀜 => 그 행의 값을 다 더함.
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++; 
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
