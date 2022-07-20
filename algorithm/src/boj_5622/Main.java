package boj_5622;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] ch = kb.next().toCharArray();
        int answer = 0;
        for (int i = 0; i < ch.length; i++) {
            int num = ch[i] - 'A';
            if (0 <= num && num <= 2) {
                answer += 3;
            } else if (3 <= num && num <= 5) {
                answer += 4;
            } else if (6 <= num && num <= 8) {
                answer += 5;
            } else if (9 <= num && num <= 11) {
                answer += 6;
            } else if (12 <= num && num <= 14) {
                answer += 7;
            } else if (15 <= num && num <= 18) {
                answer += 8;
            } else if (19 <= num && num <= 21) {
                answer += 9;
            } else if (22 <= num && num <= 25) {
                answer += 10;
            }
        }
        System.out.println(answer);
    }
}
