package ex06;

import java.util.Scanner;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            for (int step = 1; step < 10; step++) {
                System.out.println(i + "x" + step + "=" + i * step);
                if (i == 9 && step == 9) {
                    System.out.println("구구단 끝!");
                }
            }

        }
    }

}
