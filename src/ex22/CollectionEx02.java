package ex22;

import java.util.HashSet;
import java.util.Set;

public class CollectionEx02 {
    public static void main(String[] args) {

        Set<Integer> datas = new HashSet<>();
        datas.add(10);
        datas.add(20);
        datas.add(20);
        datas.add(30);
        datas.add(40);

        datas.remove(10);

        System.out.println(datas.size());
        System.out.println(datas);

        /**
         * Iterable its = datas.iterator();
         * while (its.hasNest()){
         * System.out.println(its.next());
         */
    }
}
