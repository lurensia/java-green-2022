package ex22;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx01 {
    public static void main(String[] args) {
        List<String> datas = new ArrayList<String>();
        datas.add("데이터1");
        datas.add("데이터2");
        datas.add("데이터3");
        datas.add("데이터4");// 추가

        datas.set(1, "data2");// 변경
        datas.remove(3);// 삭제

        System.out.println(datas.get(0));
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));
        // System.out.println(datas.get(3));
    }
}
