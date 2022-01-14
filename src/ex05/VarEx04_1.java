package ex05;

public class VarEx04_1 {
    public static void main(String[] args) {
        String s1 = "아수라";// s1은 *2에 저장될 '아수라'의 주소저장/ 아수라는 *2에 저장
        String s2 = s1; // s2는 s1의 최종값인 "아수라"가 아닌 s1이 가진 주소 '*2'를 가진다.
        s2 = "팔 6개"; // 팔 6개 라는 값은 *2가 아닌 다른 빈 공간(*7)으로 넘어가며 출력시 s2는 그 빈공간 *7의 주소를 가진채 최종값인 '팔 6개' 를
                     // 출력한다.
        System.out.println(s2);
    }
}
