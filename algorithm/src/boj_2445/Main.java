package boj_2445;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a = n * 2 - 1;
        int b = n * 2;
        char[][] board = new char[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                board[i][j] = ' ';
            }
        }
        for (int i = 0; i < a; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    board[i][j] = '*';
                    board[i][b - 1 - j] = '*';
                }
            } else {
                for (int j = 0; j < b - 1 - i; j++) {
                    board[i][j] = '*';
                    board[i][b - 1 - j] = '*';
                }
            }
        }
        for (char[] tmp : board) {
            for (char c : tmp) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}