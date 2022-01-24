package ex20.testSRP;

import java.util.List;

public class 메뉴판 {
    // static 메뉴판 menu = new 메뉴판();
    private List<메뉴아이템> menuitem;

    public 메뉴판(List<메뉴아이템> menuitem) {
        this.menuitem = menuitem;
    }

    public 메뉴아이템 메뉴선택(String name) {
        for (메뉴아이템 item : menuitem) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

}
