package chap_09;

public class _10_Example {
    public static void main(String[] args) {
        // 1) 길이가 0인 char 배열을 생성한 경우
        char[] cArr = new char[0]; // char[] c = {};
        // 2) String 객체를 생성한 경우
        String s = new String(cArr); // String s = new String("");

        System.out.println(cArr.length); // 0
        System.out.println("abc" + s + "def"); // abcdef
    }
}