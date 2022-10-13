package boj_10798;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[][] board = new char[5][15];
        for (int i = 0; i < 5; i++) {
            char[] tmp = kb.next().toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                board[i][j] = tmp[j];
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == '\0') {
                    continue;
                }
                answer.append(board[j][i]);
            }
        }
        System.out.println(answer);
    }
}