// 2) RuntimeException 클래스를 상속받는 사용자 정의 예외 클래스를 정의하는 경우

package chap_08;

// 2-1) 사용자 정의 예외 클래스 정의
class MyException2 extends RuntimeException {
    private final int ERR_CODE;

    MyException2(String message, int errorCode) {
        super(message);
        this.ERR_CODE = errorCode;
    }

    MyException2(String message) {
        super(message);
        this.ERR_CODE = 123;
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }
}

public class _16_Example2 {
    public static void main(String[] args) {
        // 2-2) main 메서드에서 예외 발생
        throw new MyException2("고의로 예외를 발생시킴");
    }
}

/*
Exception in thread "main" chap_08.MyException2: 고의로 예외를 발생시킴
    at chap_08._16_Example2.main(_16_Example2.java:27)
*/