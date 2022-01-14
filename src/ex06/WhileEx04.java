package ex06;

import java.util.Scanner;

public class WhileEx04 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);

        int money = 2680;
        int restMoney = money;
        while (true) {
            int coin = sc.nextInt();
            // 남은 동전을 출력하는 로직
            // 500원 , 100원 , 50원, 10원
            // 10원을 입력하면 코드가 끝나도록.
            System.out.println(coin + "원의 갯수는" + restMoney / coin + "개");
            restMoney = restMoney % coin;
            if (coin == 10) {
                break;
            }
            // if문 break
        }
    }

}
