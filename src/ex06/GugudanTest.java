package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 범위를 입력하세요.===");
        int x = sc.nextInt();

        System.out.println("두번째 범위를 입력하세요.===");
        int y = sc.nextInt();

        System.out.println("첫번째 구구단");
        for (int i = 1; i < 10; i++) {
            System.out.println(x + "*" + i + " = " + x * i);
        }

        System.out.println("두번째 구구단");

        for (int i = 1; i < 10; i++) {
            System.out.println(y + "*" + i + " = " + y * i);
        }

    }

}
