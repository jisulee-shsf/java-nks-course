// 2) checked 예외를 unchecked 예외로 변경할 경우

package chap_08;

public class _18_Example2 {
    public static void main(String[] args) {
        try {
            outerMethod();
        } catch (MyExceptionsB e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void outerMethod() throws MyExceptionsB {
        try {
            innerMethod();
        // 2-2) RuntimeException 발생에 따른 예외 처리
        } catch (MyExceptionB1 e) {
            MyExceptionsB me = new MyExceptionsB("MyExceptionsB 발생");
            me.initCause(e);
            throw me;
        }
    }

    // 2-2) RuntimeException 발생에 따른 예외 선언
    static void innerMethod() throws MyExceptionB1 {
        if (!methodA()) {
            throw new MyExceptionB1("MyExceptionB1 발생");
        }
        // 2-1) checked 예외를 unchecked 예외로 변경
        if (!methodB()) {
            throw new RuntimeException("RuntimeException 발생", new MyExceptionB2("MyExceptionB2 발생"));
        }
        /*
        if (!methodB()) {
            RuntimeException re = new RuntimeException("RuntimeException 발생");
            re.initCause(new MyExceptionB2("MyExceptionB2 발생"));
            throw re;
        }
        */
    }

    static boolean methodA() {
        return true;
    }
    static boolean methodB() {
        return false;
    }
}

class MyExceptionB1 extends Exception {
    MyExceptionB1(String message) {
        super(message);
    }
}
class MyExceptionB2 extends Exception {
    MyExceptionB2(String message) {
        super(message);
    }
}

class MyExceptionsB extends Exception {
    MyExceptionsB(String message) {
        super(message);
    }
}

/*
java.lang.RuntimeException: RuntimeException 발생
	at chap_08._18_Example2.innerMethod(_18_Example2.java:34)
	at chap_08._18_Example2.outerMethod(_18_Example2.java:18)
	at chap_08._18_Example2.main(_18_Example2.java:8)
Caused by: chap_08.MyExceptionB2: MyExceptionB2 발생
	... 3 more
*/