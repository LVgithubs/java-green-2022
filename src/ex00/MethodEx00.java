package ex00;

public class MethodEx00 {

    // 메서드
    static void add(int n1) {
        System.out.println("받은 숫자는 : " + n1);
    }

    public static void main(String[] args) {
        // 자바의 모든 코드는 class 안에 작성되어야 한다.
        MethodEx00.add(50); // 매서드 호출
    }

}
