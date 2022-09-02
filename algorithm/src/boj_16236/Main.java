package boj_16236;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Graph {
    int x;
    int y;
    int cnt;

    Graph(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

class Main {
    static int n;
    static int[][] board;
    static int[][] ch;
    static Queue<Graph> Q;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int lv = 2;
    static int exp = 0;
    static int answer;

    public void BFS() {
        while (!Q.isEmpty()) {
            Graph ob = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = ob.x + dx[i];
                int ny = ob.y + dy[i];
                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (ch[nx][ny] == 0 && board[nx][ny] <= lv) {
                        Q.offer(new Graph(nx, ny, ob.cnt + 1));
                        ch[nx][ny] = 1;
                    }
                }
            }
            if (Q.peek() != null) {
                Graph tmp = Q.peek();
                if (0 < board[tmp.x][tmp.y] && board[tmp.x][tmp.y] < lv) {
                    board[tmp.x][tmp.y] = 0;
                    ch = new int[n][n];
                    ch[tmp.x][tmp.y] = 1;
                    Q.clear();
                    Q.offer(new Graph(tmp.x, tmp.y, 0));
                    answer += tmp.cnt;
                    exp++;
                }
                if (lv == exp) {
                    lv++;
                    exp = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Q = new PriorityQueue<>((o1, o2) -> {
            if (o1.cnt == o2.cnt) {
                if (o1.x == o2.x) {
                    return o1.y - o2.y;
                }
                return o1.x - o2.x;
            }
            return o1.cnt - o2.cnt;
        });
        board = new int[n][n];
        ch = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 9) {
                    Q.offer(new Graph(i, j, 0));
                    board[i][j] = 0;
                    ch[i][j] = 1;
                }
            }
        }
        T.BFS();
        System.out.println(answer);
    }
}