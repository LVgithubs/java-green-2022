package ex20.testSRP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 커피주문프로그램 {
    public static void main(String[] args) {
        손님 홍길동 = new 홍길동();
        바리스타 공유 = new 공유();
        Scanner sc = new Scanner(System.in);
        String menuname = sc.nextLine();

        메뉴아이템 m1 = new 메뉴아이템("아메리카노", 1500);
        메뉴아이템 m2 = new 메뉴아이템("에스프레소", 1000);
        메뉴아이템 m3 = new 메뉴아이템("카페라떼", 2000);
        메뉴아이템 m4 = new 메뉴아이템("카라멜마끼아또", 3500);
        List<메뉴아이템> menuitem = new ArrayList<>();
        menuitem.add(m1);
        menuitem.add(m2);
        menuitem.add(m3);
        menuitem.add(m4);
        메뉴판 menu = new 메뉴판(menuitem);

        홍길동.주문하기(menuname, menu, 공유);
    }

}
