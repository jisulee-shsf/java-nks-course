package chap_08;

public class _12_Example {
    // 1) main 메서드에서 method1 메서드 호출
    // 5) 예외로 인해 main 메서드에서 프로그램이 비정상적으로 종료
    public static void main(String[] args) throws Exception {
        method1();
    }

    // 2) method1 메서드에서 method2 메서드 호출
    // 4) method1 메서드에서 main 메서드로 예외 넘기기
    static void method1() throws Exception {
        method2();
    }

    // 3) method2 메서드에서 예외 발생 -> method2 메서드에서 method1 메서드로 예외 넘기기
    static void method2() throws Exception {
        throw new Exception();
    }
}

/*
Exception in thread "main" java.lang.Exception
    at chap_08._12_Example.method2(_12_Example.java:18)
    at chap_08._12_Example.method1(_12_Example.java:13)
    at chap_08._12_Example.main(_12_Example.java:7)
*/
