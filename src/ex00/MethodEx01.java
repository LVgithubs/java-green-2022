package ex00;

class Calculator {

    // add 뒤에 있는 () 입구
    // void 출구가 없다.
    void add(int n1, int n2) {
        // add 와 min 은 다른 공간, 즉 stack 에서 각기 다른 공간을 가지고 있기 때문에 같은 이름의 변수를 선언할 수 있다
        System.out.println("더하기 메서드 입니다.");
        System.out.println(n1 + n2);

    }

    void min(int n1, int n2) {
        System.out.println("빼기 메서드 입니다.");
        System.out.println(n1 - n2);
    }

    // 곱하기multi
    void multi(int n1, int n2) {
        System.out.println("곱하기 메서드 입니다.");
        System.out.println(n1 * n2);
    }

    // 나누기 divide
    void divide(int n1, int n2) {
        System.out.println("나누기 메서드 입니다.");
        System.out.println(n1 / n2);
    }
}

public class MethodEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(20, 90);
        c1.min(90, 20);
        c1.multi(2, 9);
        c1.divide(9, 4);
    }
}
