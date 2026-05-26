package practice.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// 파일에서 큰 문자 데이터를 읽어들임
public class BigChar {
    // 문자의 이름 
    private char charname;
    // 큰 문자를 표현하는 문자열('#' '.' '\n'으로 이루어진 열)
    private String fontdata;

    // 생성자 
    public BigChar(char charname) {
        this.charname = charname;
        try {
            String filename = "big" + charname + ".txt"; // "big3.txt"
            StringBuilder sb = new StringBuilder();
            for (String line: Files.readAllLines(Path.of(filename))) { // 각 줄을 읽어서 리스트가 만들어짐.
                sb.append(line); //(sb는 StringBuilder 객체) 각 줄을 sb에 추가한다.
                sb.append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 큰 문자를 표시한다
    public void print() {
        System.out.print(fontdata);
    }
}
