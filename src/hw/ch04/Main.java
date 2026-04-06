package hw.ch04;


public class Main {
    public static void main(String[] args) {
        System.out.println("20240841 이채원");
        System.out.println("\n");
    // 탸입(Factroy 호출) 변수 이름(그릇이름) = 실제 만들어지는 객체(내용물)
        Factory factory1 = new IDCardFactory("2026-01-15");
        Product card1 = factory1.create("Kim Youngjin");
        Product card2 = factory1.create("Son Heungmin");
        card1.use();
        card2.use();

        System.out.println("\n");
        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();
    }
}
