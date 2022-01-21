package ex20.srp;

//(손님 - 종업원 (의존성))
public class 손님 {
    public void 주문하기(종업원 manager, 요리사 chef) {
        // 매니저의 주문받기를 전달받아야한다.
        // 손님은 매니저를 책임질 이유가 없다!
        // 종업원 manager = 종업원.instance1; 이게 싱글톤패턴
        음식 jjajang = manager.주문받기(chef);
        System.out.println("손님은 " + jjajang.getName() + "을 먹습니다");
    }

}
