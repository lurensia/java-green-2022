package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int step = 2; step <= 9; step++) {
            System.out.println(step + "단");
            for (int n = 1; n <= 9; n++) {
                System.out.println(step + "*" + n + "=" + (step * n));
            }
        }
    }
}