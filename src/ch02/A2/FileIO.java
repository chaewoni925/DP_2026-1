package ch02.A2;
// 인터페이스

import java.io.IOException;

public interface FileIO {
    public void readFromFile(String filename) throws IOException; //throws임!! 이 메서드는 이런 에러가 날 수도 있으니 조심해!"라고 예고
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value); //키에 해당하는 값을 저장
    public String getValue(String key); // 키에 해당하는 값을 반환, 키가 존재하지 않으면 null을 반환
}
