package chap_08;

public class _07_Example {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            // 1) ArithmeticException 발생
            System.out.println(0 / 0);
            System.out.println(3);
            // 2) catch 블럭 확인
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) { // true
                // 3) ArithmeticException 객체의 멤버 호출
                ae.printStackTrace();
                System.out.println("메시지: " + ae.getMessage());
            }
        }
        System.out.println("프로그램 정상 종료");
    }
}

/*
1
2
메시지: / by zero
프로그램 정상 종료
java.lang.ArithmeticException: / by zero
	at chap_08._07_Example.main(_07_Example.java:9)
*/