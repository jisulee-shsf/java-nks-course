package chap_11;

import java.util.ArrayList;
import java.util.Collections;

public class _09_Example {
    public static void main(String[] args) {
        // 1) ArrayList(int initialCapacity) // 2) boolean add(Object o)
        ArrayList list1 = new ArrayList(10);
        list1.add(1); // 1 -> new Integer(1)
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(5));
        list1.add(new Integer(3));
        list1.add(new Integer(6));
        System.out.println(list1); // [1, 4, 2, 5, 3, 6]

        // 3) List subList(int fromIndex, int toIndex) / ArrayList(Collection c)
        ArrayList list2 = new ArrayList(list1.subList(1, 5));
        System.out.println(list2); // [4, 2, 5, 3]

        // 4) void sort(List l)
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1); // [1, 2, 3, 4, 5, 6]
        System.out.println(list2); // [2, 3, 4, 5]

        // 5) boolean containsAll(Collection c)
        System.out.println(list1.containsAll(list2)); // true

        // 6) void add(int index, Object element) / 7) Object set(int index, Object element)
        list2.add("C");
        list2.add("D");
        list2.add(4, "B");
        System.out.println(list2); // [2, 3, 4, 5, B, C, D]
        list2.set(3, "A");
        System.out.println(list2); // [2, 3, 4, A, B, C, D]

        // 8) int indexOf(Object o)
        list2.add(0,"1"); // String
        list2.add(3, 1); // 1 -> new Integer(1)
        System.out.println(list2); // [1, 2, 3, 1, 4, A, B, C, D]
        System.out.println(list2.indexOf("1")); // 0
        System.out.println(list2.indexOf(1)); // 3

        // 9) boolean remove(Object o) / Object remove(int index)
        list2.add(0,"7"); // String
        list2.add(3, 7); // 1 -> new Integer(1)
        System.out.println(list2); // [7, 1, 2, 7, 3, 1, 4, A, B, C, D]

        // 9-1) String 객체 "7"을 삭제하기 위해 remove 메서드의 인수로 객체를 전달한 경우
        System.out.println(list2.remove("7")); // true
        System.out.println(list2); // [1, 2, 7, 3, 1, 4, A, B, C, D]

        // 9-2) Integer 객체 7을 삭제하기 위해 remove 메서드의 인수로 객체를 전달한 경우
        System.out.println(list2.remove(7)); // boolean remove(Object o) -> Object remove(int index)
        System.out.println(list2); // [1, 2, 7, 3, 1, 4, A, C, D] -> "B" 삭제
        System.out.println(list2.remove(new Integer(7))); // true
        System.out.println(list2); // [1, 2, 3, 1, 4, A, C, D] -> new Integer(7) 삭제

        // 10) boolean retainAll(Collection c) / boolean contains(Object o)
        System.out.println(list1); // [1, 2, 3, 4, 5, 6]
        System.out.println(list2); // [1, 2, 3, 1, 4, A, C, D]

        // 10-1) boolean retainAll(Collection c)
        list1.retainAll(list2);
        System.out.println(list1); // [1, 2, 3, 4]

        // 10-2) boolean contains(Object o) / Object get(int index)
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        System.out.println(list2); // [1, A, C, D]
    }
}