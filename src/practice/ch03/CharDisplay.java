package practice.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시해야 하는 문자 

    // 생성자 
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    //@로 시작하는 단어를 어노테이션(annotation)이라고 한다. @Override는 오버라이드(재정의)한다는 의미로,
    // 부모 클래스의 메소드를 자식 클래스에서 재정의할 때 붙이는 어노테이션이다. 
    // @Override는 컴파일러에게 부모 클래스의 메소드를 재정의하는 것임을 알려준다.
    //  @Override를 붙이면, 부모 클래스에 해당 메소드가 존재하지 않거나, 
    // 시그니처가 일치하지 않는 경우 컴파일 에러가 발생한다. 
    // 따라서 @Override는 코드의 가독성을 높이고, 실수를 방지하는 데 도움을 준다.
    //  @Override는 선택 사항이지만, 부모 클래스의 메소드를 재정의할 때는 붙이는 것이 좋다.
    
    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 기억해 둔 문자를 1회 표시한다 
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println(">>");
    }
}
