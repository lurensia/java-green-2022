package ex06;

public class ForEx02 {
    public static void main(String[] args) {
        long n = 1;
        for (int i = 1; i < 24; i = i + 1) {
            n = n * 2;

            if (i == 23) {
                System.out.println(n);
            }
        }
        System.out.println(n);// 출력
    }
}
