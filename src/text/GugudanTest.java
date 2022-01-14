package text;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 초기화
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int i = 1;
        // 초기화 종료
        
        //입력값 받기
        System.out.println("찾으려는 단의 최소 값은?: <2~7일 경우 2 입력.>");
        n1 = sc.nextInt();
        int step = n1;
        System.out.println("찾으려는 단의 최대 값은?:<2~7일 경우 7입력.>");
        n2 = sc.nextInt();
        System.out.println("곱하는 수의 최대 값은?:<19단 까지 알고싶다? 19 입력.>");
        n3 = sc.nextInt();

        for (step = n1; step <= n2; step++) {// 최소치와 최대치 받기
            System.out.println(" "); // 한줄 띄기
            System.out.println(step + "단");// 보기좋게 정리하기
            for (i = 1; i <= n3; i++) {// n3를 이용해 범위(최대치)받기
                System.out.println(step + "*" + i + "=" + (step * i));
            }
        }
    }
}
