package ex22;

import java.util.*;

public class CollectionExArray {
    public static void main(String[] args) {
        ArrayList<Integer> lotto = new ArrayList<Integer>();
        Random random = new Random();
        int n;
        while (lotto.size() < 6) {
            n = random.nextInt(45) + 1;
            if (lotto.indexOf(n) == 1) {

            } else
                lotto.add(n);
        }
        System.out.println(lotto);
    }

}
