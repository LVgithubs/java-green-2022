package ex07;

//설계도
class 마법사 {
    // 상태.
    int HP = 30;
    int MP = 100;

    // 행위
    // 행위 안에 행위를 추가할 수 없다.
    // 행위는 메서드 이름 + () + {} 로 만들어진다.
    void drink() {
        System.out.println("에너지 마시기");
        HP = 100;
    }
}

public class OOPEx03 {
    public static void main(String[] args) {
        마법사 s1 = new 마법사();
        System.out.println("첫번째 마법사가 생성되었습니다.");

        System.out.println("HP : " + s1.HP);
        System.out.println("MP : " + s1.MP);
        s1.drink();
        // 호출시에 Stack 에 떴다가, 끝나면 사라진다.

        System.out.println(s1 + "의 HP : " + s1.HP);
        // 마법 금지 = 상태는 행위를 통해 변경한다.
        // s1.HP = 50;
        // System.out.println("체력 변경 HP : " + s1.HP);

        마법사 s2 = new 마법사();
        System.out.println("두번째 마법사가 생성되었습니다.");
        System.out.println("HP : " + s2.HP);
        System.out.println("MP : " + s2.MP);
    }

}
