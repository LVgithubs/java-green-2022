package ex07;

class Car {
    // static int speed = 90;
    int speed = 90;
}

public class OOPEx01 {
    // static int num = 10;

    // static 으로만 잡아야, 메인에서 들고올 수 있다.
    public static void main(String[] args) {
        /*
         * // System.out.println(speed); -이 변수를 해결할 수 없다.
         * // 왜냐면 OOPEx01 클래스에는 Car 클래스가 없기 때문.
         * System.out.println(Car.speed);
         * // Car 클래스에서
         * System.out.println(OOPEx01.num);
         * System.out.println(num);
         */
        // new Car();
        // new는 heap 에 할당 하라는 키워드다.
        // Car 클래스가 가지고 있는 static 이 아닌 모든 것들이 heap에 뜬다.
        // static 이 포함되지 않는 이유는 이미 static 이 이미 메모리에 띄워두었기 때문!
        // 굳이 한번 더 띄울 필요가 없기 때문!

        Car s1 = new Car();
        System.out.println(s1.speed);

        Car s2 = new Car();
        System.out.println(s2.speed);

        new Car();
        // 주소가 없고, 사용되지 않았기 때문에 JVM에서 garbage collecter가 쓰레기로 날려버리는 것.
    }

}
