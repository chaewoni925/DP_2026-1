package hw.ch05;

public enum LoggerEnum {
    INSTANCE;                              // ← 클래스가 아닌 enum 자체가 싱글톤

    private final StringBuilder logBuffer; // ← enum 필드로 선언

    LoggerEnum() {                         // ← enum 생성자 (private 생략 가능, 항상 private)
        System.out.println("[LoggerEnum] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
                 .append(message).append("\n");
        System.out.println("[LoggerEnum] " + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}