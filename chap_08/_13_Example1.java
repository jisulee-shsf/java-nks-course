// 1) 호출한 메서드로 예외를 넘기는 경우

package chap_08;

import java.io.File;

public class _13_Example1 {
    public static void main(String[] args) {
        try {
            // 1-1) creatFile 메서드 호출
            File f = createFile("");
        // 1-3) main 메서드에서 예외 처리
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 파일 이름이 유효하지 않아 untitled 파일을 생성합니다.");
            String fileName = "untitled.txt";
            try {
                File f = createFile(fileName);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("프로그램 정상 종료");
    }

    // 1-2) creatFile 메서드에서 예외 발생 -> creatFile 메서드에서 main 메서드로 예외 넘기기
    static File createFile(String fileName) throws Exception {
        if (fileName == null | fileName.equals("")) {
            throw new Exception("[Exception 발생]");
        }
        File f = new File(fileName);
        f.createNewFile();
        System.out.println(f.getName() + " 파일을 생성했습니다.");
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