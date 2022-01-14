package ex06;

import java.util.Scanner;

public class WhileEx05 {
    public static void main(String[] args) {
        int n = 1;
        // 변수 n을 이용해서 1부터 10까지 출력하시오
        while (true) {
            System.out.println(n);
            n = n + 1;

            // 출력이 끝나면 break 문으로 빠져나오시오.
            if (n > 10) {
                break;
            }
        }
    }
}
