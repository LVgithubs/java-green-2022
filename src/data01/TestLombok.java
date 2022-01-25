package data01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//리플렉션 이해!
@Setter
@Getter
@AllArgsConstructor
class 사자 {
    private String name;
    private String color;
}

// JVM은 내가 위으 클래스를 만들지 안만들지도,
// name 과 color 가 어떤 타입인지 모른다!
//

public class TestLombok {
    public static void main(String[] args) {
        사자 s = new 사자("사자", "노랑");
        System.out.println(s.getName());
    }

}
