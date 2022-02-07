package bubble;

import java.util.*;

public class bubble {
    public static void main(String[] args) {
        ArrayList<Integer> bubble = new ArrayList<Integer>();
        Random random = new Random();
        int n;
        // bubble.add(4);
        // bubble.add(8);
        // bubble.add(7);
        // bubble.add(2);
        // bubble.add(5);
        // bubble.add(1);
        while (bubble.size() < 6) {
            n = random.nextInt(10) + 1;
            if (bubble.contains(n) == false) {
                bubble.add(n);
            }
        }
        System.out.println(bubble);
        // 버블정렬 시작!

        // 버블 정렬은 0번째와 첫번째를 비교해서 큰 수를 다음 인덱스로 보내는 형식으로 정해진다.
        // 비교되는 숫자(0)가 비교하는 숫자(1)보다 작을 시, 비교하는 숫자(1) 는 다음 인덱스(2) 와 비교하는 형식이다.
        // if (bubble.get(0) > bubble.get(1)) {
        // bubble.set(0, bubble.get(1));
        // }
        // if (bubble.get(1) > bubble.get(2)) {
        // bubble.set(1, bubble.get(2));
        // }
        // if (bubble.get(2) > bubble.get(3)) {
        // bubble.set(2, bubble.get(3));
        // }
        // if (bubble.get(3) > bubble.get(4)) {
        // bubble.set(3, bubble.get(4));
        // }
        // if (bubble.get(4) > bubble.get(5)) {
        // bubble.set(4, bubble.get(5));
        // }
        // 이걸 한번 for문으로 바꿔보자
        int bubblenum;
        // 이 방법을 배열의 크기만큼 계속해야하니 for루프를 겹쳐보자.
        for (int x = 0; x < bubble.size(); x++) {
            // 우선은 0번째가 모두와 비교하는 형식을 for 문으로 사용해보자.
            for (int i = 0; i < bubble.size() - 1; i++) {
                if (bubble.get(i) > bubble.get(i + 1)) {
                    bubblenum = bubble.get(i);
                    bubble.set(i, bubble.get(i + 1));
                    bubble.set(i + 1, bubblenum);
                }

            }
            System.out.println(bubble);
        }
        // 4 -8 - 7 - 2 - 5 - 1
        // 4랑 8을 비교했더니 8이 더 크고
        // 8과 7을 비교했더니 7이 더 크고
        // ... 1과 8을 비교했더니 8이 더 컸다.
        // -> 4-7-2-5-1-8
        // 그 다음은
        // 4 - 2 - 5 - 1 - 7 -8
        // 2 - 4 - 1 - 5 - 7 - 8
        // 2 - 1 - 4 - 5 - 7 - 8
        // 1 - 2 - 4 - 5 - 7 - 8

        // 순으로 버블 정렬이 될 것이다.

    }
}