package boj_1100;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[][] board = new char[8][8];
        int answer = 0;
        for (int i = 0; i < 8; i++) {
            String str = kb.next();
            for (int j = 0; j < 8; j++) {
                board[i][j] = str.charAt(j);
                if (i % 2 == 0 && j % 2 == 0 && board[i][j] == 'F') {
                    answer++;
                }
                if (i % 2 != 0 && j % 2 != 0 && board[i][j] == 'F') {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}