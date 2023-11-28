package chap_09;

import java.util.Objects;

class ExampleClass3 {
    int value;

    ExampleClass3(int value) {
        this.value = value;
    }
}

class ExampleClass4 {
    int value;

    ExampleClass4(int value) {
        this.value = value;
    }

    // 2-2) hashCode 메서드 오버라이딩
    public int hashCode() {
        return Objects.hash(value);
    }

    // 2-1) equals 메서드 오버라이딩
    public boolean equals(Object obj) {
        if (!(obj instanceof ExampleClass4)) {
            return false;
        }
        ExampleClass4 e = (ExampleClass4)obj;
        return (this.value == e.value);
    }
}

public class _06_Example1 {
    public static void main(String[] args) {
        // 1) equals 메서드와 hashCode 메서드를 오버라이딩하지 않은 경우
        ExampleClass3 e1 = new ExampleClass3(100);
        ExampleClass3 e2 = new ExampleClass3(100);
        System.out.println("e1.equals(e2): " + e1.equals(e2));
        System.out.println("e1.hashCode(): " + e1.hashCode() + " / e2.hashCode(): " + e2.hashCode());
        System.out.println("System.identityHashCode(e1): " + System.identityHashCode(e1)
                + " / System.identityHashCode(e2): " + System.identityHashCode(e2));
        /*
        e1.equals(e2): false
        e1.hashCode(): 1975012498 / e2.hashCode(): 1808253012
        System.identityHashCode(e1): 1975012498 / System.identityHashCode(e2): 1808253012
        */

        // 3) equals 메서드와 hashCode 메서드를 오버라이딩한 경우
        ExampleClass4 e3 = new ExampleClass4(100);
        ExampleClass4 e4 = new ExampleClass4(100);
        System.out.println("e3.equals(e4): " + e3.equals(e4));
        System.out.println("e3.hashCode(): " + e3.hashCode() + " / e4.hashCode(): " + e4.hashCode());
        System.out.println("System.identityHashCode(e3): " + System.identityHashCode(e3)
                + " / System.identityHashCode(e4): " + System.identityHashCode(e4));
        /*
        e3.equals(e4): true
        e3.hashCode(): 131 / e4.hashCode(): 131
        System.identityHashCode(e3): 589431969 / System.identityHashCode(e4): 1252169911
        */
    }
}