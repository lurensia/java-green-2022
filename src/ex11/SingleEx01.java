package ex11;

class 튜브 {
    int num = 10;

    private static 튜브 instance = new 튜브();
    // 스태틱으로 고정?

    private 튜브() {
    }// 이거 없으면 new를 계속 쓸 수 있게 된다.

    public static 튜브 getInstance() {
        System.out.println("만들어진 튜브를 가져옵니다.");
        return instance;
    }

}

/**
 * 
 * 패턴 -> 디자인패턴 -> 설계도를 패턴으로 만들까?
 * 그냥 설계할 수 있고, 디자인 패턴에 맞춰서 설계할 수 있다. 추하고 아름답고 차이.
 * 싱글톤 패턴_객체를 하나만 만드는 패턴!!
 */

public class SingleEx01 {
    public static void main(String[] args) {
        튜브 t1 = 튜브.getInstance();
        튜브 t2 = 튜브.getInstance();

        System.out.println(t1.hashCode());
        System.out.println(t1.hashCode());
    }
}
