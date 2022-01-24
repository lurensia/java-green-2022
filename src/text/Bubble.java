package text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("리스트의 크기는?");// 리스트 크기 확인
        final int size = sc.nextInt();// 리스트 사이즈 확정
        int addNum, upDown, change;
        int x, y;// 나중에 쓰기 귀찮아서 쎃지만 그냥 쓸때 int x 하는게 더 편할듯...
        List<Integer> list = new ArrayList<Integer>(size);
        System.out.println("리스트에 들어갈 중복이 없는 숫자를" + size + " 가지 쓰세요.");
        for (int i = 0; i < size; i++) {
            addNum = sc.nextInt();
            list.add(addNum);// 리스트에 숫자 추가.
            if (i == size - 1) {// 크기가 커질경우 자신이 어디까지 했는지 확인하기 위해
                System.out.println("마지막숫자가 입력되었습니다.");
            } else if (i % 5 == 0) {// 5단위로 자신이 적은 숫자의 계수 확인.
                System.out.println(i + 1 + "번째 숫자입니다.");
            }
        }
        System.out.println("오름차순으로 정렬 하실 경우 1번을, 내림차순의 경우 2번을 눌러주세요.");
        upDown = sc.nextInt();
        if (upDown == 1) {
            System.out.println("1. 오름차순으로 정렬합니다.");
            for (x = 1; x < size; x++) {// 사이즈크기만큼 반복시작
                for (y = 0; y < size - x; y++) {// 버블 오름차순의 특성상 가장 큰 숫자가 뒤로 간다. 방법 1.
                    if (list.get(y) > list.get(y + 1)) {// 뒷 숫자가 앞보다 클시 작동
                        change = list.get(y);// 채인지 공간에 y 공간의 값을 저장
                        list.set(y, list.get(y + 1));// y를 다음 숫자로 전환
                        list.set(y + 1, change);// y가 y+1로 대체되어 사라졌기에 change에 있던 y값을 호출하여 위치 변경
                    }
                }
            }
        } else {
            System.out.println("2.내림차순으로 정렬합니다.");
            for (x = 1; x < size; x++) {// 사이즈크기만큼 반복시작
                for (y = 0; y < size - x; y++) {
                    if (list.get(y) < list.get(y + 1)) {// 뒷 숫자가 앞보다 작을 시
                        change = list.get(y);// 채인지 공간에 y 공간의 값을 저장
                        list.set(y, list.get(y + 1));// y를 다음 숫자로 전환
                        list.set(y + 1, change);
                    }
                }
            }
        }
        System.out.println(list);// 출력
    }
}