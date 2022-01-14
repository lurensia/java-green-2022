package ex06;

public class ConEx04 {
    public static void main(String[] args) {
        // else if(조건) => 그게 아니라 이것이라면
        int point = 81;
        if (point >= 90) {
            System.out.println("A학점입니다.");
        } else if (point >= 80) // 포인트가 89~80
        {
            System.out.println("B학점입니다.");
        } else if (point >= 70) {
            System.out.println("C학점입니다.");
        } else if (point >= 60) {
            System.out.println("D학점입니다.");
        } else {
            System.out.println("F학점입니다.");
        }
    }// 메인 끝
}
