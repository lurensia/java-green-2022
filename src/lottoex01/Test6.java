package lottoex01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    // -어레이리스트 로또 2개 만들어서 비교해보기.
    public static void main(String[] args) {
        List<Integer> lotto1 = Arrays.asList(1, 3, 5, 7, 9, 10);
        ArrayList<Integer> lotto2 = new ArrayList<>();
        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(7);
        lotto2.add(8);
        lotto2.add(10);

        // 두개 비교하는 코드.

        int failchack = 0;
        final int LOTTOCYCLE = lotto1.size();// final이 붙은 변수는 대문자로 정의된다.

        for (int i = 0; i < LOTTOCYCLE; i++) {
            if (lotto1.get(i).equals(lotto2.get(i))) {
                System.out.println(i + "번지의 값이 일치합니다.");
            } else {
                failchack = failchack + 1;
                System.out.println(failchack);
            }

            // if (lotto1.get(0).equals(lotto2.get(0))) {
            // System.out.println("0 번지의 값이 일치합니다.");
            // } else {
            // failchack = failchack++;
            // }
            // if (lotto1.get(1).equals(lotto2.get(1))) {
            // System.out.println("1 번지의 값이 일치합니다.");
            // } else {
            // failchack = failchack++;
            // }

        }
        // 검증
        if (failchack == 0) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

    }
}
