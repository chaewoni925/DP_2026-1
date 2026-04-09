package hw.ch05;

public class LoggerStaticInit {
    // 클래스가 로드될 때 인스턴스가 생성되는 방식 (Eager Initialization)
    /*final을 사용해 인스턴스가 교체되지 않음을 보장, getInstance는 저장되 인스턴스를 반환하기만   */
    
    // static은 데이터(상태)를 가지지 않는 것를 권장, singleton은 상태를 가지는 경우가 많음.
    private static final LoggerStaticInit instance = new LoggerStaticInit(); 
 
    private StringBuilder logBuffer; 
 
    private LoggerStaticInit() { 
        System.out.println("[LoggerStaticInit] 인스턴스를 생성했습니다."); 
        logBuffer = new StringBuilder(); 
    } 
 
    public static LoggerStaticInit getInstance() { 
        return instance; 
    } 
 
    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ") 
        .append(message).append("\n"); 
        System.out.println("[LoggerStaticInit] " + message); 
    } 

    public String getLog() { 
    return logBuffer.toString(); 
    } 
}
