package ex11;

class 동물 {
    void p_name() {

    }

    void p_hp() {

    }

    void p_attack() {

    }
}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class ExtendsEx02 {

    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {

    }

    public static void main(String[] args) {

    }
}