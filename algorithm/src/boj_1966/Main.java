package boj_1966;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Paper {

    int order;
    int num;

    Paper(int order, int num) {
        this.order = order;
        this.num = num;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();

        while (t-- > 0) {
            int n = kb.nextInt();
            int m = kb.nextInt();
            Queue<Paper> Q = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int num = kb.nextInt();
                Q.offer(new Paper(i, num));
            }
            int rank = 1;
            while (!Q.isEmpty()) {
                Paper ob = Q.poll();
                boolean flag = true;

                for (Paper next : Q) {
                    if (ob.num < next.num) {
                        flag = false;
                    }
                }
                if (flag) {
                    if (ob.order == m) {
                        answer.append(rank + "\n");
                    }
                    rank++;
                } else {
                    Q.offer(ob);
                }
            }
        }
        System.out.println(answer);
    }
}