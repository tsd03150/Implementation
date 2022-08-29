package boj_5430;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();

        while (t-- > 0) {
            char[] cmd = kb.next().toCharArray();
            int n = kb.nextInt();
            String str = kb.next();
            str = str.substring(1, str.length() - 1);
            Deque<Integer> dQ = new ArrayDeque<>();
            for (String s : str.split(",")) {
                if (!s.equals("")) {
                    dQ.offer(Integer.parseInt(s));
                }
            }
            boolean right = false;
            boolean flag= false;
            for (char c : cmd) {
                if (c == 'R') {
                    right = !right;
                } else {
                    if (dQ.size() == 0) {
                        answer.append("error" + "\n");
                        flag = true;
                        break;
                    }
                    if (right) {
                        dQ.pollLast();
                    } else {
                        dQ.pollFirst();
                    }
                }
            }
            if (flag) {
                continue;
            }
            if (dQ.size() == 0) {
                answer.append("[]" + "\n");
            } else {
                answer.append("[");
                while (dQ.size() > 1) {
                    if (right) {
                        answer.append(dQ.pollLast() + ",");
                    } else {
                        answer.append(dQ.pollFirst() + ",");
                    }
                }
                answer.append(dQ.pollLast() +"]" + "\n");
            }
        }
        System.out.println(answer);
    }
}