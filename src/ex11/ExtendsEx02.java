package ex11;

class 동물 {
    String getName() {// 행위로 만들었다.
        return "";

    }

    void setHp(int hp) {
    }

    int getHp() {
        return 0;
    }

    int getAttack() {
        return 0;

    }

}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;

    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;

    }

}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;

    }

}

class 늑대 extends 동물 {
    String name = "늑대";
    int hp = 70;
    int attack = 25;

    String getName() {
        return name;
    }

    void setHp(int hp) {
        this.hp = hp;
    }

    int getHp() {
        return hp;
    }

    int getAttack() {
        return attack;

    }

}

public class ExtendsEx02 {

    // 사자 -> 호랑이 공격
    static void attack(동물 unit1, 동물 unit2) {
        System.out.println(unit2.getName() + " 이/가 " + unit1.getName() + " 에게 공격당했습니다. "); // or
        // System.out.println(unit1.getName + " 이/가 " + unit2.getName + "를 공격했습니다. ");
        unit2.setHp(unit2.getHp() - unit1.getAttack());
        // unit2.setHp = unit2.getHp() - unit1.getAttack(); // 오버라이드 2
        System.out.println(unit2.getName() + "의 남은hp:" + unit2.getHp());
        // if (unit2.getHp() >= 0) {
        // System.out.println(unit2.getName() + "은/는 죽었습니다.");
        // }

    }

    public static void main(String[] args) {
        동물 lion = new 사자();
        동물 tiger = new 호랑이();
        동물 bear = new 곰();
        동물 wolf = new 늑대();

        attack(lion, tiger);
        attack(tiger, bear);
        attack(bear, lion);

        attack(wolf, lion);
        attack(wolf, lion);
    }
}
