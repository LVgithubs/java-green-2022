package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {

    public static void main(String[] args) {
        Doctor Hong = new Doctor();
        System.out.println("이름  : " + Hong.name);
        System.out.println("월급 : " + Hong.sal);
    }

}
