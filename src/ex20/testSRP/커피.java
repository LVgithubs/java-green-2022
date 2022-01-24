package ex20.testSRP;

public class 커피 {
    private String name;
    private int price;

    public 커피(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public 커피(메뉴아이템 menuitem) {
        this.name = menuitem.getName();
        this.price = menuitem.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
