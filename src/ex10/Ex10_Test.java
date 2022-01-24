package ex10;

import java.util.Scanner;

public class Ex10_Test {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println("좌석을 예약하시겠습니까? (1또는 0)");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        if (r == 1) {
            System.out.println("현재의 예약 상태는 다음과 같습니다.");
            System.out.println("----------------------------------------------");
            for (int i = 0; i < list.length; i++)
                System.out.println(list[i]);
            System.out.println("----------------------------------------------");
        }
    }

}
