package stringex;

import javax.sql.rowset.spi.SyncResolver;

public class StringEx03 {
    public static void main(String[] args) {

        String data = "20";
        int temp = Integer.parseInt(data);
        System.out.println(temp);
    }
}
// package stringex;

// import java.util.Scanner;

// public class StringEx03 {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// String data = sc.nextLine();
// System.out.println("전송된 데이터 : " + data);

// String[] tokens = data.split("-|:");
// System.out.println(tokens[0]);//잘 잘렸는지 확인
// System.out.println(tokens[8]);// 한번더 검수

// if (tokens[0].equals("A01")) {
// // start parsing
// System.out.println("파싱을 시작합니다");
// String getName = tokens[2].toString();
// int getCellPhone = Integer.parseInt(tokens[4]);
// char getGender = tokens[6].charAt(0);
// int getAge = Integer.parseInt(tokens[8].trim());

// System.out.println("이름은"+getName);
// System.out.println("전번은"+getCellPhone);
// System.out.println("성별은"+getGender);
// System.out.println("나이는"+getAge);
// // for (String s : tokens) {

// // System.out.println(s);
// // }
// } else {
// System.out.println("파싱을 종료합니다.");
// }
// }
// }