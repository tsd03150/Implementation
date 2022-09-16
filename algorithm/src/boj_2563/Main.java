package boj_2563;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] board = new int[100][100];
        int t = kb.nextInt();
        while (t-- > 0) {
            int n = kb.nextInt() - 1;
            int m = kb.nextInt() - 1;
            for (int i = n; i < n + 10; i++) {
                for (int j = m; j < m + 10; j++) {
                    board[i][j] = 1;
                }
            }
        }
        int answer = 0;
        for (int[] tmp : board) {
            for (int num : tmp) {
                if (num == 1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}