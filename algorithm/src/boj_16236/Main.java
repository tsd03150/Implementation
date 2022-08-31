package boj_16236;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph {
    int x;
    int y;
    int cnt;
    int L;

    Graph(int x, int y, int cnt, int L) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
        this.L = L;
    }
}

class Main {
    static int n;
    static int[][] board;
    static int[][] ch;
    static Queue<Graph> Q = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int lv = 2;
    static int answer;

    public void BFS() {
        while (!Q.isEmpty()) {
            int len = Q.size();
            boolean flag = false;
            for (int i = 0; i < len; i++) {
                Graph ob = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = ob.x + dx[j];
                    int ny = ob.y + dy[j];
                    if (0 <= nx && nx < n && 0 <= ny && ny < n && ch[nx][ny] == 0) {
                        if (board[nx][ny] > lv) {
                            continue;
                        }
                        ch[nx][ny] = 1;
                        if (board[nx][ny] == 0 || board[nx][ny] == lv) {
                            Q.offer(new Graph(nx, ny, ob.cnt, ob.L + 1));
                        } else {
                            if (board[nx][ny] < lv) {
                                board[nx][ny] = 0;
                                ch = new int[n][n];
                                ch[nx][ny] = 1;
                                ob.cnt++;
                                Q.clear();
                                if (ob.cnt == lv) {
                                    lv++;
                                    ob.cnt = 0;
                                }
                                answer += (ob.L + 1);
                                Q.offer(new Graph(nx, ny, ob.cnt, 0));
                                flag = true;
                                break;
                            }
                        }
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        board = new int[n][n];
        ch = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 9) {
                    Q.offer(new Graph(i, j, 0, 0));
                    board[i][j] = 0;
                    ch[i][j] = 1;
                }
            }
        }
        T.BFS();
        System.out.println(answer);
    }
}