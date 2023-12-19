package chap_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _18_Example {
    public static void main(String[] args) {
        // 1) Stack 클래스로 구현한 Stack
        Stack stack = new Stack();
        stack.push("0");
        stack.push("1");
        stack.push("2");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // 2 1 0
        }
        System.out.println();

        // 2) Queue 인터페이스를 구현한 LinkedList 클래스로  Queue
        Queue queue = new LinkedList();
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // 0 1 2
        }
    }
}