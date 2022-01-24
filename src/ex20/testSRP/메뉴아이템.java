package ex20.testSRP;

public class 메뉴아이템 {
    // 비용확인
    // 이름확인
    private String name;
    private int price;

    public 메뉴아이템(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
