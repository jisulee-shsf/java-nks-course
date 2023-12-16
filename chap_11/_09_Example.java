package chap_11;

import java.util.*;

public class _09_Example {
    public static void main(String[] args) {
        // 1. ArrayList(int initialCapacity)
        ArrayList list1 = new ArrayList(10);

        // 2. boolean add(Object o)
        list1.add(1);
        list1.add(4);
        list1.add(2);
        list1.add(new Integer(5));
        list1.add(new Integer(3));
        list1.add(new Integer(6));
        System.out.println(list1); // [1, 4, 2, 5, 3, 6]

        // 3. List subList(int fromIndex, int toIndex) / ArrayList(Collection c)
        ArrayList list2 = new ArrayList(list1.subList(1, 5));
        System.out.println(list2); // [4, 2, 5, 3]

        // 4. sort(List<T> list)
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1); // [1, 2, 3, 4, 5, 6]
        System.out.println(list2); // [2, 3, 4, 5]

        // 5. boolean containsAll(Collection c)
        System.out.println(list1.containsAll(list2)); // true

        // 6. void add(int index, Object element)
        list2.add("C");
        list2.add("D");
        list2.add(4, "B");
        System.out.println(list2); // [2, 3, 4, 5, B, C, D]

        // 7. Object set(int index, Object element)
        list2.set(3, "A");
        System.out.println(list2); // [2, 3, 4, A, B, C, D]

        // 8. int indexOf(Object o)
        list2.add(0,"1"); // String
        list2.add(3, 1); // new Integer(1) -> Integer
        System.out.println(list2); // [1, 2, 3, 1, 4, A, B, C, D]
        System.out.println("String indexOf: " + list2.indexOf("1")); // String indexOf: 0
        System.out.println("Integer indexOf: " + list2.indexOf(1)); // Integer indexOf: 3

        // 9-1. Object remove(int index)
        list2.remove(0); // String "1" 삭제
        System.out.println(list2); // [2, 3, 1, 4, A, B, C, D]
        System.out.println(list2.indexOf("1")); // -1

        // 9-2. boolean remove(Object o)
        list2.remove(new Integer(1)); // Integer "1" 삭제
        System.out.println(list2); // [2, 3, 4, A, B, C, D]
        System.out.println(list2.indexOf(1)); // -1

        // 9-3. Object remove(int index) / boolean remove(Object o)
        list2.add(0,"1"); // String
        list2.add(3, 1); // new Integer(1) -> Integer
        System.out.println(list2); // [1, 2, 3, 1, 4, A, B, C, D]
        System.out.println("String indexOf: " + list2.indexOf("1")); // String indexOf: 0
        System.out.println("Integer indexOf: " + list2.indexOf(1)); // Integer indexOf: 3

        list2.remove("1"); // Object remove(int index) 호출
        System.out.println(list2.indexOf("1")); // -1

        list2.remove(1); // Object remove(int index) 호출
        System.out.println(list2.indexOf(1)); // 1

        list2.remove(new Integer(1)); // boolean remove(Object o) 호출
        System.out.println(list2.indexOf(1)); // -1

        // 10. boolean retainAll(Collection c) / boolean contains(Object o)
        System.out.println(list1); // [1, 2, 3, 4, 5, 6]
        System.out.println(list2); // [2, 4, A, B, C, D]

        // list2에서 list1과 동일한 객체만 남기고 삭제하기
        list2.retainAll(list1);
        System.out.println(list2); // [2, 4]

        // list1에서 list2와 동일한 객체만 삭제하기
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (list2.contains(list1.get(i))) {
                list1.remove(i);
            }
        }
        System.out.println(list1); // [1, 3, 5, 6]
    }
}