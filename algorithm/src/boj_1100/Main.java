package boj_1100;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String str = kb.next();
            for (int j = 0; j < 8; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        int answer = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j += 2) {
                if (board[i][j] == 'F' && board[i + 1][j] == '.') {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
