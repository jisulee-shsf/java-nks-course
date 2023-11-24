// 1) Exception 클래스를 상속받는 예외 클래스를 정의하는 경우

package chap_08;

// 1-1) 예외 클래스 정의
class MyException1 extends Exception {
    private final int ERR_CODE;

    MyException1(String message, int errorCode) {
        super(message);
        this.ERR_CODE = errorCode;
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
        try {
            // 1-2) main 메서드에서 예외 발생
            throw new MyException1("고의로 예외를 발생시킴");
            // 1-3) main 메서드에서 직접 예외 처리
        } catch (MyException1 me) {
            System.out.println("메시지: " + me.getMessage());
            System.out.println("에러 코드: " + me.getERR_CODE());
            me.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}

/*
메시지: 고의로 예외를 발생시킴
에러 코드: 123
프로그램 정상 종료
chap_08.MyException1: 고의로 예외를 발생시킴
	at chap_08._16_Example1.main(_16_Example1.java:28)
*/