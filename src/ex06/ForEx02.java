package ex06;

public class ForEx02 {
    public static void main(String[] args) {
        int en = 1;
        for (int n = 1; n < 25; n++) {

            en = en * 2;
            if (n == 24) {
                System.out.println(en);
            }
        }
    }

}
