package ex07;

public class MethodEx01 {
    // 자바는 모든 데이터가 클래스 안에 있어야 한다.

    // 매선드
    static void add(int n1) {
        System.out.println("받은 숫자는" + n1);
    }

    public static void main(String[] args) {
        MethodEx01.add(5000); // 매서드 호출
    }
}
