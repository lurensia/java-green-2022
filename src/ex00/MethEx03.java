package ex00;

/**
 * 매서드 규칙
 * 1. 투입구와 출구가 있지만 출구(return)가 항상 필요하진 않다.
 * 2. 메서드는 하나의 모듈(특별한 역할_목적_을 수행하는)이 될 수 있다.
 * 3. 출구가 없을 때 void를 사용, 출구가 있을 대는 타입을 동일하게 해준다.
 * 4. 메서드 내부(Queue)를 몰라도 사용할 수 있다.
 * 5. 메서드는 1급 객체인가? -> 아니다. 자바에서는 1급 객체가 class 밖에 없다.
 * 6. 메서드 왜 만들어? 특정한 역할(목적)을 수행하는 코드 꾸러미를 만들어 두려고
 * - 캡슐화, 재사용, 코드관리도 편함.
 * 7. static 메서드 내부에서는 heap에 있는 데이터(상태)를 찾을 수 없다.
 */

public class MethEx03 {

    int sum = 0;

    void start() {
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        sum = result;
    }

    public static void main(String[] args) {
        MethEx03 m = new MethEx03();
        System.out.println("start실행전 sum:" + m.sum);
        m.start(); // 클래스명 생략 가능(같은 클래스에 있기 때문에)
        System.out.println("start실행gn sum:" + m.sum);
    }
}

/**
 * public class MethEx03 {
 * 
 * int sum = 0;
 * 에 나오는 sum과
 * 
 * static void start() {
 * int n1 = 10;
 * int n2 = 20;
 * int result = n1 + n2;
 * sum = result;
 * }
 * 에 나오는 int sum의 문제라고 생각합니다.
 * 
 * 그냥 존재하는 int sum보다
 * static에 존재하는 sum의 정의가 우선시 되기에
 * 이후에 나오는 sum은 필요없는 파일로 정의되어 오류가 생기는게 아닌가?
 * 라는게 오류의 원인이라고 생각합니다.
 * 그렇기 때문에 저는 int sum을 static int sum으로 바꾸면 정상작동 하지 않을까
 * 라고 생각합니다.
 * 
 * 
 */
/*
 * 김정민 — 오늘 오후 3:00
 * static void start : sum이 떠있을지 아닐지 확신할 수가 없다.
 * MethEx03 m = new MethEx03();를 start() 위에 적거나 밑에 적거나의 차이가 있는데 니가 어떻게 쓸지 모르니까
 * 그냥 금지시키겠다
 * 완벽!! 이렇게 이해하면 되겠어요
 */