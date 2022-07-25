package boj_10870;

import java.util.Scanner;

class Main {

    public int DFS(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return DFS(num - 2) + DFS(num - 1);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.DFS(n));
    }
}