package ex06;

public class ConEx03 {
    public static void main(String[] args) {
        // else if (조건) = 위쪽에서 if 문에서 false 문이 나왔을때, 그 중에서도 이러한 조건이라면~ 에 해당되는 문장을 이용하고
        // 싶을때
        // 그게 아니라 ~라면,
        int point = 81;
        if (point >= 90) {
            System.out.println("A학점입니다.");
        } else if (point >= 80) {
            System.out.println("B학점입니다.");
        } else if (point >= 70) {
            System.out.println("C학점입니다.");
        } else if (point >= 60) {
            System.out.println("D학점입니다.");
        } else {
            System.out.println("F학점 입니다.");
        }
    }// main 끝
}
