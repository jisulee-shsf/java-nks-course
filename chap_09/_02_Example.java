package chap_09;

class ExampleClass1 {
    int value;

    ExampleClass1(int value) {
        this.value = value;
    }
}

public class _02_Example {
    public static void main(String[] args) {
        // 1) 두 객체의 객체 주솟값이 서로 다를 때 Object 클래스에 정의된 equals 메서드로 비교한 경우
        ExampleClass1 e1 = new ExampleClass1(100);
        ExampleClass1 e2 = new ExampleClass1(100);
        System.out.println("e1.equals(e2): "+ e1.equals(e2));
        System.out.println("e1.value: " + e1.value + " / e2.value: " + e2.value);
        System.out.println("e1.toString(): " + e1 + " / e2.toString(): " + e2);
        /*
        e1.equals(e2): false
        e1.value: 100 / e2.value: 100
        e1.toString(): chap_09.ExampleClass1@75b84c92 / e2.toString(): chap_09.ExampleClass1@6bc7c054
        */

        // 2) 두 객체의 객체 주솟값이 서로 같을 때 Object 클래스에 정의된 equals 메서드로 비교한 경우
        e2 = e1;
        System.out.println("e1.equals(e2): "+ e1.equals(e2));
        System.out.println("e1.value: " + e1.value + " / e2.value: " + e2.value);
        System.out.println("e1.toString(): " + e1 + " / e2.toString(): " + e2);
        /*
        e1.equals(e2): true
        e1.value: 100 / e2.value: 100
        e1.toString(): chap_09.ExampleClass1@75b84c92 / e2.toString(): chap_09.ExampleClass1@75b84c92
        */
    }
}