package ch05.A2b;

public enum Triple {
    ALPHA, BETA, GAMMA;

    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name); //이 메소드는 우리가 입력한 문자열과 이름이 정확히 일치하는 상수 객체를 찾아서 반환합니다.
        // map은 틀리면 null을 반환하지만, valueOf는 틀리면 IllegalArgumentException(에러)을 던집니다.
    }
}
