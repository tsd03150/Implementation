package boj_2747;

import java.util.Scanner;

class Main {
    static int[] dp;

    public int DFS(int num) {
        if (dp[num] > 0) {
            return dp[num];
        }
        if (num == 0 || num == 1) {
            return num;
        } else {
            return dp[num] = DFS(num - 2) + DFS(num - 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dp = new int[n + 1];
        System.out.println(T.DFS(n));
    }
}
