package hw.ch05;

public class LoggerSynchronizedLazy{
    
    private static LoggerSynchronizedLazy instance;
    private StringBuilder logBuffer; //StringBuilder logBuffer = 로그 메시지들을 차곡차곡 누적해서 저장하는 문자열 그릇
    /* StringBuilder : 문자열을 계속 이어 뭍일 수 있는 가변(mutable) 문자열 저장 공간
      logBuffer는 로그를 임시로 쌓아둠. 
      getlog를 호출하면 쌓인 내용을 한꺼번에 반환*/

    private LoggerSynchronizedLazy() {
        System.out.println("[LoggerSynchronizedLazy] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }   

    // 처음 호출될때만 인스턴스 생성, sychronized 키워드로 멀티스레드 환경에서도 안전하게 동작
    public static synchronized  LoggerSynchronizedLazy  getInstance() {
        if (instance == null) {
            instance = new LoggerSynchronizedLazy();
        }
        return instance;
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
        .append(message).append("\n");
        System.out.println("[LoggerSynchronizedLazy] " + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
    //구현
}
