package boj_11050;

import java.util.Scanner;

class Main {
    static int[][] dp;

    public int DFS(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dp[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        dp = new int[n + 1][k + 1];
        System.out.println(T.DFS(n, k));
    }
}