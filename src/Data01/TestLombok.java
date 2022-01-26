package Data01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
class 사자 {
    private String name;
    private String color;
}

public class TestLombok {
    public static void main(String[] args) {
        사자 s = new 사자("사자", "노랑");
        // s.setName("사자");//getName이 없어서 오류난다.플러그인 필요.
        System.out.println(s.getName());
    }
}
