package ch02.Sample2;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }
    // printBanner를 왜 쓰냐면, Banner에서는 showWithParen()과 showWithAster() 메서드만 제공하고,
    // print에서는 printWeak()와 printStrong() 메서드만 제공하기 때문에 printBanner에서 두 가지를 연결해주는 역할을 한다.
    // 
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
