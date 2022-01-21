package ex11;

//싱글톤 패턴
class 튜브 {

    private static 튜브 instance = new 튜브();

    private 튜브() {

    }

    public static 튜브 getInstence() {
        return instance;
    }
}

public class SingleEx01 {
    public static void main(String[] args) {
        튜브 t1 = 튜브.getInstence();
        튜브 t2 = 튜브.getInstence();

    }

}
