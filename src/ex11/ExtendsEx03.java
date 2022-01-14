package ex11;

class 반려동물 {
    // 오버라이드
    void haha() {
    }
    // 어차피 이 메소드는 쓰이지 않을 것이기 때문에 선언만 해 둘 것이다.
    // abstract 추상적
}

class 강아지 extends 반려동물 {
    void haha() {
        System.out.println("멍멍");
    }

    void sound() {
        System.out.println("멍멍");
    }

}

class 고양이 extends 반려동물 {
    void haha() {
        System.out.println("야옹");
    }

    void sound() {
        System.out.println("야옹");
    }
}

// class 자동차 {
// String name = "자동차";

// void 액셀() {
// System.out.println("100km");
// }
// }

// class 스포츠카 extends 자동차 {
// String name = "스포츠카";

// }

public class ExtendsEx03 {
    static void start(반려동물 u1) {
        u1.haha();
    }

    public static void main(String[] args) {
        강아지 u1 = new 강아지();
        start(u1);
        // start(new 강아지());
        고양이 u2 = new 고양이();
        start(u2);

        // 자동차 car1 = new 스포츠카();
        // 액셀(car1);
    }

}
// 동일한메소드를 둘 다 들고 있으면(자식 부모 둘 다), 자식이 들고있는 메소드를 부모가 들고 있다면
// 부모 메소드를 오버라이딩(무효화)된다. (부모가 양보하는것)
// 따로 재정의 하는게 아니라 무효화이기 때문에 바꾸고 싶은 부분만 바꿔서 사용할 수 있기 때문에
