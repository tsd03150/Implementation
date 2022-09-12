package boj_2167;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] board = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();
        while (t-- > 0) {
            int x1 = kb.nextInt();
            int y1 = kb.nextInt();
            int x2 = kb.nextInt();
            int y2 = kb.nextInt();
            int sum = 0;
            for (int i = y1; i <= y2; i++) {
                for (int j = x1; j <= x2; j++) {
                    sum += board[j][i];
                }
            }
            answer.append(sum + "\n");
        }
        System.out.println(answer);
    }
}