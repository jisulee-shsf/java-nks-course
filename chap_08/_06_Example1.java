package chap_08;

public class _06_Example1 {
    public static void main(String[] args) {
        System.out.print(1 + " / ");
        try {
            System.out.print(2 + " / ");
            // 1) ArithmeticException 발생
            System.out.print(0 / 0);
            System.out.print(3 + " / ");
        // 2) catch 블럭 확인1
        } catch (ClassCastException ce) { // if (ce instanceof ArithmeticException) -> false
            System.out.print(4 + " ");
        // 3) catch 블럭 확인2 -> 예외 처리
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) // true
                System.out.print("ae instanceof ArithmeticException -> true" + " / ");
            System.out.print(5 + " / ");
        }
        System.out.println("프로그램 정상 종료");
        /*
        1 / 2 / ae instanceof ArithmeticException -> true / 5 / 프로그램 정상 종료
        */
    }
}