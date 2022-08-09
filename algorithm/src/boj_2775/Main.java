package boj_2775;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        StringBuilder answer = new StringBuilder();

        while (t-- > 0) {
            int k = kb.nextInt();
            int n = kb.nextInt();
            int[][] board = new int[k + 1][n];
            for (int i = 0; i < n; i++) {
                board[0][i] = i + 1;
            }

            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < n; j++) {
                    for (int l = 0; l <= j; l++) {
                        board[i][j] += board[i - 1][l];
                    }
                }
            }
            answer.append(board[k][n - 1] + "\n");
        }
        System.out.println(answer);
    }
}