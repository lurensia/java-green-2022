package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 1. 단위 테스트
 * -ArrayList에 숫자 6개 담기.
 * -스캐너로 금액 입력받아서 횟수 정하기(5000원 -> 5번)
 * //안써봤다면 랜덤써보기
 * -해쉬셋으로 랜덤한 로또번호 받기 6개.
 * -해쉬셋은 순서를 보정하지 않고 데이터를 가지기 때문에 순차정령하기(구글링)
 * -로또 세트 5개를 어레이리스트에 넣기.
 * -어레이리스트 로또 2개 만들어서 비교해보기.
 */
public class Test1 {
    public static void main(String[] args) {
        // -ArrayList에 숫자 6개 담기.
        ArrayList<Integer> buyLotto = new ArrayList<>();
        buyLotto.add(3);
        buyLotto.add(9);
        buyLotto.add(17);
        buyLotto.add(18);
        buyLotto.add(28);
        buyLotto.add(30);

        System.out.println(buyLotto);

        // 검증
        if (buyLotto.size() == 6) {
            System.out.println("나온 숫자: " + buyLotto);
        } else {
            System.out.println("숫자가 6개 미만이거나 초과입니다.");
        }
        // -스캐너로 금액 입력받아서 횟수 정하기(5000원 -> 5번)(Moc 데이터)
        System.out.println("로또에 사용할 금액은? :");
        Scanner sc = new Scanner(System.in);
        long money = sc.nextInt();
        int count = (int) money / 1000;
        System.out.println("받은 금액: " + money + "원");
        System.out.println("반복 횟수: " + count + "회");
        // 검증
        if (count == 5) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

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
            // 결과
        }
        if (lotto.size() == 6) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
        // Test 4
        System.out.println(lotto);

        List<Integer> sl = new ArrayList<>(lotto);
        Collections.sort(sl);
        int failCheck = 0;
        for (int i = 0; i < sl.size() - 1; i++) {
            if (sl.get(i) < sl.get(i + 1)) {
                System.out.println(i + "번지 " + (i + 1) + "번지 비교 - 성공");
            } else {
                failCheck++;
            }

        }
    }
}

// // Test
// List<Integer> sl = new ArrayList<>(lotto);
// Collections.sort(sl);

// // 눈으로 확인
// System.out.println(sl);

// // 검증
// int failCheck = 0;

// if (sl.get(0) < sl.get(1)) {
// System.out.println("0번지 1번지 비교 - 성공");
// } else {
// failCheck++;
// }

// if (sl.get(1) < sl.get(2)) {
// System.out.println("1번지 2번지 비교 - 성공");
// } else {
// failCheck++;
// }

// if (sl.get(2) < sl.get(3)) {
// System.out.println("2번지 3번지 비교 - 성공");
// } else {
// failCheck++;
// }

// if (sl.get(3) < sl.get(4)) {
// System.out.println("3번지 4번지 비교 - 성공");
// } else {
// failCheck++;
// }

// if (sl.get(4) < sl.get(5)) {
// System.out.println("4번지 5번지 비교 - 성공");
// } else {
// failCheck++;
// }

// System.out.println("실패 횟수 : " + failCheck);
