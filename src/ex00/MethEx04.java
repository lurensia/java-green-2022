package ex00;

//오버로딩 = over-loading? =과적재?

class 사자 {
    String name = "사자";
    int hp = 100;
    int attack = 10;
}

class 호랑이 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;
}

class 곰 {
    String name = "곰";
    int hp = 100;
    int attack = 50;
}

public class MethEx04 {

    // 사자가 호랑이를 공격
    static void attackTigerToLion(호랑이 unit2, 사자 unit1) {
        System.out.println(unit2.name + "가 " + unit1.name + "에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit1.attack;
        System.out.println(unit2.name + "의 hp: " + unit2.hp);
    }

    // 호랑이가 사자를 공격
    static void attackLionToTiger(사자 unit1, 호랑이 unit2) {
        System.out.println(unit1.name + "가 " + unit2.name + "에게 공격당하고 있습니다.");
        unit1.hp = unit1.hp - unit2.attack;
        System.out.println(unit1.name + "의 hp: " + unit1.hp);
    }

    // 호랑이가 곰을 공격
    static void attackBearToTiger(호랑이 unit2, 곰 unit3) {
        System.out.println(unit3.name + "가 " + unit2.name + "에게 공격당하고 있습니다.");
        unit3.hp = unit3.hp - unit2.attack;
        System.out.println(unit3.name + "의 hp: " + unit3.hp);
    }

    // 사자가 곰을 공격
    static void attackBearToLion(사자 unit1, 곰 unit3) {
        System.out.println(unit3.name + "가 " + unit1.name + "에게 공격당하고 있습니다.");
        unit3.hp = unit3.hp - unit1.attack;
        System.out.println(unit3.name + "의 hp: " + unit3.hp);
    }

    // 곰이 호랑이를 공격
    static void attackTigerToBear(호랑이 unit2, 곰 unit3) {
        System.out.println(unit2.name + "가 " + unit3.name + "에게 공격당하고 있습니다.");
        unit2.hp = unit2.hp - unit3.attack;
        System.out.println(unit2.name + "의 hp: " + unit2.hp);
    }

    // 곰이가 사자를 공격
    static void attackLionToBear(사자 unit1, 곰 unit3) {
        System.out.println(unit1.name + "가 " + unit3.name + "에게 공격당하고 있습니다.");
        unit1.hp = unit1.hp - unit3.attack;
        System.out.println(unit1.name + "의 hp: " + unit1.hp);
    }

    public static void main(String[] args) {
        사자 u1 = new 사자();
        호랑이 u2 = new 호랑이();
        곰 u3 = new 곰();

        attackLionToTiger(u1, u2);
        attackLionToBear(u1, u3);
        attackTigerToLion(u2, u1);
        attackTigerToBear(u2, u3);
        attackBearToLion(u1, u3);
        attackBearToTiger(u2, u3);

    }
}
