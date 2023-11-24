// 1) Exception 클래스를 상속받는 사용자 정의 예외 클래스를 정의하는 경우

package chap_08;

// 1-1) Exception 클래스를 상속받는 경우
class MyException1 extends Exception {
    private final int ERR_CODE;

    MyException1(String message, int code) {
        super(message);
        this.ERR_CODE = code;
    }

    MyException1(String message) {
        super(message);
        this.ERR_CODE = 123;
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }
}

public class _16_Example1 {
    public static void main(String[] args) {
        // 1-2) 고의로 예외를 발생시킨 경우
        // throw new MyRuntimeException1("고의로 예외를 발생시킴"); -> 에러 발생
        try {
            throw new MyException1("고의로 예외를 발생시킴");
        } catch (MyException1 me) {
            System.out.println("메시지: " + me.getMessage());
            System.out.println("에러 코드: " + me.getERR_CODE());
            me.printStackTrace();
        }
    }
}

/*
메시지: 고의로 예외를 발생시킴
에러 코드: 123
chap_08.MyException1: 고의로 예외를 발생시킴
	at chap_08._16_Example1.main(_16_Example1.java:29)
*/