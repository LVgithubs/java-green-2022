package ex06;

public class ConEx05 {
    public static void main(String[] args) {
        int point = 81;
        if (point >= 90) {
            System.out.println("A학점입니다.");
        }
        if (point >= 80 && point < 90) {
            System.out.println("B학점입니다.");
        }
        if (point >= 70 && point < 80) {
            System.out.println("C학점입니다.");
        }
        if (point >= 60 && point < 70) {
            System.out.println("D학점입니다.");
        }
        if (point < 60) {
            System.out.println("F학점 입니다.");
        }
    }
}
