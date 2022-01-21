package ex22;

class 사과 {

}

class 딸기 {

}

class ResponseBox<T> {
    // 커스텀 자료형
    T data;

    public ResponseBox(T data) {
        this.data = data;
    }

}

public class GenericEx01 {
    public static void main(String[] args) {
        // ResponseBox rb = new ResponseBox(new 사과());
        // 이렇게 되면 리턴 타입이 무조껀 ResponseBox 가 된다.
        // 사과만 전달할 수 있게 된다.

        ResponseBox rb1 = new ResponseBox<사과>(new 사과());
        ResponseBox rb2 = new ResponseBox<딸기>(new 딸기());
    }

}
