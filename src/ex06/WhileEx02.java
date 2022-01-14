package ex06;

import java.util.Scanner;
//alt + shift + O 하면 현재 없는 import 를 들고올 수 있다.

public class WhileEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int exitNum = 1;

        while (exitNum == 1) {
            // System.out.println("안녕");
            // 끝없이 도는 경우 ctrl + C 하면 종료된다.
            int num = sc.nextInt();
            System.out.println("사용자 입력 : " + num);
            if (num == 0) {
                exitNum = 2;
            }
        }
    }

}
