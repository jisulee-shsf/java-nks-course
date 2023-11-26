package chap_09;

class ExampleClass2 {
    int value;

    ExampleClass2(int value) {
        this.value = value;
    }

    // 1) equals 메서드 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExampleClass2) {
            ExampleClass2 e = (ExampleClass2)obj;
            return (this.value == e.value);
        }
        return false;
    }
    /*
    public boolean equals(Object obj) {
        if (!(obj instanceof ExampleClass2)) {
            return false;
        }
        ExampleClass2 e = (ExampleClass2) obj;
        return (this.value == e.value);
    }
    */
}

public class _03_Example {
    public static void main(String[] args) {
        // 2-1) 두 객체의 인스턴스 변숫값이 서로 같을 때 오버라이딩한 equals 메서드로 비교한 경우
        ExampleClass2 e1 = new ExampleClass2(100);
        ExampleClass2 e2 = new ExampleClass2(100);
        System.out.println("e1.equals(e2): "+ e1.equals(e2));
        System.out.println("e1.value: " + e1.value + " / e2.value: " + e2.value);
        System.out.println("e1.toString(): " + e1 + " / e2.toString(): " + e2);
        /*
        e1.equals(e2): true
        e1.value: 100 / e2.value: 100
        e1.toString(): chap_09.ExampleClass2@75b84c92 / e2.toString(): chap_09.ExampleClass2@6bc7c054
        */

        // 2-2) 두 객체의 인스턴스 변숫값이 서로 다를 때 오버라이딩한 equals 메서드로 비교한 경우
        e2.value = 200;
        System.out.println("e1.equals(e2): "+ e1.equals(e2));
        System.out.println("e1.value: " + e1.value + " / e2.value: " + e2.value);
        System.out.println("e1.toString(): " + e1 + " / e2.toString(): " + e2);
        /*
        e1.equals(e2): false
        e1.value: 100 / e2.value: 200
        e1.toString(): chap_09.ExampleClass2@75b84c92 / e2.toString(): chap_09.ExampleClass2@6bc7c054
        */
    }
}