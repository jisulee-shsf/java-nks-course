package chap_08;

import java.io.File;

public class _17_Example {
    public static void main(String[] args) {
        try {
            createFile();
        } catch (Exception e) {
            // 2-2) 두 번째 예외 처리 완료
            System.out.println("메시지: " + e.getMessage());
            System.out.println("두 번째 예외 처리 완료");
        }
    }

    static File createFile() throws Exception {
        try {
            // 1-1) 첫 번째 예외 발생
            throw new Exception("첫 번째 예외 발생");
        // 1-2) 첫 번째 예외 처리 완료
        } catch (Exception e) {
            System.out.println("메시지: " + e.getMessage());
            System.out.println("첫 번째 예외 처리 완료");
            // 2-1) 예외 되던지기로 두 번째 예외 발생
            throw new Exception("두 번째 예외 발생");
        }
    }
}

/*
메시지: 첫 번째 예외 발생
첫 번째 예외 처리 완료
메시지: 두 번째 예외 발생
두 번째 예외 처리 완료
*/