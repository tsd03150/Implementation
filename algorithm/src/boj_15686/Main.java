package boj_15686;

import java.util.ArrayList;
import java.util.Scanner;
class Graph {
    int x;
    int y;
    Graph(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {
    static int n;
    static int m;
    static int[][] board;
    static ArrayList<Graph> home = new ArrayList<>();
    static ArrayList<Graph> pizza = new ArrayList<>();
    static int[] ch;
    static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int num) {
        if (L == m) {
            int tmp = 0;
            for (Graph obh : home) {
                int min = Integer.MAX_VALUE;
                for (int d : ch) {
                    min = Math.min(min, Math.abs(obh.x - pizza.get(d).x) + Math.abs(obh.y - pizza.get(d).y));
                }
                tmp += min;
            }
            answer = Math.min(answer, tmp);
        } else {
            for (int i = num; i < pizza.size(); i++) {
                ch[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        board = new int[n][n];
        ch = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) {
                    home.add(new Graph(i, j));
                }
                if (board[i][j] == 2) {
                    pizza.add(new Graph(i, j));
                }
            }
        }
        T.DFS(0, 0);
        System.out.println(answer);
    }
}