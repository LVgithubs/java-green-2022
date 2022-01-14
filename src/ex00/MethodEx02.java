package ex00;

class Calculator2 {

    // 투입구, 출구 둘 다 있는 메소드
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static int minus(int n1, int n2) {
        return n1 - n2;
    }

    static int multi(int n1, int n2) {
        return n1 * n2;
    }

    static int divid(int n1, int n2) {
        return n1 / n2;
    }
}

public class MethodEx02 {
    public static void main(String[] args) {
        int r1 = Calculator2.add(1000, 100);
        int r2 = Calculator2.minus(1000, 100);
        int r3 = Calculator2.multi(1000, 100);
        int r4 = Calculator2.divid(1000, 100);
        System.out.println("r1 :" + r1);
        System.out.println("r2 :" + r2);
        System.out.println("r3 :" + r3);
        System.out.println("r4 :" + r4);
    }

}
