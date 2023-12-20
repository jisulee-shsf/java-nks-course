package chap_11;

import java.util.EmptyStackException;
import java.util.Stack;

public class _20_Example {
    public static void main(String[] args) {
        // 괄호를 검사하는 Stack 구현
        Stack stack = new Stack();
        String expression = "(((())))";

        try {
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                if (c == '(') {
                stack.push('(');
                } else if (c == ')') {
                stack.pop();
                }
            }
            if (stack.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("더 이상 추출할 괄호가 없습니다.");
        }
    }
}