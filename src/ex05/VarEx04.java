package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4가지 자료형 int, double, long, boolean
        // 2. 문자열 : 사이즈를 알 수 없다, 자료형이 아님!!
        String s1 = "안녕하세요";// *2
        System.out.println(s1);
        String s2 = s1;// 주소가 저장됨
        s2 = "바보";// *2 가 *7로 전환됨
        System.out.println(s2);
    }
}

/*
 * String s1 = "홍길동" 6바이트
 * String s1 = "용궁무녀";// 8바이트
 * String s1 = "안녕하세요";// 10바이트
 * String의 크기를 못정한다.
 */
