package practice.ch10;

// 모든 전략 클래스가 구현해야 하는 인터페이스(따라야하는 규칙)

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
