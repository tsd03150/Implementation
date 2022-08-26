package boj_5430;

import java.util.*;

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
            Deque<Integer> Q = new LinkedList<>();
            for (String tmp : str.split(",")) {
                if (!tmp.equals("")) {
                    Q.offer(Integer.parseInt(tmp));
                }
            }
            boolean right = false;
            boolean flag = false;
            for (char c : cmd) {
                if (c == 'R') {
                    right = !right;
                } else {
                    if (Q.isEmpty()) {
                        answer.append("error" + "\n");
                        flag = true;
                        break;
                    }
                    if (right) {
                        Q.pollLast();
                    } else {
                        Q.pollFirst();
                    }
                }
            }
            if (!flag) {
                if (Q.isEmpty()) {
                    answer.append("[]" + "\n");
                } else {
                    answer.append("[");
                    if (!right) {
                        while (Q.size() > 1) {
                            answer.append(Q.pollFirst() + ",");
                        }
                    } else {
                        while (Q.size() > 1) {
                            answer.append(Q.pollLast() + ",");
                        }
                    }
                    answer.append(Q.pollFirst() + "]" + "\n");
                }
            }
        }
        System.out.println(answer);
    }
}