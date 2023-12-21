package chap_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _21_Example {
    static Queue queue = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 보실 수 있습니다.");

        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();

                if ("".equals(input)) {
                    continue;
                }
                if (input.equalsIgnoreCase("quit")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help 또는 HELP: 도움말을 보실 수 있습니다.");
                    System.out.println("quit 또는 QUIT: 도움말을 보실 수 있습니다.");
                    System.out.println("history 또는 HISTORY: 최근 입력한 명령어 " + MAX_SIZE + "개를 보실 수 있습니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    saveInput(input);

                    LinkedList linkedList = (LinkedList)queue;
                    for (int i = 0; i < linkedList.size(); i++) {
                        System.out.println((i + 1) + ": " + linkedList.get(i));
                    }
                } else {
                    saveInput(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력에 오류가 발생했습니다.");
            }
        }
    }
    public static void saveInput(String input) {
        if (!"".equals(input)) {
            queue.offer(input);
        }
        if (queue.size() > MAX_SIZE) {
            queue.poll();
        }
    }
}