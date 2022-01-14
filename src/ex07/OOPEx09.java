package ex07;

class Person3 {
    String name;
    int height;
    int weight;

    void hello() {
        String name = "안녕";
        System.out.println(this.name);
        // name일 경우 가장 가까운 안녕 출력
    }

    // 생성자로 초기화
    Person3(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }// this= 자신이 있는 클래스의 힙 공간에 연결
}// 생성자로 초기화

public class OOPEx09 {

    public static void main(String[] args) {
        Person3 s1 = new Person3("홍길동", 170, 70);
        Person3 s2 = new Person3("암꺽정", 150, 200);
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
