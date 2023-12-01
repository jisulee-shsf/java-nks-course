package chap_09;

public class _08_09_Example {
    public static void main(String[] args) {
        // 1-1) 문자열 리터럴을 지정해 문자열을 만드는 경우
        String s1 = "abc"; // constant pool에 "abc" 저장
        String s2 = "abc"; // constant pool의 "abc" 재사용

        // 1-2) String 클래스의 생성자를 사용해 문자열을 만드는 경우
        String s3 = new String("abc");
        String s4 = new String("abc");

        // 2-1) 등가 비교 연산자를 사용해 문자열을 비교한 경우
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4); // false

        // 2-2) equals 메서드를 사용해 문자열을 비교한 경우
        System.out.println(s1.equals(s2)); // true
        System.out.println(s3.equals(s4)); // true
    }
}