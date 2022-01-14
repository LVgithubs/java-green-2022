package ex07;

class Car {
    // 필드정의
    String color;
    int speed;
    int gear;

    void print() {
        System.out.println("(" + color + " ," + speed + " ," + gear + " )");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "red";
        myCar.speed = 0;
        myCar.gear = 1;
        myCar.print();
    }

}
