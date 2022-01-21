package ex22;

import java.util.*;

class Lists {
    Lists(Set<Integer> a) {

    }

}

// 1. 6개의 로또 번호를 정한다.
// 2. Scanner 로 금액을 입력받는다 - ex - 5000원은 5번
// 3. 입력 받은 금액에 따라 5000원이면 ArrayList 에 Hashset<Integer>로 담기
// 4.당첨됬는지 확인하기
public class CollectionTest01 {
    public static void main(String[] args) {

        Random r = new Random();
        Set<Integer> setnum = new HashSet<Integer>();
        ArrayList<Set> lotto = new ArrayList<Set>();
        Scanner insert = new Scanner(System.in);
        // int money = insert.nextInt();
        int number;

        // while (lotto.size() == money / 1000) {
        while (true) {
            number = r.nextInt(45) + 1;
            setnum.add(number);
            if (setnum.size() == 6) {
                System.out.println(setnum);
                lotto.add(setnum);
                setnum.removeAll(lotto);
                break;
            }
        }

        System.out.println(lotto);
        System.out.println(setnum);

    }
    // }
    //
}
