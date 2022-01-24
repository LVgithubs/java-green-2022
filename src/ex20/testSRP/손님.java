package ex20.testSRP;

abstract class 손님 {
    abstract void 주문하기(String name, 메뉴판 menu, 바리스타 barista);

    abstract String getName();

    abstract void setName(String name);
}

class 홍길동 extends 손님 {
    private String name = "홍길동";

    public void 주문하기(String name, 메뉴판 menu, 바리스타 barista) {
        // 손님은 커피를 주문해야한다.
        // 커피를 주문했는데 만약 없는 커피라면 주문할 수 없다.
        메뉴아이템 m1 = menu.메뉴선택(name);
        // System.out.println(name + "을 주문했습니다.");

        if (m1 == null) {
            System.out.println("잘못된 주문입니다.");
        }
        // System.out.println(m1);
        커피 coffee = barista.커피생성(m1);
        System.out.println(this.name + "은" + coffee.getPrice() + "원 " + coffee.getName() + "를 받았습니다.");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}