package text;

// 1. start 메서드에서 name을 출력해보세요!!
// 2. start 메서드에서 name 값을 변경해서 출력해보세요!!
class 애완동물 {
    void sound() {
    }

    void printname() {
    }

    void changename() {
    }
}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {

    String name = "고양이";

    void printname() {
        System.out.println(name);
    }

    void changename() {
        name = "변경된 고양이";
    }

    void sound() {
        System.out.println("야옹");
    }
}

public class TextCD {

    static void start(애완동물 u1) {
        u1.sound();
        u1.printname();
        u1.changename();
        u1.printname();
        System.out.println("===========");
    }

    public static void main(String[] args) {
        고양이 cat = new 고양이();// 고양이, 애완동물
        start(cat);// 둘다 print_고양이 실행
        강아지 dog = new 강아지();// 강아지, 애완동물
        start(dog);// 애완동물만 print_애완동물 실행

    }
}