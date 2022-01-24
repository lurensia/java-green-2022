package ex22;

import javax.swing.Box;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";
}

class 오렌지 {
    String name = "오렌지";
}

class ResponsBox<T> {
    T data;

    public ResponsBox(T data) {
        this.data = data;
    }
}

// 제네리글 사용하면 메서드의 리턴 타입을 고정시키면서 다양하게 리턴할 수 있다.

public class GenericEx01 {

    public static void main(String[] args) {
        ResponsBox<사과> rb1 = new ResponsBox<사과>(new 사과());
        System.out.println(rb1.data.name);
        ResponsBox<딸기> rb2 = new ResponsBox<딸기>(new 딸기());
        System.out.println(rb2.data.name);
        ResponsBox<오렌지> rb3 = new ResponsBox<오렌지>(new 오렌지());
        System.out.println(rb3.data.name);
        // rb 응답
    }
}
