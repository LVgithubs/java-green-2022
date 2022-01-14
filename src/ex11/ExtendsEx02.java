package ex11;

class 동물 {
    String name = "동물";
    int hp = 100;
    int attack = 15;

    int HPanimal() {
        return hp;
    }

    String NameAn() {
        return name;
    }

    int AttAn() {
        return attack;
    }

    void After(동물 b) {
        hp = hp - b.AttAn();
    }

}

class 사자 extends 동물 {
    String name = "사자";
    int hp = 100;
    int attack = 10;

    int HPanimal() {
        return hp;
    }

    String NameAn() {
        return name;
    }

    int AttAn() {
        return attack;
    }

    void After(동물 b) {
        hp = hp - b.AttAn();
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
    int hp = 100;
    int attack = 15;

    int HPanimal() {
        return hp;
    }

    String NameAn() {
        return name;
    }

    int AttAn() {
        return attack;
    }

    void After(동물 b) {
        hp = hp - b.AttAn();
    }
}

class 곰 extends 동물 {
    String name = "곰";
    int hp = 100;
    int attack = 50;

    int HPanimal() {
        return hp;
    }

    String NameAn() {
        return name;
    }

    int AttAn() {
        return attack;
    }

    void After(동물 b) {
        hp = hp - b.AttAn();
    }
}

// 오버라이딩(무효화)으로 -부모에서 자식으로 내려가서 데이터를 초기화하는것.

// 공격하기 메소드 만들어보기
public class ExtendsEx02 {
    static void attack(동물 unit1, 동물 unit2) {
        System.out.println(unit2.NameAn() + " 은 " + unit1.NameAn() + " 에게 공격당하고 있습니다.");
        unit2.After(unit1);
        System.out.println(unit2.NameAn() + " 의 hp : " + unit2.HPanimal());
    }

    public static void main(String[] args) {
        사자 lion = new 사자();
        호랑이 tiger = new 호랑이();
        곰 bear = new 곰();

        attack(lion, tiger);
        attack(tiger, bear);
        attack(bear, lion);
        attack(bear, lion);

    }

}
