package ex06;

public class ConEx03 {
    public static void main(String[] args) {
        int point = 81;
        if (point >= 90) {
            System.out.println("A학점입니다.");
        } else {// 중첩if문
            if (point >= 80) {
                System.out.println("B학점입니다.");
            } else {
                System.out.println("F학점입니다.");
            }
        }
    }
}