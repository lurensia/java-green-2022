package ex06;

import java.util.Scanner;

public class WhileEx04 {
    public static void main(String[] args) {
        // 남은 동전 구하기 게임(500, 100, 50 ,10)
        Scanner sc = new Scanner(System.in);
        int Money = 2680;
        int restMoney = Money;
        while (true) {
            int coin = sc.nextInt();// 500, 100, 50, 10

            // 남은 동전 출력하는 로직

            System.out.println(coin + "원:");
            System.out.println(restMoney / coin + "개");
            restMoney = restMoney % coin;

            // if문 break;
            if (coin == 10) {
                break;
            }
        }
    }
}
