package chap_09;

class ExampleClass5 {
    int value;

    ExampleClass5(int value) {
        this.value = value;
    }

    // 1) toString 메서드 오버라이딩
    public String toString() {
        return "value = " + value;
    }
}

public class _06_Example2 {
    public static void main(String[] args) {
        // 2) 객체의 인스턴스 변숫값을 문자열로 변환해 반환한 경우
        ExampleClass5 e = new ExampleClass5(100);
        System.out.println(e); // value = 100
    }
}