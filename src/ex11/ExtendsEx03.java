package ex11;

//1. start 메서드에서 name을 출력해보세요!!
//2. start 메서드에서 name 값을 변경해서 출력해보세요.

class 애완동물 {
    void sound() {
    }

    void name() {

    }
}

class 강아지 extends 애완동물 {

    void name() {
        System.out.println("강아지");
    }

    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {
    void name() {
        System.out.println("고양이");
    }

    void sound() {
        System.out.println("야옹");
    }
}

public class ExtendsEx03 {

    static void start(애완동물 u1) {
        u1.sound();
        u1.name();
    }

    public static void main(String[] args) {
        고양이 cat = new 고양이();
        강아지 dog = new 강아지();
        start(cat);
        start(dog);

    }
}

// String name = "사자";
// int hp = 100;
// int atk = 10;

// String name = "호랑이";
// int hp = 100;
// int atk = 15;

// String name = "곰";
// int hp = 100;
// int atk= 50;
// 오버라이딩 = 무효화하다. -> 아래로 타고 내려가는 기법//재사용이 아니다.
// 사자 -> 호랑이 공격
// static void attack(동물 unit1, 동물 unit2) {
// System.out.println(unit2.name + "가 공격당하고 있습니다.");
// unit2.hp = unit2.hp - unit1.attack;
// System.out.println(unit2.name + "의 hp : " + unit2.hp);

// package ex11;

// class 동물 {
// String name() {
// return "";
// };

// int hp() {
// return 0;
// }

// int attack() {
// return 0;
// }
// }

// class 사자 extends 동물 {
// String name = "사자";
// int hp = 100;
// int attack = 10;

// String name() {
// return name;
// };

// int hp() {
// return hp;
// }

// int attack() {
// return 0;
// }
// }

// class 호랑이 extends 동물 {
// String name = "호랑이";
// int hp = 100;
// int attack = 15;

// String name() {
// return name;
// };

// int hp() {
// return hp;
// }

// int attack() {
// return 0;
// }
// }

// class 곰 extends 동물 {
// String name = "곰";
// int hp = 100;
// int attack = 50;

// String name() {
// return name;
// };

// int hp() {
// return hp;
// }

// int attack() {
// return 0;
// }
// }

// public class ExtendsEx02 {

// // 오버라이딩 = 무효화하다 ->아래로 타고 내려가는 기법
// // 사자 -> 호랑이 공격
// static void attack(동물 unit1, 동물 unit2) {
// System.out.println(unit2.name() + "가(이) 공격당하고 있습니다.");
// unit2.hp() = unit2.hp() - unit1.attack();
// System.out.println(unit2.name() + "의 hp : " + unit2.hp());
// }

// public static void main(String[] args) {
// 동물 lion = new 사자();
// 동물 tiger = new 호랑이();
// 동물 bear = new 곰();

// attack(lion, tiger);
// attack(lion, bear);
// }
// }