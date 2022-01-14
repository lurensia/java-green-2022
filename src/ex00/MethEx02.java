package ex00;

class Calculator2 {
    static int add(int a1, int a2) {
        return a1 + a2;
    }

    static int multi(int a1, int a2) {
        return a1 * a2;
    }
}

public class MethEx02 {
    public static void main(String[] args) {
        int r1 = Calculator2.add(20, 50);
        System.out.println(r1);
        int r2 = Calculator2.multi(r1, 10);
        System.out.println(r2);
    }
}

// 투입구와 출구가 둘 다 있는 메서드