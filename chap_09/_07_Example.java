package chap_09;

public class _07_Example {
    public static void main(String[] args) {
        // 1) String 객체 생성
        String s1 = "abc";
        String s2 = "def";
        // 2) 덧셈 연산자를 사용해 문자열을 결합한 경우
        s1 = s1 + s2;
        System.out.println(s1); // abcdef
    }
}