package boj_14502;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {

    static int n;
    static int m;
    static int[][] board;
    static int answer = Integer.MIN_VALUE;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public void DFS(int L, int x, int y) {
        if (L == 3) {
            answer = Math.max(answer, BFS());
        } else {
            int i = x;
            int j = y;

            for (; i < n; i++) {
                for (; j < m; j++) {
                    if (board[i][j] == 0) {
                        board[i][j] = 1;
                        DFS(L + 1, i, j);
                        board[i][j] = 0;
                    }
                }
                j = 0;
            }
        }
    }

    public int BFS() {
        Queue<Point> Q = new LinkedList<>();
        int[][] cpBoard = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cpBoard[i][j] = board[i][j];
                if (cpBoard[i][j] == 2) {
                    Q.offer(new Point(i, j));
                }
            }
        }

        while (!Q.isEmpty()) {
            Point ob = Q.poll();
            for (int j = 0; j < 4; j++) {
                int nx = ob.x + dx[j];
                int ny = ob.y + dy[j];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && cpBoard[nx][ny] == 0) {
                    cpBoard[nx][ny] = 2;
                    Q.offer(new Point(nx, ny));
                }
            }
        }
        int cnt = 0;
        for (int[] tmp : cpBoard) {
            for (int num : tmp) {
                if (num == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        T.DFS(0, 0, 0);
        System.out.println(answer);
    }
}