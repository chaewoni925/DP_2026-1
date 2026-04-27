package ch05.A2a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple { // String(이름)으로 Triple 객체를 구하는 클래스
    private static Map<String,Triple> map = new HashMap<>(); //Triple 객체 3개를 저장할 Map
    static {
        String[] names = { "ALPHA", "BETA", "GAMMA" };
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
        // map.put(s, new Triple(s)): 루프를 돌면서 ALPHA, BETA, 
        // GAMMA라는 이름표를 붙인 인스턴스 3개를 생성해 창고(map)에 미리 저장해둡니다.
    }

    private String name; // 외부에서 새로운 인스턴스를 만드는 것을 금지

    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) { // 창고지기 역할을 함
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
