package ch02.Sample1;
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        // 부모클래스에서 private으로 선언된 string을 초기화하기 위해 super()로 부모클래스의 생성자를 호출한다.
        super(string);
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
