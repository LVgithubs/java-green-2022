package ex20.testSRP;

//바리스타와 손님을 추상클래스화!
abstract class 바리스타 {
    abstract 커피 커피생성(메뉴아이템 menuitem);

    abstract String getName();

    abstract void setName(String name);
}

class 공유 extends 바리스타 {
    private String name;

    // 커피를 만드는 일!
    // 주문에 맞는 커피를 만들어야한다!
    public 커피 커피생성(메뉴아이템 menuitem) {
        커피 coffee = new 커피(menuitem);
        return coffee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
