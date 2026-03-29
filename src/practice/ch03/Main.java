package practice.ch03;

public class Main {
    public static void main(String[] args) {
        CharDisplay d1 = new CharDisplay('H');
        //=AbstractDisplay d1 = new CharDisplay('H'); charDisplay는 AbstractDisplay의 
        // 하위 클래스이므로, AbstractDisplay도 가능 CharDisplay로 가능!
        d1.display();
        d1.open();

        //StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        
        

    }
}
