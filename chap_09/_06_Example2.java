package chap_09;

class ExampleClass5 {
    int value;

    ExampleClass5(int value) {
        this.value = value;
    }
}

class ExampleClass6 extends ExampleClass5 {
    ExampleClass6(int value) {
        super(value);
    }

    // 2) toString 메서드 오버라이딩
    public String toString() {
        return "value = " + value;
    }
}

public class _06_Example2 {
    public static void main(String[] args) {
        // 1) Object 클래스에 정의된 toString 메서드를 사용한 경우
        ExampleClass5 e1 = new ExampleClass5(100);
        System.out.println(e1.toString()); // chap_09.ExampleClass5@75b84c92

        // 3) 오버라이딩한 toString 메서드를 사용한 경우
        ExampleClass6 e2 = new ExampleClass6(100);
        System.out.println(e2.toString()); // value = 100
    }
}