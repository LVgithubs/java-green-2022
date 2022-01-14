package ex06;

import java.util.Scanner;

public class WhileEx01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            // System.out.println("안녕");
            // 끝없이 도는 경우 ctrl + C 하면 종료된다.
            int num = sc.nextInt();
            System.out.println("사용자 입력 : " + num);
            if (num == 0) {
                break;
                // 반복 문에서 반복을 강제로 끝낼때 쓰이는 단어 " break "
            }
        }
    }

}
