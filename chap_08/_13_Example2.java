// 2) 예외가 발생한 메서드에서 직접 예외 처리를 하는 경우

package chap_08;

import java.io.File;
import java.io.IOException;

public class _13_Example2 {
    public static void main(String[] args) {
        // 2-1) creatFile 메서드 호출
        File f = createFile("");
        System.out.println(f.getName() + " 파일을 생성했습니다.");
        System.out.println("프로그램 정상 종료");
    }

    // 2-2) creatFile 메서드에서 예외 발생 -> creatFile 메서드에서 직접 예외 처리
    static File createFile(String fileName) {
        if (fileName == null | fileName.equals("")) {
            try {
                throw new Exception("[Exception 발생]");
            } catch (Exception e) {
                System.out.println(e.getMessage() + " 파일 이름이 유효하지 않아 untitled 파일을 생성합니다.");
                fileName = "untitled.txt";
            }
        }
        File f = new File(fileName);
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return f;
    }
}

/*
createFile 메서드의 인수인 fileName가 ""인 경우,
[Exception 발생] 파일 이름이 유효하지 않아 untitled 파일을 생성합니다.
untitled.txt 파일을 생성했습니다.
프로그램 정상 종료

createFile 메서드의 인수인 fileName가 text.txt인 경우,
text.txt 파일을 생성했습니다.
프로그램 정상 종료
*/