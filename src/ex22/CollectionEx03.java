package ex22;

import java.util.HashSet;
import java.util.Random;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> setnum = new HashSet<Integer>();

        int n = r.nextInt(2);
        System.out.println(n);
        // 1~45중에 랜덤이라면?
        for (int i = 0; i < 6; i++) {
            n = r.nextInt(45) + 1;
            setnum.add(n);
            if (setnum.size() == 6) {
                System.out.println(setnum);
                break;
            }
        }
    }

}
