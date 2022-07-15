package boj_10872;

import java.util.Scanner;

class Main {
    public int DFS(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * DFS(num - 1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.DFS(kb.nextInt()));
    }
}
