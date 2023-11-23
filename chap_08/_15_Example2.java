// 2) RuntimeException 클래스를 상속받아 사용자 정의 예외 클래스를 작성하는 경우

package chap_08;

class MyRuntimeException2 extends RuntimeException {
    private final int ERR_CODE;

    MyRuntimeException2(String message, int code) {
        super(message);
        this.ERR_CODE = code;
    }

    MyRuntimeException2(String message) {
        super(message);
        this.ERR_CODE = 123;
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }
}

public class _15_Example2 {
    public static void main(String[] args) {
        throw new MyRuntimeException2("고의로 예외를 발생시킴");
    }
}

/*
Exception in thread "main" chap_08.MyRuntimeException2: 고의로 예외를 발생시킴
	at chap_08._15_Example2.main(_15_Example2.java:25)
*/