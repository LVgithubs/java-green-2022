package ex22;

import java.util.HashSet;

/**
 * MyInteger
 */
class MyInteger {
    int num;

    MyInteger(int num) {

    }

    public String toString() {
        return num + " ";
    }
}

public class CollectionEx02 {
    public static void main(String[] args) {

        HashSet<Integer> datas = new HashSet<>();
        datas.add(10);
        datas.add(20);
        datas.add(20);
        datas.add(30);
        datas.add(40);

        datas.remove(10);
        System.out.println(datas.size());
        System.out.println(datas);
        // MyInteger i = new MyInteger();
    }

}
