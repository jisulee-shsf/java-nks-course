package chap_11;

import java.util.ArrayList;

public class _10_Example {
    public static void main(String[] args) {
        // 1) ArrayList 배열에 저장된 첫 번째 객체부터 삭제할 경우
        ArrayList list1 = new ArrayList();
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(2));
        list1.add(new Integer(3));
        list1.add(null);
        System.out.println(list1); // [0, 1, 2, 3, null]

        for (int i = 0; i < list1.size(); i++) {
            list1.remove(i);
        }
        System.out.println(list1); // [1, 3]

        // 2) ArrayList 배열에 저장된 마지막 객체부터 삭제할 경우
        ArrayList list2 = new ArrayList();
        list2.add(new Integer(0));
        list2.add(new Integer(1));
        list2.add(new Integer(2));
        list2.add(new Integer(3));
        list2.add(null);
        System.out.println(list2); // [0, 1, 2, 3, null]

        for (int i = list2.size() - 1; i >= 0; i--) {
            list2.remove(i);
        }
        System.out.println(list2); // []
    }
}