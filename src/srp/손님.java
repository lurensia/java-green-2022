package srp;

//손님(-종업원) : 디펜더시_의존적관계
public class 손님 {

    public void 주문하기(종업원 manager, 요리사 chef) {
        음식 jjajang = manager.주문받기(chef);
        System.out.println(jjajang.getName() + "을/를 먹습니다.");
        // 주문받기();
    }
}
