package ex20.srp;

//종업원 - 쉐프 (의존!)

public class 종업원 {

    // static 종업원 instance1 = new 종업원();
    // static 종업원 instance2 = new 종업원(); 이게 싱글톤패턴

    public 음식 주문받기(요리사 chef) {
        음식 jjajang = chef.음식생성();
        return jjajang;
    }

}
