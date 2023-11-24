// 1) 여러 예외를 하나로 묶어서 사용할 경우

package chap_08;

public class _18_Example1 {
    public static void main(String[] args) {
        try {
            outerMethod();
        // 1-3-3) MyExceptionsA 발생에 따른 예외 처리
        } catch (MyExceptionsA e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 1-3-3) MyExceptionsA 발생에 따른 예외 선언
    static void outerMethod() throws MyExceptionsA {
        try {
            // 1-1) innerMethod 메서드 호출
            innerMethod();
        } catch (MyExceptionA1 e) {
            MyExceptionsA me = new MyExceptionsA("MyExceptionsA 발생");
            me.initCause(e);
            throw me;
        // 1-3) MyExceptionA2와 일치하는 catch 블럭 실행
        } catch (MyExceptionA2 e) {
            // 1-3-1) MyExceptionsA 생성 및 원인 예외 등록
            MyExceptionsA me = new MyExceptionsA("MyExceptionsA 발생");
            me.initCause(e);
            // 1-3-2) MyExceptionsA 발생
            throw me;
        }
    }

    static void innerMethod() throws MyExceptionA1, MyExceptionA2 {
        if (!methodA()) {
            throw new MyExceptionA1("MyExceptionA1 발생");
        }
        if (!methodB()) {
            // 1-2) MyExceptionA2 예외 발생
            throw new MyExceptionA2("MyExceptionA2 발생");
        }
    }

    static boolean methodA() {
        return true;
    }
    static boolean methodB() {
        return false;
    }
}

class MyExceptionA1 extends Exception {
    MyExceptionA1(String message) {
        super(message);
    }
}
class MyExceptionA2 extends Exception {
    MyExceptionA2(String message) {
        super(message);
    }
}
class MyExceptionsA extends Exception {
    MyExceptionsA(String message) {
        super(message);
    }
}

/*
chap_08.MyExceptionsA: MyExceptionsA 발생
	at chap_08._18_Example1.outerMethod(_18_Example1.java:29)
	at chap_08._18_Example1.main(_18_Example1.java:8)
Caused by: chap_08.MyExceptionA2: MyExceptionA2 발생
	at chap_08._18_Example1.innerMethod(_18_Example1.java:42)
	at chap_08._18_Example1.outerMethod(_18_Example1.java:21)
	... 1 more
*/