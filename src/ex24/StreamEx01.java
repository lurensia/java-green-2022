package ex24;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 스트림이 연결된다.
        InputStream s = System.in;// 단점: 문자를 하나 하나 받아서 처리한다.

        try {
            int n = s.read();
            System.out.println("결과:" + (char) n);
        } catch (IOException e) {
            System.out.println("에러");
        }
    }
}
