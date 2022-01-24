package lottoex01;

import java.util.HashSet;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        // -해쉬셋으로 랜덤한 로또번호 받기 6개
        HashSet<Integer> lotto = new HashSet<>();
        Random r = new Random();

        // 반복되서 로또에 담기(6개)
        // Hashset자료구조는 중복되는 데이터가 들어가면 허용하지 않음.
        while (true) {
            int n = r.nextInt(45) + 1;
            lotto.add(n);
            if (lotto.size() == 6)
                break;// 조건문 if에선 한줄은 중괄호 생략 가능

        }
        if (lotto.size() == 6) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }

}
