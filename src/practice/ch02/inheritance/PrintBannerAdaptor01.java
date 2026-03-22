package practice.ch02.inheritance;

public class PrintBannerAdaptor01 extends Banner implements Print {
    // (1) 인자없는 생성자는 자동으로 생성됨
    // (2) 생성자는 상속되지 않음

    public PrintBannerAdaptor01(String text){
        super(text); // 부모 생성자를 호출함
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
