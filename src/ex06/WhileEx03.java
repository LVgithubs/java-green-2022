package ex06;

public class WhileEx03 {
    public static void main(String[] args) {
        // 남은 동전 구하기 게임
        int money = 2680;
        int restMoney = money;
        int coin = 500;
        /*
         * System.out.println(restMoney / 500);
         * System.out.println((restMoney % 500) / 100);
         * System.out.println((restMoney % 100) / 50);
         * System.out.println((restMoney % 50) / 10);
         */

        /*
         * // 1. 500원 동전 구하기
         * System.out.println("500원 ==========");
         * System.out.println(restMoney / 500 + "개");
         * restMoney = restMoney % 500;
         * // 2. 100원 동전 구하기
         * System.out.println("100원 ==========");
         * System.out.println(restMoney / 100 + "개");
         * restMoney = restMoney % 100;
         * // 3. 50원 동전 구하기
         * System.out.println("50원 ==========");
         * System.out.println(restMoney / 50 + "개");
         * restMoney = restMoney % 50;
         * // 4. 10원 동전 구하기
         * System.out.println("10원 ==========");
         * System.out.println(restMoney / 10 + "개");
         * restMoney = restMoney % 10;
         */
        // -> 알고리즘 = 순서대로 실행되는 로직
        // -> 분석 = 패턴이 보이면 단순화 하기 쉽다.
        // 리팩토링
        // 코드를 가독성 있게 작성해야한다.
        // 반복되는 구조가 쉽게 보일 수 있도록 작성하는게 좋다.
        // 1. 500원 동전 구하기
        System.out.println(coin + "원 ==========");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;
        // 2. 100원 동전 구하기
        coin = 100;
        System.out.println(coin + "원 ==========");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;
        // 3. 50원 동전 구하기
        coin = 50;
        System.out.println(coin + "원 ==========");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;
        // 4. 10원 동전 구하기
        coin = 10;
        System.out.println(coin + "원 ==========");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % coin;

    }

}
