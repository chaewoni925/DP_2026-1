package hw.ch02;

public class Main {
    public static void main(String[] args) {

        System.out.println(" 20240841 이채원");

        KoreanOutlet outlet = new KoreanOutlet();
        Charger adapter = new KoreanOutletAdapter(outlet);
        Smartphone smartphone = new Smartphone(adapter);
        smartphone.charge();
    }
}
