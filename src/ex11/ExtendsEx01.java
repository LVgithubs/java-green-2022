package ex11;

class 라면 {
    int kcal = 300;
    String color = "노란색";
    String type = "국물";
}

class 매운라면 extends 라면 {
    // int kcal = 300;
    String color = "빨란색";
    // String type = "국물";
    String type2 = "고춧가루";

    // 둘 다 메모리에 뜨는데, 공간이 나뉘어져있는것처럼 만들어진다.

}

public class ExtendsEx01 {

    public static void main(String[] args) {
        라면 s1 = new 라면();
        매운라면 s2 = new 매운라면();

        라면 s3 = new 매운라면();
        System.out.println(s3.type);
        System.out.println(s2.color);

    }
}