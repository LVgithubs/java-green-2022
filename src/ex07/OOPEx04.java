package ex07;

//1. 자바는 모든 코드가 Class 내부에 있어야 한다.

//만약, 따로 구분짓는 범위가 없는 언어일 경우 1급 개체가 어디인지를 구분지어야한다.
//2. 자바는 즉, Class 만 1급이다.
//3. 모든 Class는 설계도.
//4. 클래스는 상태(변수)와 행위(메소드)를 가진다.
//5. static 은 찾을때 클래스명.변수명
//6. static 이 아닌 상태를 띄우는 법 = new 클래스명 () = > heap(동적 메모리 공간) 에 뜬다.
// unmanaged 상태의 개념은 heap 에 할당한 메모리를 프로그래머가 직접 삭제해야한다.

//if for while 호출문

class Dog {
    int 배고픔 = 100; // 0 ~ 100 변수 = 상태

    void 밥먹기() { // 메소드 = 행위
        배고픔 = 0;
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.배고픔);
        d.밥먹기();
        System.out.println(d.배고픔);
    }

}
